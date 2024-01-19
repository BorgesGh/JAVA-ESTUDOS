package org.pessoal.aplication;

import org.pessoal.domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Corolla","Preto",80.890);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jpa"); // Esse nome é dado no arquivo persistence.xml
        EntityManager em = emf.createEntityManager(); // Controlador das ações no BD
        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();

        System.out.println("Fim!");
    }
}