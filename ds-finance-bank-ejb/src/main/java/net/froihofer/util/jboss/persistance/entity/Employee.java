package net.froihofer.util.jboss.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
    @Id
    private int svnr;
}
