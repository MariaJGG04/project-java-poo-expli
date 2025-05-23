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

    public String getvelocidad(){
        return velocidad;
    }
    public String gettemperatura(){
        return temperatura;
    }
    public String getpresion(){
        return presión;
    }

    public void setvelocidad(String velocidad){
        this.velocidad = velocidad;
    }
    public void settemperatura(String temperatura){
        this.temperatura = temperatura;
    }
    public void setpresion(String presion){
        this.presión = presion;
    }
}