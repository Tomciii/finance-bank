package net.froihofer.dsfinance.bank.client.customer;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;
import net.froihofer.util.InputHandler;
import net.froihofer.util.RmiProxyBuilder;

import java.util.Scanner;

class BankClientInputHandler {
    private Scanner scanner = new Scanner(System.in);
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");;

    void searchStockByName() {
        try {
            String stock = InputHandler.getStockName();
            String result = bankingInterface.searchStockByName(stock);
            System.out.println(result);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }

    public void buyStock() {
        try {
            String stock = InputHandler.getStockName();
            Double amount = InputHandler.getAmount();
       //     bankingInterface.buySockByISIN();
        } catch (Exception e) {

        }
    }

    public void sellStock() {
        String stock = InputHandler.getStockName();
        Double amount = InputHandler.getAmount();
     //   bankingInterface.sellStockByISIN();
    }

    public void displayDepotInfo() {
        // bankingInterface.getDepot();
    }
}
