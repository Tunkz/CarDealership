package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {

    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        init();

        boolean running = true;
        while (running) {
            System.out.println("Welcome to the main menu. \nPlease select an option: ");
            System.out.println("1) Find vehicles within a price range");
            System.out.println("2) Find vehicles by make / model");
            System.out.println("3) Find vehicles by year range");
            System.out.println("4) Find vehicles by color");
            System.out.println("5) Find vehicles by mileage range");
            System.out.println("6) Find vehicles by type(car,truck,SUV,van");
            System.out.println("7) List ALL vehicles");
            System.out.println("8) Add a vehicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("99) Quit");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehicleRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "99":
                    System.out.println();
                    running = false;
                default:
                    System.out.println("Invalid option. Please select the right option.");
                    break;
            }
        }
    }

    private void helperDisplayVehicles(List<Vehicle> listOfVehicles) {
        for (Vehicle vehicle : listOfVehicles) {
            System.out.println(vehicle);
        }
    }

    private void init() {
        DealerShipFileManager shipFileManager = new DealerShipFileManager();
        dealership = shipFileManager.getDealership();
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehicleRequest() {
    helperDisplayVehicles(dealership.getAllVehicles());
    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}
