/*
 * Desarrollar el tema de Jswing que usted seleccione (parejas)
    Debe subir 6 versiones del codigo en github
    Aproveche y repase para el parcial
    
 */
package zoologico;

import ModelView.FirebaseSaveObject;
import Views.*;
import java.io.FileNotFoundException;
import Views.Tabla;

public class Zoologico {
    
    public static Tabla tablaGlobal = new Tabla();

    public static void main(String[] args) throws FileNotFoundException {

        LogIn Ingreso = new LogIn();
        Ingreso.setVisible(true);
        Ingreso.setLocationRelativeTo(null);;
            
    }  
}
