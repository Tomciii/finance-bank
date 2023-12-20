package net.froihofer.dsfinance.bank.client.employee;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;
import common.dto.DepotDTO;
import common.dto.StockDTO;
import net.froihofer.util.CommonInputHandler;
import net.froihofer.util.RmiProxyBuilder;

import java.util.List;
import java.util.Scanner;

class BankClientInputHandler {
    private Scanner scanner = new Scanner(System.in);
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");;

    // TODO Implement all the person persistance logic
    void searchStockByName() {
        CommonInputHandler.searchStockByName(bankingInterface);
    }

    public void addCustomer() {
        String firstName = CommonInputHandler.getFirstName();
        String lastName = CommonInputHandler.getLastName();
        String address = CommonInputHandler.getAddress();
        Integer customerNumber = CommonInputHandler.getCustomerNumber();

       String returnValue = bankingInterface.createCustomer(firstName, lastName, address, customerNumber, null, null);
        System.out.println(returnValue);
    }

    public void searchCustomer() {
        Integer customerNumber = CommonInputHandler.getCustomerNumber();

        try {
            String value = bankingInterface.searchCustomer(customerNumber);
            System.out.println(value);
        } catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }

    public void buyStockForCustomer() {
        String userName = CommonInputHandler.getUserName();
        String stockName = CommonInputHandler.getStockName();
        Double amount = CommonInputHandler.getAmount();

      //  bankingInterface.buySockByISIN();
    }

    public void sellStockForCustomer() {
        String userName = CommonInputHandler.getUserName();
        String stockName = CommonInputHandler.getStockName();
        Double amount = CommonInputHandler.getAmount();

       // bankingInterface.sellStockByISIN();
    }

    public void displayDepotInfoOfCustomer() {
        String userName = CommonInputHandler.getUserName();

        CommonInputHandler.printDepotInfo(1, bankingInterface);
    }

    public void displayInvestableVolume() {
     //   bankingInterface.getInvestableVolume();
    }
}
