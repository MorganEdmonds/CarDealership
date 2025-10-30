package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

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


    //User Interface methods
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);

    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }
        //todo
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        //make a new "Array list that has all the vehicles with the min and max that is asked for"
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        //look through your existing vehicle inventory and if the chisels match then add them to the list
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                matchingVehicles.add(vehicle);

            }

        }
        return matchingVehicles;

    }


            //TODO
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(model) &&
                    vehicle.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(vehicle);

            }
            //return null;
        }
        return matchingVehicles;
    }

    //TODO
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        for(Vehicle vehicle: inventory ){
            if (vehicle.get
        }

        return null;
    }
            //TODO
    public ArrayList<Vehicle> getVehiclesByColor(String color) {


        return null;
    }
    //TODO
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

        return null;

    }
    //TODO
    public ArrayList<Vehicle> getVehiclesByType(String type) {

        return null;
    }

    //todo turn void and has no parameters
    public void removeVehicle(int vin) {


    }


}


