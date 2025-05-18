package models;

public class Sensor {

    private String velocidad;
    private String temperatura;
    private String presión;

    public Sensor () {}

    public Sensor (String velocidad, String temperatura, String presión) {
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presión = presión;
    }

    public void displayInfo(){
        System.err.println("Sensor Information:");
        System.err.println("velocidad: " + velocidad);
        System.err.println("temperatura: " + temperatura);
        System.err.println("presión: " + presión);
    }
}