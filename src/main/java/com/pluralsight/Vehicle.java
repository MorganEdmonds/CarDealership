package com.pluralsight;

public class Vehicle {

// This is how a Vehicle is made.

    private int vin;
    private int year;
    private String name;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;


    // Create methods for each

    public Vehicle (String name, String vehicleType, String color, int vin, int year, int odometer, double price){

        // CONSTRUCTOR.
        this.vin = vin;
        this.year = year;
        this.name = name;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;

    }

    //Create getters and setters.

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", color='" + color + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }
}
