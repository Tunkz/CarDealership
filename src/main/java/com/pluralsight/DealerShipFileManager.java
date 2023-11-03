package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealerShipFileManager {
    public Dealership getDealership() {
        Dealership dealership1 = new Dealership("", "", "");
        String line;

        int lineNumber = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader("dealership.csv"));

            while ((line = br.readLine()) != null) {
                String[] pipes = line.split("\\|");

                if (lineNumber == 1) {
                    String name = pipes[0];
                    dealership1.setName(name);
                    String address = pipes[1];
                    dealership1.setAddress(address);
                    String phoneNumber = pipes[2];
                    dealership1.setPhone(phoneNumber);
                } else {
                    int vin = Integer.parseInt(pipes[0]);
                    int year = Integer.parseInt(pipes[1]);
                    String make = pipes[2];
                    String model = pipes[3];
                    String vehicleType = pipes[4];
                    String color = pipes[5];
                    int odometer = Integer.parseInt(pipes[6]);
                    double price = Double.parseDouble(pipes[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership1.addVehicle(vehicle);

                }

                lineNumber++;


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Error: unidentified error. Please try again");
        }

        return dealership1;
    }

    public void saveDealership(Dealership dealership){

    }
}
