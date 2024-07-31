package ModelView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;


public class FirebaseSaveObject {
    
    private FirebaseDatabase firebaseDatabase;
    
     public FirebaseSaveObject() throws FileNotFoundException {
        initFirebase();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Item item = new Item();
        item.setId(10L);
        item.setNombre("PuercoArana");
        item.setedad(15);
        
        Item item2 = new Item();
        item2.setId(100L);
        item2.setNombre("PuercoElefante");
        item2.setedad(10);
 
        // save item objec to firebase.
        FirebaseSaveObject FirebaseConexion = new FirebaseSaveObject();
        FirebaseConexion.save(item,item.getNombre());
        FirebaseConexion.save(item2,item2.getNombre());
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
     * @param item 
     */
    private void save(Item item,String nombre) throws FileNotFoundException {
        if (item != null) {
            
            /* Get database root reference */
            DatabaseReference databaseReference = firebaseDatabase.getReference("/");
            
            /* Get existing child or will be created new child. */
            DatabaseReference childReference = databaseReference.child(item.getNombre());

            /**
             * The Firebase Java client uses daemon threads, meaning it will not prevent a process from exiting.
             * So we'll wait(countDownLatch.await()) until firebase saves record. Then decrement `countDownLatch` value
             * using `countDownLatch.countDown()` and application will continues its execution.
             */
            CountDownLatch countDownLatch = new CountDownLatch(1);
            childReference.setValue(item, new DatabaseReference.CompletionListener() {

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
}
//Realizar la recuperacion de informacion
//perfeccionar el metodo en que se realiza una operacion, suprimir el conteo regresivo