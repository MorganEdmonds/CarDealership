package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

// This is what a dealership is made up of.

    private String name;
   private String address;
   private String phone;
   private ArrayList<Vehicle> inventory;
   //private ArrayList<Vehicle> getVehiclesByPrice;
   // private ArrayList<Vehicle> getVehiclesByMakeModel;
   // private ArrayList<Vehicle> getVehiclesByYear;
    //private ArrayList<Vehicle> getVehiclesByColor;
    //private ArrayList<Vehicle> getVehiclesByMileage;
    //private ArrayList<Vehicle> getVehiclesByType;
   // private Object removeVehicle;

//CONSTRUCTOR.
    public Dealership(String name, String address, String phone ){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();


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

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {


        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {

        return null;
    }

    public Object removeVehicle(int vin) {

        return null;
    }


}


