package models;

public class Neumatico {

    private String marca;
    private String tamaño;
    private String presion;

    public Neumatico () {}

    public Neumatico (String marca, String tamaño, String presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    public void displayInfo(){
        System.err.println("Neumaticos Information:");
        System.err.println("Marca: " + marca);
        System.err.println("Tamaño: " + tamaño);
        System.err.println("Presion: " + presion);
    }
}