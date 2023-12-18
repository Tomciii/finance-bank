package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CUSTOMER")
public class Customer extends Person implements Serializable {
    private int customernr;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Depot> bankDepots = new ArrayList<>();

    public int getCustomerNr() {
        return customernr;
    }

    public Customer(){}

    public Customer(int customernr) {
        this.customernr = customernr;
    }

    public Customer(int svnr, String name, String givenname, String address, String username, String password, int customernr) {
        super(svnr, name, givenname, address, username, password);
        this.customernr = customernr;
    }

    public void setCustomerNr(int customerNr) {
        this.customernr = customerNr;
    }

    public int getCustomernr() {
        return customernr;
    }

    public void setCustomernr(int customernr) {
        this.customernr = customernr;
    }

    public List<Depot> getBankDepots() {
        return bankDepots;
    }

    public void setBankDepots(List<Depot> bankDepots) {
        this.bankDepots = bankDepots;
    }

    @Override
    public String toString() {
        return "Person{" +
                "svnr=" + svnr +
                ", name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", customerNr='" + customernr + "\'" +
                '}';
    }
}
