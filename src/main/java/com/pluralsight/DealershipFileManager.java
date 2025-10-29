package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {


    public Dealership getDealershipFile() {

        Dealership dealership = null;

        try {
            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("Inventory.csv");

            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            //String input;


            //input = bufReader.readLine();
            //do something with the first line which is already in input...

            // read until there is no more data
            String readLineFromFile;
            readLineFromFile = bufReader.readLine();

            // first line: dealership info =>

            // split input into parts by "|"

            String[] dealerInfo = readLineFromFile.split("\\|");
            String dealershipName = dealerInfo[0];
            String dealershipAddress = dealerInfo[1];
            String dealershipPhoneNumber = dealerInfo[2];

            dealership = new Dealership(dealershipName, dealershipAddress, dealershipPhoneNumber);


            // each line represents one Vehicle


            // split input into parts by "|"

            while ((readLineFromFile = bufReader.readLine()) != null) {

                String[] vehicleInfo = readLineFromFile.split("\\|");

                // String name, String vehicleType, String color, int vin, int year, int odometer, double price
                // to call helper place semicolon at the end first.
                int vin = Integer.parseInt(vehicleInfo[0]);
                int year = Integer.parseInt(vehicleInfo[1]);
                String make = vehicleInfo[2];
                String model = vehicleInfo[3];
                String vehicleType = vehicleInfo[4];
                String color = vehicleInfo[5];
                int odometer = Integer.parseInt(vehicleInfo[6]);
                double price = Double.parseDouble(vehicleInfo[7]);

                Vehicle vehicleToAdd = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(vehicleToAdd);
            }

            // close the stream and release the resources
            bufReader.close();

            } catch (IOException e) {
                // display stack trace if there was an error
                e.printStackTrace();
            }
        return dealership;

    }

    //public Dealership getDealership() {
    //}
}




