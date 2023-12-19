package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="DEPOT")
public class Depot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "DEPOT", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Shares> shares = new ArrayList<>();

    public List<Shares> getShares() {
        return shares;
    }

    public Depot(int id, int customer, List<Shares> stocks) {
        this.id = id;
        this.shares = stocks;
    }

    public Depot(int id) {
        this.id = id;
    }

    public Depot() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setShares(List<Shares> stocks) {
        this.shares = stocks;
    }

    @Override
    public String toString() {
        return "Depot{" +
                "id=" + id +
                ", shares=" + shares +
                '}';
    }
}
