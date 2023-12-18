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

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "DEPOT", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Shares> shares = new ArrayList<>();

    public Depot(int id, Customer customer, List<Shares> stocks) {
        this.id = id;
        this.customer = customer;
        this.shares = stocks;
    }

    public Depot() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Shares> getShares() {
        return shares;
    }

    public void setShares(List<Shares> stocks) {
        this.shares = stocks;
    }
}
