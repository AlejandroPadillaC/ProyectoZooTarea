
package zoologico;

import javax.swing.JOptionPane;

/**
 * @author Alejandro Padilla
 */
public class TrabajaAlimento extends Zoo {

    public static TrabajaAlimento Trabaja1 = new TrabajaAlimento();
    
    @Override
    public void Trabajar(){
        JOptionPane.showMessageDialog(null,"El especialista en alimentacion y cuidado esta alimentando y organizando las jaulas de los animales registrados");
    }

    @Override
    public void Reabastecer() {
        JOptionPane.showMessageDialog(null, "El especialista en alimentacion y cuidado esta reabasteciendo los insumos necesarios para el bienestar de los animales registrados");
    }

    @Override
    public void Monitorear() {
        JOptionPane.showMessageDialog(null, "El especialista en alimentacion y cuidado esta monitoreando la efectividad del alimento suministrado a los animales registrados ");
    } 
    
}
