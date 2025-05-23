package models;

public class Transmision<Int> {

    private String tipo;
    private Int marchas;
    private String traccion;

    public Transmision () {}

    public Transmision (String tipo, Int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    public void displayInfo(){
        System.err.println("Transmision Information:");
        System.err.println("Tipo: " + tipo);
        System.err.println("Marchas: " + marchas);
        System.err.println("Traccion: " + traccion);
    }

    public String gettipo(){
        return tipo;
    }
    public Int getmarchas(){
        return marchas;
    }
    public String gettraccion(){
        return traccion;
    }

    public void settipo (String tipo){
        this.tipo = tipo;
    }
    public void setmarchas (Int marchas){
        this.marchas = marchas;
    }
    public void settraccion (String traccion){
        this.traccion = traccion;
    }
}
