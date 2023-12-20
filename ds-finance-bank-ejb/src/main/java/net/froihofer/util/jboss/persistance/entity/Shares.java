package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shares")
public class Shares implements Serializable {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "depot_id", referencedColumnName = "id")
    private Depot depot;

    @Column(name="STOCKNAME")
    private String stockName;

    @Column(name="STOCKSHARES")
    private int stockShares;

    public Shares(int id, Depot depot, String stockName, int stockShares) {
        this.id = id;
        this.depot = depot;
        this.stockName = stockName;
        this.stockShares = stockShares;
    }

    public Shares() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
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
        return "Shares{" +
                "id=" + id +
                ", depot=" + depot +
                ", stockName='" + stockName + '\'' +
                ", stockShares=" + stockShares +
                '}';
    }
}
