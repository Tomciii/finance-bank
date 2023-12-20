package net.froihofer.util.jboss.persistance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class BankDAO {
    @PersistenceContext(unitName = "ds-finance-bank-bankunit")

    private EntityManager entityManager;

    public BankDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-bankunit");
        entityManager = emf.createEntityManager();
    }
}
