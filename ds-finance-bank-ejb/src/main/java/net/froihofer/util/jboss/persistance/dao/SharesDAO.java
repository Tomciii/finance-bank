package net.froihofer.util.jboss.persistance.dao;

import net.froihofer.util.jboss.persistance.entity.Shares;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class SharesDAO {


    @PersistenceContext(unitName = "ds-finance-bank-sharesunit")

    private EntityManager entityManager;

    public SharesDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-sharesunit");
        entityManager = emf.createEntityManager();
    }

    public Shares findById(String id) {
        return entityManager.find(Shares.class, id);
    }

    public void persist(Shares shares) {
        entityManager.persist(shares);
    }
}
