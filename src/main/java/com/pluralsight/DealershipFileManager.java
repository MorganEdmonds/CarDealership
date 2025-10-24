package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public void readDealershipFile() {
        try {
            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("Inventory.csv");

            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;

            // mark whether its reading the first line
            // to start, the value is true
            boolean isFirstLine = true;

            // read until there is no more data
            while ((input = bufReader.readLine()) != null) {
                // first line: dealership info =>
                // D & B Used Cars|111 Old Benbrook Rd|817-555-5555
                if(isFirstLine == true) {
                    // split input into parts by "|"
                    String[] dealerInfo = input.split("\\|");
                    String name = dealerInfo[0];
                    String address = dealerInfo[1];
                    String phoneNumber = dealerInfo[2];
                    //name
                    //address
                    //phone
                    isFirstLine = false;
                } else {
                    // each line represents one Vehicle

                    //10112|1993|Ford|Explorer|SUV|Red|525123|995.00
                    // split input into parts by "!"
                    String[] vehicleInfo = input.split("\\|");

                    // String name, String vehicleType, String color, int vin, int year, int odometer, double price
                    // to call helper place semi colon at the end first.
                    int vin = Integer.parseInt(vehicleInfo[0]);
                    int year = Integer.parseInt(vehicleInfo[1]);
                    String type = vehicleInfo[2];
                    String name = vehicleInfo[3];
                    String color = vehicleInfo[4];
                    int odo = Integer.parseInt(vehicleInfo[5]);
                    double price = Double.parseDouble(vehicleInfo[6]);
                }
            }


            // close the stream and release the resources
            bufReader.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}



