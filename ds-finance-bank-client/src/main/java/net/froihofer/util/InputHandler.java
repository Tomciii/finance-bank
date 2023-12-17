package net.froihofer.util;

import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    public static String getStockName() {
        String stock = "";
        while (!stock.isEmpty()){
            System.out.print("Type in stock name> ");
            stock = scanner.nextLine();
        }

        return stock;
    }


    public static String getUserName() {
        String stock = "";
        while (!stock.isEmpty()){
            System.out.print("Type in user name> ");
            stock = scanner.nextLine();
        }

        return stock;
    }

    public static String getFirstName() {
        String stock = "";
        while (!stock.isEmpty()){
            System.out.print("Type in first name> ");
            stock = scanner.nextLine();
        }

        return stock;
    }


    public static String getLastName() {
        String stock = "";
        while (!stock.isEmpty()){
            System.out.print("Type in last name> ");
            stock = scanner.nextLine();
        }

        return stock;
    }

    public static String getAddress() {
        String stock = "";
        while (!stock.isEmpty()){
            System.out.print("Type in adress> ");
            stock = scanner.nextLine();
        }

        return stock;
    }

    public static String getCustomerNumber() {
        String stock = "";
        while (!stock.isEmpty()){
            System.out.print("Type in customer number> ");
            stock = scanner.nextLine();
        }

        return stock;
    }

    public static Double getAmount() {
        String stock = "";
        while (!stock.isEmpty()){
            try {
                System.out.print("Type in amount> ");
                stock = scanner.nextLine();
                return Double.parseDouble(stock);
            } catch (Exception e) {
                stock = "";
            }
        }

        return 0.0;
    }
}
