package net.froihofer.dsfinance.bank.client.customer;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;
import common.dto.DepotDTO;
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
        try {
            DepotDTO depotDTO = bankingInterface.getDepot("customer1");
        } catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }
}
