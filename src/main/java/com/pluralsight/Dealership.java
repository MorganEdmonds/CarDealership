package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

// This is what a dealership is made up of.

    private String name;
   private String address;
   private String phone;
   private ArrayList<Vehicle> inventory;
   private ArrayList<Vehicle> getVehiclesByPrice;
    private ArrayList<Vehicle> getVehiclesByMakeModel;
    private ArrayList<Vehicle> getVehiclesByYear;
    private ArrayList<Vehicle> getVehiclesByColor;
    private ArrayList<Vehicle> getVehiclesByMileage;
    private ArrayList<Vehicle> getVehiclesByType;
    private Object removeVehicle;

//CONSTRUCTOR.
    public Dealership(String name, String address, String phone ){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
        this.getVehiclesByPrice = getVehiclesByPrice;
        this.getVehiclesByMakeModel = getVehiclesByMakeModel;
        this.getVehiclesByYear = getVehiclesByYear;
        this.getVehiclesByColor = getVehiclesByColor;
        this.getVehiclesByMileage = getVehiclesByMileage;
        this.getVehiclesByType = getVehiclesByType;
        this.removeVehicle = removeVehicle;

    }


//Create getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
        // ArrayList<Transcation.Transaction> transactions = FileManager.readTransactions();
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);

    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return getVehiclesByPrice;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return getVehiclesByMakeModel;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {

        return getVehiclesByYear;
    }

    public List<Vehicle> getVehiclesByColor(String color) {


        return getVehiclesByColor;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {

        return getVehiclesByMileage;
    }

    public List<Vehicle> getVehiclesByType(String type) {

        return getVehiclesByType;
    }

    public Object removeVehicle(int vin) {

        return removeVehicle;
    }
}


