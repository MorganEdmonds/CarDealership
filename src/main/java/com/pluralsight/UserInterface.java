package com.pluralsight;

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
        Scanner scanner = new Scanner(System.in);

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


            int choice = scanner.nextInt();

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

    private void processRemoveVehicleRequest() {
        System.out.print("Enter VIN to remove: ");
        int vin = scanner.nextInt();

        dealership.removeVehicle(vin);
        System.out.println("Vehicle removed successfully!");
    }

    private void processAddVehicleRequest()  {

    }

    private void processVehicleTypeRequest() {
        System.out.print("Enter vehicle type: ");
        String type = scanner.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByType(type);
        displayVehicles(vehicles);
    }

    private void processMileageRequest() {
        System.out.print("Enter minimum mileage: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum mileage: ");
        int max = scanner.nextInt();

        List<Vehicle> vehicles = dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicles);
    }

    private void processColorRequest() {
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByColor(color);
        displayVehicles(vehicles);
    }

    private void processYearRequest() {
        System.out.print("Enter minimum year: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum year: ");
        int max = scanner.nextInt();

        List<Vehicle> vehicles = dealership.getVehiclesByYear(min, max);
        displayVehicles(vehicles);
    }

    private void processMakeModelRequest() {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        List<Vehicle> vehicle = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicle);
    }

    private void processPriceRequest() {
        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble;
        List<Vehicle> vehicles = dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicles);
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> vehicle = dealership.getAllVehicles();
        displayVehicles(vehicle);
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){
        System.out.println(vehicle.getMake() + " " + vehicle.getModel() +
    " (" + vehicle.getYear() + ") - $" + vehicle.getPrice() +
   " - " + vehicle.getColor());




    }
    
}
   







