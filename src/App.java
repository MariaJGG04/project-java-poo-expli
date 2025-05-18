import models.Car;
import models.Chasis;
import models.Mantenimiento;
import models.Motor;
import models.Neumatico;
import models.Sensor;
import models.registroVehicular;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.Transmision;

public class App {

    public static void main(String[] args) throws Exception {
        Car miCar = new Car("Toyota", "Corolla", 2022);
        Car friendsCar = new Car("Honda", "Civic", 2021);
        Motor carMotor = new Motor("Diesel", "250", "500HP");
        Motor friendsMotor = new Motor("Gasolina", "200", "250HP");
        Transmision carTransmision = new Transmision("Mecanica", 5, "Total");
        Transmision friendsTransmision = new Transmision("Manual", 5, "Delantera");
        Chasis carChasis = new Chasis("Bastidor", "Longitud: 13.20 m - Ancho: 2.746 mm - Alto: 2.357 mm - Batalla: 3.504 mm", "6000 libras");
        Chasis friendsChasis = new Chasis("Monocasco", "Longitud: 4.5 m - Ancho: 1.8 m - Alto: 1.4 m - Batalla: 2.7 m", "40kg");
        Neumatico carNeumatico = new Neumatico("Bridgestone", "225/45 17", "34 psi");
        Neumatico friendsNeumatico = new Neumatico("Continental", "205/55 R16", "33 psi");
        SistemaElectrico carSistemaElectrico = new SistemaElectrico("Willard Ns40-560", "H4/9003", "BREMBO A 00 523 Sensor de desgaste de pastillas de frenos");
        SistemaElectrico friendSistemaElectrico = new SistemaElectrico("Mac Gold 750", "9006/HB4", "Sensor Velocidad Honda Accor 2.2 Civic 1.5");
        SistemaFrenos carSistemaFrenos = new SistemaFrenos("Frenos de dico y tambor", "Si", "Si", "Optimo");
        SistemaFrenos friendSistemaFrenos = new SistemaFrenos("Frenos de dico y tambor", "Si", "Si", "Optimo");
        registroVehicular carRegistroVehicular = new registroVehicular("Particular", "Maria Jose Gomez", 2021/8/15);
        registroVehicular friendRegistroVehicular = new registroVehicular("Particular", "Camilo Acero", 2019/11/04);
        Mantenimiento carMantenimiento = new Mantenimiento("Ultimo mantenimiento: Feb 26/2025", "Proximo mantenimiento: Nov 10/2025");
        Mantenimiento friendMantenimiento = new Mantenimiento("Ultimo mantenimiento Dic 28/2024", "Proximo mantenimiento: Jun 25/1015");
        Sensor carSensor = new Sensor("180km/h", "95c°", "50psi");
        Sensor friendSensor = new Sensor("200km/h", "95c°", "50psi");

        System.out.println("Hello, World!");
        miCar.displayInfo ();
        friendsCar.displayInfo ();
        carMotor.displayInfo();
        friendsMotor.displayInfo();
        carTransmision.displayInfo();
        friendsTransmision.displayInfo();
        carChasis.displayInfo();
        friendsChasis.displayInfo();
        carNeumatico.displayInfo();
        friendsNeumatico.displayInfo();
        carSistemaElectrico.displayInfo();
        friendSistemaElectrico.displayInfo();
        carSistemaFrenos.displayInfo();
        friendSistemaFrenos.displayInfo();
        carRegistroVehicular.displayInfo();
        friendRegistroVehicular.displayInfo();
        carMantenimiento.displayInfo();
        friendMantenimiento.displayInfo();
        carSensor.displayInfo();
        friendSensor.displayInfo();
    }
}