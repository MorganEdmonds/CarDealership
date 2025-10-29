package com.pluralsight;

import java.util.Scanner;

public class UserInterface {


private Dealership dealership;


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
    }

    private void processAddVehicleRequest() {
    }

    private void processVehicleTypeRequest() {
    }

    private void processMileageRequest() {
    }

    private void processColorRequest() {
    }

    private void processYearRequest() {
    }

    private void processMakeModelRequest() {
    }

    private void processPriceRequest() {
    }

    private void processAllVehiclesRequest() {
    }
    
    
}
   








