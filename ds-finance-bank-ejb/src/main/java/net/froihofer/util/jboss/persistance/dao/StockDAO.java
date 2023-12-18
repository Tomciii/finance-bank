package net.froihofer.util.jboss.persistance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class StockDAO {


    @PersistenceContext(unitName = "ds-finance-bank-stockunit")

    private EntityManager entityManager;

    public StockDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-stockunit");
        entityManager = emf.createEntityManager();
    }
}
