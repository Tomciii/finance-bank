package net.froihofer.dsfinance.bank.client.customer;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;
import common.dto.TradeDTO;
import net.froihofer.util.CommonInputHandler;
import net.froihofer.util.RmiProxyBuilder;

class BankClientInputHandler {
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");

    void searchStockByName() {
        CommonInputHandler.searchStockByName(bankingInterface);
    }

    public void buyStock() {
            String stock = CommonInputHandler.getStockName();
            Double amount = CommonInputHandler.getAmount();

            try {
                bankingInterface.buySockByISIN(new TradeDTO("1", stock, amount));
            } catch (BankingInterfaceException e) {
                e.printStackTrace();
            }
    }

    public void sellStock() {
        String stock = CommonInputHandler.getStockName();
        Double amount = CommonInputHandler.getAmount();

        try {
            bankingInterface.sellStockByISIN(new TradeDTO("1", stock, amount));
        } catch (BankingInterfaceException e) {
            e.printStackTrace();
        }
    }

    public void displayDepotInfo() {
        CommonInputHandler.printDepotInfo(1, bankingInterface);
    }
}
