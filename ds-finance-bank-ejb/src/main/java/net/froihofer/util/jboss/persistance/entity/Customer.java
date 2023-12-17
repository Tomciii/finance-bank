package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="CUSTOMER")
public class Customer implements Serializable {
    @Id
    private int svnr;
}
