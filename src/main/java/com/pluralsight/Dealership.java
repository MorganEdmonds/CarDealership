package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

// This is what a dealership is made up of.

    private String name;
   private String address;
   private String phone;
   private ArrayList<Vehicle> inventory;


//CONSTRUCTOR.
    public Dealership(String name, String address, String phone ){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
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

//    public Dealership(){
//
//    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);

    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }
}

