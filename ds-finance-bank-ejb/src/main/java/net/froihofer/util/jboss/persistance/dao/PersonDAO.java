package net.froihofer.util.jboss.persistance.dao;

import net.froihofer.util.jboss.persistance.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class PersonDAO {

    @PersistenceContext(unitName = "ds-finance-bank-persunit")

    private EntityManager entityManager;

    public PersonDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ds-finance-bank-persunit");
        entityManager = emf.createEntityManager();
    }

    public Person findById(int svnr) {
        return entityManager.find(Person.class, svnr);
    }

    public void persist(Person person) {
        entityManager.persist(person);
    }

    public void delete(Person person) {
        entityManager.remove(person);
    }

}
