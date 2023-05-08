package automotor1;
class Automotor{
    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedula, String marca, int anio, double valorVehiculo) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valorVehiculo = valorVehiculo;
    }
    //set

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    
    public void CalcularValorMatricula(){
        this.valorMatricula=(this.valorVehiculo*0.00002)*(2023-this.anio);
    }
    //get

    public String getCedula() {
        return cedula;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }
    public String toString(){
        String msj=String.format("DATOS AUTOMOTOR: "
                +"%nCedula: %s"
                +"%nMarca: %s"
                +"%nAnio: %d"
                +"%nValor del Vehiculo: %.2f"
                +"%nValor de la Matricula: %.2f"
                ,this.cedula,this.marca,this.anio,this.valorVehiculo,this.valorMatricula);
        
        return msj;
    }
    
}
public class Automotor1 {
    public static void main(String[] args) {
        Automotor automotor1 = new Automotor("1103475578","Suzuqui", 1980, 28500);
        automotor1.CalcularValorMatricula();
        System.out.println(automotor1);
    }
    
}
