package net.froihofer.dsfinance.bank.client.customer;

import common.bankingInterface.BankingInterface;
import net.froihofer.util.CommonInputHandler;
import net.froihofer.util.RmiProxyBuilder;

class BankClientInputHandler {
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");

    void searchStockByName() {
        CommonInputHandler.searchStockByName(bankingInterface);
    }

    public void buyStock() {
        try {
            String stock = CommonInputHandler.getStockName();
            Double amount = CommonInputHandler.getAmount();
       //     bankingInterface.buySockByISIN();
        } catch (Exception e) {

        }
    }

    public void sellStock() {
        String stock = CommonInputHandler.getStockName();
        Double amount = CommonInputHandler.getAmount();
     //   bankingInterface.sellStockByISIN();
    }

    public void displayDepotInfo() {
        CommonInputHandler.printDepotInfo(1, bankingInterface);
    }
}
