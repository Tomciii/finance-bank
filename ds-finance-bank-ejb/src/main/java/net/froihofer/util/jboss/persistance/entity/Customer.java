package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="CUSTOMER")
public class Customer extends Person implements Serializable {
    private int customernr;

    public int getBankDepotID() {
        return bankDepotID;
    }

    public void setBankDepotID(int bankDepotID) {
        this.bankDepotID = bankDepotID;
    }

    public Customer(int customernr, int bankDepotID) {
        this.customernr = customernr;
        this.bankDepotID = bankDepotID;
    }

    public Customer(int svnr, String name, String givenname, String address, String username, String password, int customernr, int bankDepotID) {
        super(svnr, name, givenname, address, username, password);
        this.customernr = customernr;
        this.bankDepotID = bankDepotID;
    }

    private int bankDepotID;

    public int getCustomerNr() {
        return customernr;
    }

    public Customer(){}


    public void setCustomerNr(int customerNr) {
        this.customernr = customerNr;
    }

    public int getCustomernr() {
        return customernr;
    }

    public void setCustomernr(int customernr) {
        this.customernr = customernr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customernr=" + customernr +
                ", bankDepotID=" + bankDepotID +
                ", svnr=" + svnr +
                ", name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
