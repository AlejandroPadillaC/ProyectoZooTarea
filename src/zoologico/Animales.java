
package zoologico;

public class Animales{
    
    private String nombre;
    private String TipAnimal;
    private String edad;
    private String peso;
    private String alimento;
    private String jaula;

    public Animales(String nombre, String TipAnimal, String edad, String peso, String alimento, String jaula) {
        this.nombre = nombre;
        this.TipAnimal = TipAnimal;
        this.edad = edad;
        this.peso = peso;
        this.alimento = alimento;
        this.jaula = jaula;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipAnimal() {
        return TipAnimal;
    }
    public String getEdad() {
        return edad;
    }
    public String getPeso() {
        return peso;
    }
    public String getAlimento() {
        return alimento;
    }
    public String getJaula() {
        return jaula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipAnimal(String TipAnimal) {
        this.TipAnimal = TipAnimal;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public void setJaula(String jaula) {
        this.jaula = jaula;
    }
     
}
