package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="EMPLOYEE")
public class Employee extends Person implements Serializable {

    @Column(name="MANR")
    private int MANR;

    public Employee(){}

    public Employee(int customerNr) {
        this.MANR = customerNr;
    }

    public Employee(int svnr, String name, String givenname, String address, String username, String password, int customerNr) {
        super(svnr, name, givenname, address, username, password);
        this.MANR = customerNr;
    }

    public int getCustomerNr() {
        return MANR;
    }

    public void setCustomerNr(int customerNr) {
        this.MANR = customerNr;
    }
    @Override
    public String toString() {
        return "Person{" +
                "svnr=" + svnr +
                ", name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", MANr='" + MANR + "\'" +
                '}';
    }
}
