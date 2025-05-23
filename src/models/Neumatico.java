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

    public String getmarca(){
        return marca;
    }
    public String gettamaño(){
        return tamaño;
    }
    public String getpresion(){
        return presion;
    }

    public void setmarca(String marca){
        this.marca = marca;
    }
    public void settamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public void setpresion(String presion){
        this.presion = presion;
    }
}