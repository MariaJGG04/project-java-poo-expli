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

    public String gettipo(){
        return tipo;
    }
    public String getdiscos(){
        return discos;
    }
    public String getABS(){
        return ABS;
    }
    public String getestado(){
        return estado;
    }

    public void settipo (String tipo){
        this.tipo = tipo;
    }
    public void setdiscos (String discos){
        this.discos = discos;
    }
    public void setABS (String ABS){
        this.ABS = ABS;
    }
    public void setestado (String estado){
        this.estado = estado;
    }
}