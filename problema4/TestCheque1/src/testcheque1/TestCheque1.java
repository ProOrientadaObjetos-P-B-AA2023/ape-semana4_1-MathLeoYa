
package testcheque1;
class Cheque{
    private String nombreCliente;
    private String nombreBanco;
    private double valor;
    private double comision;

    public Cheque() {}

    public Cheque(String nombreCliente, String nombreBanco, double valor) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valor = valor;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void calcularComision() {
        this.comision = this.valor * 0.00003;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValor() {
        return valor;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public String toString() {
        String msj= String.format("DATOS DEL CHEQUE: "
                +"%nNombre del cliente: %s"
                +"%nNombre del banco %s"
                +"%nComision %.2f"
                ,this.nombreCliente,this.nombreBanco,this.comision);
        return msj;
    }
    
}

public class TestCheque1 {

    public static void main(String[] args) {
        Cheque cheque1 = new Cheque("chivo","Banco de Loja",1000000);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
    
}
