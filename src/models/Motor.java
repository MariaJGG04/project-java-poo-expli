package models;

public class Motor {

    private String tipo;
    private String cilindraje;
    private String potencia;

    public Motor () {}

    public Motor (String tipo, String cilindraje, String potencia) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.potencia = potencia;
    }

    public void displayInfo(){
        System.err.println("Motor Information:");
        System.err.println("Tipo: " + tipo);
        System.err.println("Cilindraje: " + cilindraje);
        System.err.println("Potencia: " + potencia);
    }
}