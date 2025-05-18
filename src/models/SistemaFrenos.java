package models;

public class SistemaFrenos {

    private String tipo;
    private String discos;
    private String ABS;
    private String estado;

    public SistemaFrenos () {}

    public SistemaFrenos (String tipo, String discos, String ABS, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.ABS = ABS;
        this.estado = estado;
    }

    public void displayInfo(){
        System.err.println("SistemaFrenos Information:");
        System.err.println("Tipo: " + tipo);
        System.err.println("Discos: " + discos);
        System.err.println("ABS: " + ABS);
        System.err.println("Estado: " + estado);
    }
}