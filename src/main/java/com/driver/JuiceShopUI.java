package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuiceShopUI {
    private static List<JuiceDTO> juiceList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addJuice(scanner);
                    break;
                case 2:
                    displaySummary();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void printMenu() {
    	//your code goes here
        System.out.println("Welcome to juice shop :");
        System.out.println("1. Add Juice :");
        System.out.println("2. Display summary:");
        System.out.println("3. Exist :");
        System.out.println("Enter your choice :");

    }

    private static void addJuice(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter juice name :");
        String name = scanner.next();
        System.out.println("Enter number of Ingredients:");
        int size = scanner.nextInt();

        List<String> ingredient = new ArrayList<>();
        for(int i=0; i<size; i++){
            System.out.println("Enter" + i+1 + "ingerdient :");
            ingredient.add(scanner.nextLine());
        }
        System.out.println("Enter price :")
        double price = scanner.nextDouble();

        JuiceDTO juiceDTO = new JuiceDTO(name, ingredient, price);
        juiceList.add(juiceDTO);

    }

    private static void displaySummary() {
        //your code goes here
        if(juiceList.isEmpty()){
            System.out.println("No juice available");
        }else {
            System.out.println("Juice Summary");
            for(JuiceDTO juice : juiceList){
                System.out.println(juice);
            }
        }
    }
}

