package models;

public class Chasis {

    private String tipo;
    private String dimensiones;
    private String peso;

    public Chasis () {}

    public Chasis (String tipo, String dimensiones, String peso) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }  

    public void displayInfo(){
        System.err.println("Chasis Information:");
        System.err.println("Tipo: " + tipo);
        System.err.println("Dimensiones: " + dimensiones);
        System.err.println("Peso: " + peso);
    }

    public String gettipo() {
        return tipo;
    }
    public String getdimensiones() {
        return dimensiones;
    }
    public String getpeso() {
        return peso;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }
    public void setdimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    public void setpeso(String peso) {
        this.peso = peso;
    }
}
