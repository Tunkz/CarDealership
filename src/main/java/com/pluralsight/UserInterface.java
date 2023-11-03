package com.pluralsight;

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
            System.out.println("1)Find vehicles within a price range");
            System.out.println("2)ind vehicles by make / model");
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
                    System.out.println();
                    break;
                case "2":
                    System.out.println();
                    break;
                case "3":
                    System.out.println();
                    break;
                case "4":
                    System.out.println();
                    break;
                case "5":
                    System.out.println();
                    break;
                case "6":
                    System.out.println();
                    break;
                case "7":
                    System.out.println();
                    break;
                case "8":
                    System.out.println();
                    break;
                case"9":
                    System.out.println();
                    break;
                case"99":
                    System.out.println();
                    running = false;
                default:
                    System.out.println("Invalid option. Please select the right option.");
                    break;
            }
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

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}
