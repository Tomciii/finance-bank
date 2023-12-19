package common.dto;

import java.io.Serializable;

// For selling/trading
public class TradeDTO implements Serializable {

    private String customerID;
    private String stockName;
    private String amount;

    public TradeDTO(String customerID, String stockName, String amount) {
        this.customerID = customerID;
        this.stockName = stockName;
        this.amount = amount;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
