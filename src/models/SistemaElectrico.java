package models;

public class SistemaElectrico {

    private String bateria;
    private String luces;
    private String sensores;

    public SistemaElectrico () {}

    public SistemaElectrico (String bateria, String luces, String sensores) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    public void displayInfo(){
        System.err.println("SistemaElectrico Information:");
        System.err.println("Bateria: " + bateria);
        System.err.println("Luces: " + luces);
        System.err.println("Sensores: " + sensores);
    }
}