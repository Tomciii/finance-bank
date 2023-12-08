package net.froihofer.dsfinance.bank.client;

import java.util.Scanner;

class BankClientConsole {
    private Scanner scanner = new Scanner(System.in);
    private BankClientInputHandler inputHandler = new BankClientInputHandler();

    public void processInput(){
        while (true){
        this.displayActions();
        String input = scanner.nextLine();

        switch (input) {
            case "1": inputHandler.doFetchData(); break;
            case "2": inputHandler.doFetchData(); break;
            case "EXIT": System.exit(1);
            default: break;
        }
        }
    }

    private void displayActions(){
        System.out.println("Possible Actions:");
        System.out.println("Enter '1' to find a stock based on a name");
    }
}
