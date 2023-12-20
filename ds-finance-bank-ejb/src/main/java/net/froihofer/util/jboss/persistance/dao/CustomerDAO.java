package net.froihofer.util.jboss.persistance.dao;

import net.froihofer.util.jboss.persistance.entity.Customer;

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

    public void persist(Customer customer) {
        entityManager.getTransaction().begin();
        Customer managedDepot = entityManager.merge(customer);
        entityManager.persist(managedDepot);
        entityManager.getTransaction().commit();
    }
}
