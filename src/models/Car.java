package models;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car () {}

    public Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.err.println("Car Information:");
        System.err.println("make: " + make);
        System.err.println("model: " + model);
        System.err.println("year: " + year);
    }
}