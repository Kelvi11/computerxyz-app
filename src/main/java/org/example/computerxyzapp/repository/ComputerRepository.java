package org.example.computerxyzapp.repository;

import org.example.computerxyzapp.model.Computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ComputerRepository {

    public List<Computer> getAll(){

        String queryString = "select c from Computer c";

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("computer-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery(queryString);
        List<Computer> computers = query.getResultList();

        entityManager.getTransaction().commit();

        return computers;
    }

    public void insert(Computer computer){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("computer-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(computer);

        entityManager.getTransaction().commit();
    }

    public Computer getById(int id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("computer-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Computer computer = entityManager.find(Computer.class, new Integer(id));

        entityManager.getTransaction().commit();

        return computer;
    }

    public void update(Computer computer){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("computer-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.merge(computer);

        entityManager.getTransaction().commit();
    }

    public void delete(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("computer-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Computer computer = entityManager.find(Computer.class, new Integer(id));
        entityManager.remove(computer);

        entityManager.getTransaction().commit();
    }

}
