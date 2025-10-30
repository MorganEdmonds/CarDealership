package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {


        Dealership dealership;


    private void init(){

        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealershipFile();

    }

    public void display(){
        init();
//        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("\n======= DEALERSHIP MENU=======");
            System.out.print("1. Get all vehicles");
            System.out.print("2.  Search by price");
            System.out.print("3. Search by make/model");
            System.out.print("4. Search by year");
            System.out.println("5. Search by color");
            System.out.println("6. Search by mileage");
            System.out.println("7. Search by vehicle type");
            System.out.println("8. Add a vehicle");
            System.out.println("9. Remove a vehicle");
            System.out.println("0. Quit");
            System.out.print("\nEnter your choice: ");


            int choice = InputCollector.promptForInt("Enter a number command");

            // processPriceRequest; {

            switch(choice) {
                case 1:
                    processAllVehiclesRequest();
                    break;
                case 2:
                    processPriceRequest();
                    break;
                case 3:
                    processMakeModelRequest();
                    break;
                case 4:
                    processYearRequest();
                    break;
                case 5:
                    processColorRequest();
                    break;
                case 6:
                    processMileageRequest();
                    break;
                case 7:
                    processVehicleTypeRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Thank you for visiting!");
                    return;  // Exit the method
                default:
                    System.out.println("Invalid choice! Please try again.");

                break;
            }
        }
   }
        //TODO
    private void processRemoveVehicleRequest() {
        System.out.print("what is the VIN number?: ");
        int vin = InputCollector.promptForInt("Enter VIN to remove: ");


        //for loop to look through ALL vehicles in dealership
        //if one matches the vin given then remove it.
        //if you can't find it , say so.

        dealership.removeVehicle(vin);
        System.out.println("Vehicle removed successfully!");
    }

    private void processAddVehicleRequest()  {
        System.out.print("what is the VIN number?: ");
        int vin = InputCollector.promptForInt("Enter VIN to add");

        int year = InputCollector.promptForInt("Enter year");
             System.out.print("what is the year?: ");

        String make = InputCollector.promptForString("Enter the make");
              System.out.print("what is the make?: ");

        String model = InputCollector.promptForString("Enter the model");
                System.out.print("what is the model?: ");

        String vehicleType = InputCollector.promptForString("Enter vehicle type");
                 System.out.print("what is the vehicle type?: ");

        String color = InputCollector.promptForString("Enter color");
                 System.out.print("what is the color?: ");

        int odometer = InputCollector.promptForInt("Enter mileage");
                  System.out.print("what is the mileage?: ");

        double price = InputCollector.promptForDouble("enter a price");
                    System.out.print("what is the price?: ");

        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
         dealership.addVehicle(vehicle);
         System.out.println("Vehicle successfully added!");

    }

    private void processVehicleTypeRequest() {
        System.out.print(" what is the vehicle type: ");
        String type = InputCollector.promptForString("Enter vehicle type: ");

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByType(type);
        displayVehicles(vehicles);
    }

    private void processMileageRequest() {
        System.out.print("what is the minimum mileage: ");
        int min = InputCollector.promptForInt(" minimum mileage: ");

        System.out.print("what is the maximum mileage: ");
        int max = InputCollector.promptForInt("Enter maximum mileage: ");

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicles);
    }

    private void processColorRequest() {
           String color = InputCollector.promptForString("Enter color");
        System.out.print("What is the color of the vehicle?");

        ArrayList<Vehicle> vehiclesByColor = dealership.getVehiclesByColor(color);
        displayVehicles(vehiclesByColor);
    }
                                                          //   "Enter minimum year "
    private void processYearRequest() {
        System.out.print("what is the minimum year that you are looking for? :");
       int min = InputCollector.promptForInt("Enter minimum year ");

        System.out.print("What is the maximum year you are looking for? ");
          int max = InputCollector.promptForInt("Enter maximum year: ");

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByYear(min, max);
        displayVehicles(vehicles);
    }

    private void processMakeModelRequest() {
        System.out.print("What is the make: ");
        String make = InputCollector.promptForString("Enter make: ");

        System.out.print("What is the model: ");
        String model = InputCollector.promptForString("Enter model: ");
        ArrayList<Vehicle> vehicle = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicle);
    }

    private void processPriceRequest() {
        System.out.print("What is the minimum price?: ");
        double min = InputCollector.promptForDouble("Enter minimum price: ");

        System.out.print("What is the maximum price: ");
        double max = InputCollector.promptForDouble("Enter maximum price: ");
        ArrayList<Vehicle> vehicles = dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicles);
    }

    //this method could be help when trying to remove vehicle
    private void processAllVehiclesRequest() {
        ArrayList<Vehicle> vehicle = dealership.getAllVehicles();
        displayVehicles(vehicle);
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){

        for(Vehicle vehicle:vehicles){
            System.out.println(

                    vehicle.getVin()
                    + "|" + vehicle.getYear()
                    + "|" + vehicle.getMake()
                    + "|" + vehicle.getModel()
                    + "|" + vehicle.getVehicleType()
                    + "|" + vehicle.getColor()
                    + "|" + vehicle.getOdometer()
                    + "|" +vehicle.getPrice());
        }
    }
    
}
   







