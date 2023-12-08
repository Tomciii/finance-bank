package net.froihofer.dsfinance.bank.client;

import common.BankingInterface;
import common.BankingInterfaceException;

import java.util.Scanner;

class BankClientInputHandler {
    private Scanner scanner = new Scanner(System.in);
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");;

    public void searchStockByName() {
        try {
            System.out.println("Type in stock name: ");
            String input = scanner.nextLine();
            bankingInterface.searchStockByName(input);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }
}
