package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stocks")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "bank_depot_id")
    private Depot bankDepot;

    private String stockKey;
    private String stockName;
    private int stockShares;

    public Stock(int id, Depot bankDepot, String stockKey, String stockName, int stockShares) {
        this.id = id;
        this.bankDepot = bankDepot;
        this.stockKey = stockKey;
        this.stockName = stockName;
        this.stockShares = stockShares;
    }

    public Stock() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Depot getBankDepot() {
        return bankDepot;
    }

    public void setBankDepot(Depot bankDepot) {
        this.bankDepot = bankDepot;
    }

    public String getStockKey() {
        return stockKey;
    }

    public void setStockKey(String stockKey) {
        this.stockKey = stockKey;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockShares() {
        return stockShares;
    }

    public void setStockShares(int stockShares) {
        this.stockShares = stockShares;
    }

    @Override
    public String toString() {
        return "Stock{" +
                ", bankDepot=" + bankDepot +
                ", stockName='" + stockName + '\'' +
                ", stockShares=" + stockShares +
                '}';
    }
}
