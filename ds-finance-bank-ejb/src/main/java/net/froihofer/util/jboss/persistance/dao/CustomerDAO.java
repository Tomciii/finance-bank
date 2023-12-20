package net.froihofer.util.jboss.persistance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class CustomerDAO {
    @PersistenceContext(unitName = "ds-finance-bank-customerunit")

    private EntityManager entityManager;

    public CustomerDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-customerunit");
        entityManager = emf.createEntityManager();
    }
}
