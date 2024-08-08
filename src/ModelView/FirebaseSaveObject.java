package ModelView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import zoologico.*;


public class FirebaseSaveObject {
    
    public static FirebaseSaveObject conexionglobal;
    private FirebaseDatabase firebaseDatabase;
    
    static {
        try {
            conexionglobal = new FirebaseSaveObject();
        } catch (IOException e) {
            System.err.println("Error al inicializar FirebaseSaveObject: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public FirebaseSaveObject() throws FileNotFoundException {
        initFirebase();
    }
    
// Metodo que conecta con la base de datos 
    public void initFree() throws FileNotFoundException{
        initFirebase();
    }
    
    private void initFirebase() throws FileNotFoundException {
        try {
            
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://bdatos1-e3869-default-rtdb.firebaseio.com/")
                    
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\Flia_Padilla_Camargo\\Downloads\\firebase\\bdatos1-e3869-firebase-adminsdk-7mv22-69efc7a9ae.json")))

                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDatabase = FirebaseDatabase.getInstance();
            System.out.println("Conexión exitosa....");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
         
    }

    /**
     * Save item object in Firebase.
     * @param animal
     * @param nombre
     * 
     */
    
    public void saveFree(Animales animal,String nombre)throws FileNotFoundException{
        save(animal, nombre);
    }
    
    public void deleteFree(Animales animal, String nombre) throws FileNotFoundException{
        delete(animal, nombre);
    }
    private void save(Animales animal,String nombre) throws FileNotFoundException {
        if (animal != null) {
            
            /* Get database root reference */
            DatabaseReference databaseReference = firebaseDatabase.getReference("/");
            
            /* Get existing child or will be created new child. */
            DatabaseReference childReference = databaseReference.child(animal.getNombre());

            /**
             * The Firebase Java client uses daemon threads, meaning it will not prevent a process from exiting.
             * So we'll wait(countDownLatch.await()) until firebase saves record. Then decrement `countDownLatch` value
             * using `countDownLatch.countDown()` and application will continues its execution.
             */
            CountDownLatch countDownLatch = new CountDownLatch(1);
            childReference.setValue(animal, new DatabaseReference.CompletionListener() {

                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {
                    System.out.println("Registro guardado!");
                    // decrement countDownLatch value and application will be continues its execution.
                    countDownLatch.countDown();
                }
            });
            try {
                //wait for firebase to saves record.
                countDownLatch.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void delete(Animales animal, String nombre) throws FileNotFoundException{
        if (animal != null) {
            /* Get database root reference */
            DatabaseReference databaseReference = firebaseDatabase.getReference("/");
            /* Get existing child or will be created new child. */
            DatabaseReference childReference = databaseReference.child(animal.getNombre());
            /**
             * The Firebase Java client uses daemon threads, meaning it will not prevent a process from exiting.
             * So we'll wait(countDownLatch.await()) until firebase saves record. Then decrement `countDownLatch` value
             * using `countDownLatch.countDown()` and application will continues its execution.
             */
            CountDownLatch countDownLatch = new CountDownLatch(1);
            //En esta linea se utiliza un metodo de la libreria de firebase para eliminar o poner un valor. 
            childReference.removeValue(new DatabaseReference.CompletionListener() {

                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {
                    System.out.println("Registro eliminado!");
                    // decrement countDownLatch value and application will be continues its execution.
                    countDownLatch.countDown();
                }
            });
            try {
                //wait for firebase to saves record.
                countDownLatch.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void showDataInJTable(JTable jTable) {
    DatabaseReference databaseReference = firebaseDatabase.getReference("/");
    databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
            tableModel.setRowCount(0); // clear the table
            for (DataSnapshot childSnapshot : dataSnapshot.getChildren()) {
                Animales animal = childSnapshot.getValue(Animales.class);
                tableModel.addRow(new Object[]{animal.getNombre(), animal.getTipAnimal(), animal.getEdad(), animal.getPeso(), animal.getAlimento(), animal.getJaula()});
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            System.out.println("Error: " + databaseError.getMessage());
        }
    });
}
}

    
//Realizar la recuperacion de informacion
//perfeccionar el metodo en que se realiza una operacion, suprimir el conteo regresivo