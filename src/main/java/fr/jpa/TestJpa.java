package fr.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityF = Persistence.createEntityManagerFactory("Test");
		EntityManager entity = entityF.createEntityManager();

	}

}
