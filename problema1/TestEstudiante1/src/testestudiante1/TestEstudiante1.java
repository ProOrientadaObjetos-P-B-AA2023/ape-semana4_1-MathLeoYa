
package testestudiante1;
class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante() {}
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void CalcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3)/3;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String msj=String.format("DATOS DEL ESTUDIANTE: "
                +"%nNombre: %s"
                +"%nNota 1: %.2f"
                +"%nNota 2: %.2f"
                +"%nNota 3: %.2f"
                +"%nPromedio: %.2f"
                ,this.nombre,this.nota1,this.nota2,this.nota3,this.promedio);
        return msj;
    }
    
}

public class TestEstudiante1 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("chivin",9.3,5.6,8.5);
        estudiante1.CalcularPromedio();
        System.out.println(estudiante1);
    }
    
}
