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

    public String getmatricula(){
        return matricula;
    }
    public String getpropietario(){
        return propietario;
    }
    public int getfechaRegistro(){
        return fechaRegistro;
    }

    public void setmatricula(String matricula){
        this.matricula = matricula;
    }
    public void setpropietario(String propietario){
        this.propietario = propietario;
    }
    public void setfechaRegistro(int fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }

    public void setfechaRegistro(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setfechaRegistro'");
    }
}