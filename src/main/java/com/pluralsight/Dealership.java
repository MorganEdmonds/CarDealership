package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

// This is what a dealership is made up of.

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    //CONSTRUCTOR.
    public Dealership(String name, String address, String phone) {
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
    public void removeVehicle(int vin){
        Vehicle toRemove = null;
        for(Vehicle vehicle : inventory) {
            if(vehicle.getVin() == vin) {
                toRemove = vehicle;
                break;
            }
        }
        if(toRemove != null) {
            inventory.remove(toRemove);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);

    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

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

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) &&
                    vehicle.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(vehicle);

            }

        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {

        ArrayList<Vehicle> yearOutcome = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                yearOutcome.add(vehicle);
            }
        }

        return yearOutcome;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> colorOutcome = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equals(color)) {
                colorOutcome.add(vehicle);
            }
        }
        return colorOutcome;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> mileageResult = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                mileageResult.add(vehicle);

            }



        }
        return mileageResult;
    }

    public ArrayList<Vehicle> getVehiclesByType (String vehicleType){
        ArrayList<Vehicle> vehicleTypeResult = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().contains(vehicleType)) {
                vehicleTypeResult.add(vehicle);
            }




        }
        return vehicleTypeResult;
    }




} //End of Dealership class


