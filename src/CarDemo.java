import models.*;

public class CarDemo {

    public static void main(String[] args) throws Exception {
        Car myCar = new Car();

        myCar.setMake("Toyota");
        myCar.setModel("Corolla");
        myCar.setYear(2022);

        System.out.println("Make : " + myCar.getMake());
        System.out.println("Model : " + myCar.getModel());
        System.out.println("Year : " + myCar.getYear());

        Car friendCar = new Car();

        friendCar.setMake("Toyota");
        friendCar.setModel("Corolla");
        friendCar.setYear(2022);

        System.out.println("Make : " + friendCar.getMake());
        System.out.println("Model : " + friendCar.getModel());
        System.out.println("Year : " + friendCar.getYear());

        Car myCar2 = new Car();

        myCar2.setMake("Toyota");
        myCar2.setModel("Corolla");
        myCar2.setYear(2022);

        System.out.println("Make : " + myCar2.getMake());
        System.out.println("Model : " + myCar2.getModel());
        System.out.println("Year : " + myCar2.getYear());

        Car friendCar2 = new Car();

        friendCar2.setMake("Toyota");
        friendCar2.setModel("Corolla");
        friendCar2.setYear(2022);

        System.out.println("Make : " + friendCar2.getMake());
        System.out.println("Model : " + friendCar2.getModel());
        System.out.println("Year : " + friendCar2.getYear());

        Chasis myChasis = new Chasis();

        myChasis.settipo("Bastidor");
        myChasis.setdimensiones("Longitud: 13.20 m - Ancho: 2.746 mm - Alto: 2.357 mm - Batalla: 3.504 mm");
        myChasis.setpeso("6000 libras");

        System.out.println("tipo : " + myChasis.gettipo());
        System.out.println("dimensiones : " + myChasis.getdimensiones());
        System.out.println("peso : " + myChasis.getpeso());

        Chasis friendChasis = new Chasis();

        friendChasis.settipo("Bastidor");
        friendChasis.setdimensiones("Longitud: 13.20 m - Ancho: 2.746 mm - Alto: 2.357 mm - Batalla: 3.504 mm");
        friendChasis.setpeso("6000 libras");

        System.out.println("tipo : " + friendChasis.gettipo());
        System.out.println("dimensiones : " + friendChasis.getdimensiones());
        System.out.println("peso : " + friendChasis.getpeso());

        Chasis myChasis2 = new Chasis();

        myChasis2.settipo("Bastidor");
        myChasis2.setdimensiones("Longitud: 13.20 m - Ancho: 2.746 mm - Alto: 2.357 mm - Batalla: 3.504 mm");
        myChasis2.setpeso("6000 libras");

        System.out.println("tipo : " + myChasis2.gettipo());
        System.out.println("dimensiones : " + myChasis2.getdimensiones());
        System.out.println("peso : " + myChasis2.getpeso());

        Chasis friendChasis2 = new Chasis();

        friendChasis2.settipo("Bastidor");
        friendChasis2.setdimensiones("Longitud: 13.20 m - Ancho: 2.746 mm - Alto: 2.357 mm - Batalla: 3.504 mm");
        friendChasis2.setpeso("6000 libras");

        System.out.println("tipo : " + friendChasis2.gettipo());
        System.out.println("dimensiones : " + friendChasis2.getdimensiones());
        System.out.println("peso : " + friendChasis2.getpeso());

        Mantenimiento myMantenimiento = new Mantenimiento();

        myMantenimiento.sethistorial("Ultimo mantenimiento: Feb 26/2025");
        myMantenimiento.setprogramacion("Proximo mantenimiento: Nov 10/2025");

        System.out.println("historial : " + myMantenimiento.gethistorial());
        System.out.println("programacion : " + myMantenimiento.getprogramacion());

        Mantenimiento friendMantenimiento = new Mantenimiento();

        friendMantenimiento.sethistorial("Ultimo mantenimiento: Feb 26/2025");
        friendMantenimiento.setprogramacion("Proximo mantenimiento: Nov 10/2025");

        System.out.println("historial : " + friendMantenimiento.gethistorial());
        System.out.println("programacion : " + friendMantenimiento.getprogramacion());

        Mantenimiento myMantenimiento2 = new Mantenimiento();

        myMantenimiento2.sethistorial("Ultimo mantenimiento: Feb 26/2025");
        myMantenimiento2.setprogramacion("Proximo mantenimiento: Nov 10/2025");

        System.out.println("historial : " + myMantenimiento2.gethistorial());
        System.out.println("programacion : " + myMantenimiento2.getprogramacion());

        Mantenimiento frMantenimiento2 = new Mantenimiento();

        frMantenimiento2.sethistorial("Ultimo mantenimiento: Feb 26/2025");
        frMantenimiento2.setprogramacion("Proximo mantenimiento: Nov 10/2025");

        System.out.println("historial : " + frMantenimiento2.gethistorial());
        System.out.println("programacion : " + frMantenimiento2.getprogramacion());

        Motor myMotor = new Motor();

        myMotor.settipo("Diesel");
        myMotor.setcilindraje("250");
        myMotor.setpotencia("500HP");

        System.out.println("tipo : " + myMotor.gettipo());
        System.out.println("cilindraje : " + myMotor.getcilindraje());
        System.out.println("potencia : " + myMotor.getpotencia());

        Motor friendMotor = new Motor();

        friendMotor.settipo("Diesel");
        friendMotor.setcilindraje("250");
        friendMotor.setpotencia("500HP");

        System.out.println("tipo : " + friendMotor.gettipo());
        System.out.println("cilindraje : " + friendMotor.getcilindraje());
        System.out.println("potencia : " + friendMotor.getpotencia());

        Motor myMotor2 = new Motor();

        myMotor2.settipo("Diesel");
        myMotor2.setcilindraje("250");
        myMotor2.setpotencia("500HP");

        System.out.println("tipo : " + myMotor2.gettipo());
        System.out.println("cilindraje : " + myMotor2.getcilindraje());
        System.out.println("potencia : " + myMotor2.getpotencia());

        Motor friendMotor2 = new Motor();

        friendMotor2.settipo("Diesel");
        friendMotor2.setcilindraje("250");
        friendMotor2.setpotencia("500HP");

        System.out.println("tipo : " + friendMotor2.gettipo());
        System.out.println("cilindraje : " + friendMotor2.getcilindraje());
        System.out.println("potencia : " + friendMotor2.getpotencia());

        Neumatico myNeumatico = new Neumatico();

        myNeumatico.setmarca("Bridgestone");
        myNeumatico.settamaño("225/45 17");
        myNeumatico.setpresion("34 psi");

        System.out.println("marca : " + myNeumatico.getmarca());
        System.out.println("tamaño : " + myNeumatico.gettamaño());
        System.out.println("presion : " + myNeumatico.getpresion());

        Neumatico friendNeumatico = new Neumatico();

        friendNeumatico.setmarca("Bridgestone");
        friendNeumatico.settamaño("225/45 17");
        friendNeumatico.setpresion("34 psi");

        System.out.println("marca : " + friendNeumatico.getmarca());
        System.out.println("tamaño : " + friendNeumatico.gettamaño());
        System.out.println("presion : " + friendNeumatico.getpresion());

        Neumatico myNeumatico2 = new Neumatico();

        myNeumatico2.setmarca("Bridgestone");
        myNeumatico2.settamaño("225/45 17");
        myNeumatico2.setpresion("34 psi");

        System.out.println("marca : " + myNeumatico2.getmarca());
        System.out.println("tamaño : " + myNeumatico2.gettamaño());
        System.out.println("presion : " + myNeumatico2.getpresion());

        Neumatico friendNeumatico2 = new Neumatico();

        friendNeumatico2.setmarca("Bridgestone");
        friendNeumatico2.settamaño("225/45 17");
        friendNeumatico2.setpresion("34 psi");

        System.out.println("marca : " + friendNeumatico2.getmarca());
        System.out.println("tamaño : " + friendNeumatico2.gettamaño());
        System.out.println("presion : " + friendNeumatico2.getpresion());

        registroVehicular myRegistroVehicular = new registroVehicular();

        myRegistroVehicular.setmatricula("Particular");
        myRegistroVehicular.setpropietario("Maria Jose Gomez");
        myRegistroVehicular.setfechaRegistro("2021/08/15");

        System.out.println("matricula : " + myRegistroVehicular.getmatricula());
        System.out.println("propietario : " + myRegistroVehicular.getpropietario());
        System.out.println("fechaRegistro : " + myRegistroVehicular.getfechaRegistro());

        registroVehicular friendRegistroVehicular = new registroVehicular();

        friendRegistroVehicular.setmatricula("Particular");
        friendRegistroVehicular.setpropietario("Maria Jose Gomez");
        friendRegistroVehicular.setfechaRegistro("2021/08/15");

        System.out.println("matricula : " + friendRegistroVehicular.getmatricula());
        System.out.println("propietario : " + friendRegistroVehicular.getpropietario());
        System.out.println("fechaRegistro : " + friendRegistroVehicular.getfechaRegistro());

        registroVehicular myRegistroVehicular2 = new registroVehicular();

        myRegistroVehicular2.setmatricula("Particular");
        myRegistroVehicular2.setpropietario("Maria Jose Gomez");
        myRegistroVehicular2.setfechaRegistro("2021/08/15");

        System.out.println("matricula : " + myRegistroVehicular2.getmatricula());
        System.out.println("propietario : " + myRegistroVehicular2.getpropietario());
        System.out.println("fechaRegistro : " + myRegistroVehicular2.getfechaRegistro());

        registroVehicular friendRegistroVehicular2 = new registroVehicular();

        friendRegistroVehicular2.setmatricula("Particular");
        friendRegistroVehicular2.setpropietario("Maria Jose Gomez");
        friendRegistroVehicular2.setfechaRegistro("2021/08/15");

        System.out.println("matricula : " + friendRegistroVehicular2.getmatricula());
        System.out.println("propietario : " + friendRegistroVehicular2.getpropietario());
        System.out.println("fechaRegistro : " + friendRegistroVehicular2.getfechaRegistro());

        Sensor mySensor = new Sensor();

        mySensor.setvelocidad("180km/h");
        mySensor.settemperatura("95c°");
        mySensor.setpresion("50psi");

        System.out.println("velocidad : " + mySensor.getvelocidad());
        System.out.println("temperatura : " + mySensor.gettemperatura());
        System.out.println("presion : " + mySensor.getpresion());

        Sensor friendSensor = new Sensor();

        friendSensor.setvelocidad("180km/h");
        friendSensor.settemperatura("95c°");
        friendSensor.setpresion("50psi");

        System.out.println("velocidad : " + friendSensor.getvelocidad());
        System.out.println("temperatura : " + friendSensor.gettemperatura());
        System.out.println("presion : " + friendSensor.getpresion());

        Sensor mySensor2 = new Sensor();

        mySensor2.setvelocidad("180km/h");
        mySensor2.settemperatura("95c°");
        mySensor2.setpresion("50psi");

        System.out.println("velocidad : " + mySensor2.getvelocidad());
        System.out.println("temperatura : " + mySensor2.gettemperatura());
        System.out.println("presion : " + mySensor2.getpresion());

        Sensor friendSensor2 = new Sensor();

        friendSensor2.setvelocidad("180km/h");
        friendSensor2.settemperatura("95c°");
        friendSensor2.setpresion("50psi");

        System.out.println("velocidad : " + friendSensor2.getvelocidad());
        System.out.println("temperatura : " + friendSensor2.gettemperatura());
        System.out.println("presion : " + friendSensor2.getpresion());

        SistemaElectrico mysSistemaElectrico = new SistemaElectrico();

        mysSistemaElectrico.setbateria("Willard Ns40-560");
        mysSistemaElectrico.setluces("H4/9003");
        mysSistemaElectrico.setsensores("BREMBO A 00 523 Sensor de desgaste de pastillas de frenos");

        System.out.println("bateria : " + mysSistemaElectrico.getbateria());
        System.out.println("luces : " + mysSistemaElectrico.getluces());
        System.out.println("sensores : " + mysSistemaElectrico.getsensores());

        SistemaElectrico friendsSistemaElectrico = new SistemaElectrico();

        friendsSistemaElectrico.setbateria("Willard Ns40-560");
        friendsSistemaElectrico.setluces("H4/9003");
        friendsSistemaElectrico.setsensores("BREMBO A 00 523 Sensor de desgaste de pastillas de frenos");

        System.out.println("bateria : " + friendsSistemaElectrico.getbateria());
        System.out.println("luces : " + friendsSistemaElectrico.getluces());
        System.out.println("sensores : " + friendsSistemaElectrico.getsensores());

        SistemaElectrico mysSistemaElectrico2 = new SistemaElectrico();

        mysSistemaElectrico2.setbateria("Willard Ns40-560");
        mysSistemaElectrico2.setluces("H4/9003");
        mysSistemaElectrico2.setsensores("BREMBO A 00 523 Sensor de desgaste de pastillas de frenos");

        System.out.println("bateria : " + mysSistemaElectrico2.getbateria());
        System.out.println("luces : " + mysSistemaElectrico2.getluces());
        System.out.println("sensores : " + mysSistemaElectrico2.getsensores());

        SistemaElectrico friendsSistemaElectrico2 = new SistemaElectrico();

        friendsSistemaElectrico2.setbateria("Willard Ns40-560");
        friendsSistemaElectrico2.setluces("H4/9003");
        friendsSistemaElectrico2.setsensores("BREMBO A 00 523 Sensor de desgaste de pastillas de frenos");

        System.out.println("bateria : " + friendsSistemaElectrico2.getbateria());
        System.out.println("luces : " + friendsSistemaElectrico2.getluces());
        System.out.println("sensores : " + friendsSistemaElectrico2.getsensores());

        SistemaFrenos mysSistemaFrenos = new SistemaFrenos();

        mysSistemaFrenos.settipo("Frenos de dico y tambor");
        mysSistemaFrenos.setdiscos("Si");
        mysSistemaFrenos.setABS("Si");
        mysSistemaFrenos.setestado("Optimo");

        System.out.println("tipo : " + mysSistemaFrenos.gettipo());
        System.out.println("discos : " + mysSistemaFrenos.getdiscos());
        System.out.println("ABS : " + mysSistemaFrenos.getABS());
        System.out.println("estado : " + mysSistemaFrenos.getestado());

        SistemaFrenos friendsSistemaFrenos = new SistemaFrenos();

        friendsSistemaFrenos.settipo("Frenos de dico y tambor");
        friendsSistemaFrenos.setdiscos("Si");
        friendsSistemaFrenos.setABS("Si");
        friendsSistemaFrenos.setestado("Optimo");

        System.out.println("tipo : " + friendsSistemaFrenos.gettipo());
        System.out.println("discos : " + friendsSistemaFrenos.getdiscos());
        System.out.println("ABS : " + friendsSistemaFrenos.getABS());
        System.out.println("estado : " + friendsSistemaFrenos.getestado());

        SistemaFrenos mysSistemaFrenos2 = new SistemaFrenos();

        mysSistemaFrenos2.settipo("Frenos de dico y tambor");
        mysSistemaFrenos2.setdiscos("Si");
        mysSistemaFrenos2.setABS("Si");
        mysSistemaFrenos2.setestado("Optimo");

        System.out.println("tipo : " + mysSistemaFrenos2.gettipo());
        System.out.println("discos : " + mysSistemaFrenos2.getdiscos());
        System.out.println("ABS : " + mysSistemaFrenos2.getABS());
        System.out.println("estado : " + mysSistemaFrenos2.getestado());

        SistemaFrenos friendsSistemaFrenos2 = new SistemaFrenos();

        friendsSistemaFrenos2.settipo("Frenos de dico y tambor");
        friendsSistemaFrenos2.setdiscos("Si");
        friendsSistemaFrenos2.setABS("Si");
        friendsSistemaFrenos2.setestado("Optimo");

        System.out.println("tipo : " + friendsSistemaFrenos2.gettipo());
        System.out.println("discos : " + friendsSistemaFrenos2.getdiscos());
        System.out.println("ABS : " + friendsSistemaFrenos2.getABS());
        System.out.println("estado : " + friendsSistemaFrenos2.getestado());

        Transmision myTransmision = new Transmision();

        myTransmision.settipo("Mecanica");
        myTransmision.setmarchas("5");
        myTransmision.settraccion("Total");

        System.out.println("tipo : " + myTransmision.gettipo());
        System.out.println("marchas : " + myTransmision.getmarchas());
        System.out.println("traccion : " + myTransmision.gettraccion());

        Transmision friendTransmision = new Transmision();

        friendTransmision.settipo("Mecanica");
        friendTransmision.setmarchas("5");
        friendTransmision.settraccion("Total");

        System.out.println("tipo : " + friendTransmision.gettipo());
        System.out.println("marchas : " + friendTransmision.getmarchas());
        System.out.println("traccion : " + friendTransmision.gettraccion());

        Transmision myTransmision2 = new Transmision();

        myTransmision2.settipo("Mecanica");
        myTransmision2.setmarchas("5");
        myTransmision2.settraccion("Total");

        System.out.println("tipo : " + myTransmision2.gettipo());
        System.out.println("marchas : " + myTransmision2.getmarchas());
        System.out.println("traccion : " + myTransmision2.gettraccion());

        Transmision friendTransmision2 = new Transmision();

        friendTransmision2.settipo("Mecanica");
        friendTransmision2.setmarchas("5");
        friendTransmision2.settraccion("Total");

        System.out.println("tipo : " + friendTransmision2.gettipo());
        System.out.println("marchas : " + friendTransmision2.getmarchas());
        System.out.println("traccion : " + friendTransmision2.gettraccion());
}
}