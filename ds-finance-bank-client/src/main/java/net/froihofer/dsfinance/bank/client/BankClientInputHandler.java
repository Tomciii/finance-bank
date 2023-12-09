package net.froihofer.dsfinance.bank.client;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;

import java.util.Scanner;

class BankClientInputHandler {
    private Scanner scanner = new Scanner(System.in);
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");;

    void searchStockByName() {
        try {
            System.out.print("Type in stock name: ");
            String input = scanner.nextLine();
            String result = bankingInterface.searchStockByName(input);
            System.out.println(result);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }
}
