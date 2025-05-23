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

    public String gettipo(){
        return tipo;
    }
    public String getcilindraje(){
        return cilindraje;
    }
    public String getpotencia(){
        return potencia;
    }

    public void settipo (String tipo){
        this.tipo = tipo;
    }
    public void setcilindraje (String cilindraje){
        this.cilindraje = cilindraje;
    }
    public void setpotencia (String potencia){
        this.potencia = potencia;
    }
}