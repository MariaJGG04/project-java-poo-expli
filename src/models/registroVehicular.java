package models;

public class registroVehicular {

    private String matricula;
    private String propietario;
    private int fechaRegistro;

    public registroVehicular () {}

    public registroVehicular (String matricula, String propietario, int fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    public void displayInfo(){
        System.err.println("RegistroVehicular Information:");
        System.err.println("matricula: " + matricula);
        System.err.println("propietario: " + propietario);
        System.err.println("fechaRegistro: " + fechaRegistro);
    }
}