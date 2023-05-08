
package testprofesor;

class Profesor{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesor() {}
    
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico*0.2);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public String toString() {
        String msj=String.format("DATOS DEL PROFESOR:"
                +"%nNombre: %s"
                +"%nApellido: %s"
                +"%nCedula: %s"
                +"%nSueldo Basico: %.2f"
                +"%nSueldo Total: %.2f"
                ,this.nombre,this.apellido,this.cedula,this.sueldoBasico,this.sueldoTotal);
        return msj;
    }
    
}
public class TestProfesor {
    public static void main(String[] args) {
        Profesor profesor1=new Profesor("chivito","Jimenez",100,"1105833303");
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
    
}
