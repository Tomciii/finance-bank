package net.froihofer.util.jboss.persistance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class EmployeeDAO {

    @PersistenceContext(unitName = "ds-finance-bank-employeeunit")

    private EntityManager entityManager;

    public EmployeeDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-employeeunit");
        entityManager = emf.createEntityManager();
    }
}
