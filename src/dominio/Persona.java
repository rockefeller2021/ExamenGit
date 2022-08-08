package dominio;

//informacion para la rama dev

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    private int NumTelefono;

    private int cedula;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    public int getNumTelefono() {
        return NumTelefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNumTelefono(int numTelefono) {
        NumTelefono = numTelefono;


    }
}
