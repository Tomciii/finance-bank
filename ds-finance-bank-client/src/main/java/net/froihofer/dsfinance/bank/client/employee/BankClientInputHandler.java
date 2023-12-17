package net.froihofer.dsfinance.bank.client.employee;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;
import net.froihofer.util.InputHandler;
import net.froihofer.util.RmiProxyBuilder;

import java.util.Scanner;

class BankClientInputHandler {
    private Scanner scanner = new Scanner(System.in);
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");;

    // TODO Implement all the person persistance logic
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

    public void addCustomer() {
        String firstName = InputHandler.getFirstName();
        String lastName = InputHandler.getLastName();
        String address = InputHandler.getAddress();
        Integer customerNumber = InputHandler.getCustomerNumber();

       bankingInterface.createCustomer(firstName, lastName, customerNumber);
    }

    public void searchCustomer() {
        String firstName = InputHandler.getFirstName();
        String lastName = InputHandler.getLastName();
        Integer customerNumber = InputHandler.getCustomerNumber();

        try {
            bankingInterface.searchCustomer(firstName, lastName, customerNumber);
        } catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }

    public void buyStockForCustomer() {
        String userName = InputHandler.getUserName();
        String stockName = InputHandler.getStockName();
        Double amount = InputHandler.getAmount();

      //  bankingInterface.buySockByISIN();
    }

    public void sellStockForCustomer() {
        String userName = InputHandler.getUserName();
        String stockName = InputHandler.getStockName();
        Double amount = InputHandler.getAmount();

       // bankingInterface.sellStockByISIN();
    }

    public void displayDepotInfoOfCustomer() {
        String userName = InputHandler.getUserName();
       // bankingInterface.getDepot();
    }

    public void displayInvestableVolume() {
     //   bankingInterface.getInvestableVolume();
    }
}
