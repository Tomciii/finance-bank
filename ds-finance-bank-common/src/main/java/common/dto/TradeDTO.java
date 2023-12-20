package common.dto;

import java.io.Serializable;

// For selling/trading
public class TradeDTO implements Serializable {

    private String customerID;
    private String stockName;
    private double amount;

    public TradeDTO(String customerID, String stockName, double amount) {
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
