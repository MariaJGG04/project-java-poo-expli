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
}
