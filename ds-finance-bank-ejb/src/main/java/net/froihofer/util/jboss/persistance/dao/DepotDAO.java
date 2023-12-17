package net.froihofer.util.jboss.persistance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class DepotDAO {

    @PersistenceContext(unitName = "ds-finance-bank-depotunit")

    private EntityManager entityManager;

    public DepotDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-depotunit");
        entityManager = emf.createEntityManager();
    }
}
