package common.dto;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigDecimal;

public class StockDTO implements Serializable {
    protected String companyName;
    protected Long floatShares;
    protected String lastTradePrice;
    protected String lastTradeTime;
    protected Long marketCapitalization;
    protected String stockExchange;
    protected String symbol;


    public StockDTO(String companyName, Long floatShares, String lastTradePrice, String lastTradeTime, Long marketCapitalization, String stockExchange, String symbol) {
        this.companyName = companyName;
        this.floatShares = floatShares;
        this.lastTradePrice = lastTradePrice;
        this.lastTradeTime = lastTradeTime;
        this.marketCapitalization = marketCapitalization;
        this.stockExchange = stockExchange;
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getFloatShares() {
        return floatShares;
    }

    public void setFloatShares(Long floatShares) {
        this.floatShares = floatShares;
    }

    public String getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(String lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public String getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(String lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Long getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(Long marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "StockDTO{" +
                "companyName='" + companyName + '\'' +
                ", floatShares=" + floatShares +
                ", lastTradePrice=" + lastTradePrice +
                ", lastTradeTime=" + lastTradeTime +
                ", marketCapitalization=" + marketCapitalization +
                ", stockExchange='" + stockExchange + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
