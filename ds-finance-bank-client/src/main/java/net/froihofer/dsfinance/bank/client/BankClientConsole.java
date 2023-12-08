package net.froihofer.dsfinance.bank.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

class BankClientConsole {
    private static Logger log = LoggerFactory.getLogger(BankClientConsole.class);
    private Scanner scanner = new Scanner(System.in);
    private BankClientInputHandler inputHandler = new BankClientInputHandler();

    void processInput(){
        System.out.println("Welcome to the Banking Client Application.");
        boolean isProcessing = true;

        while (isProcessing){
        this.displayActions();
        String input = scanner.nextLine();

        switch (input) {
            case "1": inputHandler.searchStockByName(); break;
            case "2": inputHandler.searchStockByName(); break;
            case "EXIT": isProcessing = false;
            default: break;
         }
        }
    }

    private void displayActions(){
        System.out.println("Enter '1' to find a stock based on a name");
        System.out.println("Enter '2' to find a stock based on a name");
        System.out.println("Enter '3' to find a stock based on a name");
    }
}
