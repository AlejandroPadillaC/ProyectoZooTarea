
package zoologico;

import javax.swing.JOptionPane;

public class TrabajaSalud extends Zoo {
    
    public static TrabajaSalud Trabaja2 = new TrabajaSalud();
   
    @Override
    public void Trabajar(){
        JOptionPane.showMessageDialog(null, "El especialista en salud esta revisando el estado de salud de los animales registrados");
    }

    @Override
    public void Reabastecer() {
        JOptionPane.showMessageDialog(null, "El especialista en salud esta reabasteciendo los suplementos medicos necesarios");
    }

    @Override
    public void Monitorear() {
        JOptionPane.showMessageDialog(null,"El especialista en salud esta monitoreando el estado de salud de los animales");
    }      
}
