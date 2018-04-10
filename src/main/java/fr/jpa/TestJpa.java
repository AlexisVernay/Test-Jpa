package fr.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.banque.Adresse;
import fr.banque.AssuranceVie;
import fr.banque.Banque;
import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.LivretA;
import fr.banque.Virement;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Client cl1 = new Client("Jean", "De Lattre", LocalDate.of(1887, 8, 26), new Adresse(210, "Cours de la Libération", 38100, "GRENOBLE"));
		Client cl2 = new Client("Charles", "De Gaulle", LocalDate.of(1889, 3, 04), new Adresse(16, "Rue de la Joie", 75500, "PARIS"));	
		
		Banque b1 = new Banque("Crédit Dauphinois");
			
		Compte com1 = new Compte("14556645466AMD", 2000.50);	
		AssuranceVie av1 = new AssuranceVie("251556LIFE", 10000.0, LocalDate.of(2010, 7, 11), 50.0); 
		LivretA la1 = new LivretA("155412A", 5000.0, 2.0);
				
		Set<Compte> listCompte = new HashSet<>();
		Set<Compte> listCompteClient = new HashSet<>();
		Set<Virement> listVir = new HashSet<>();		
		
		Virement vir1 = new Virement(LocalDateTime.of(2011, 12, 24, 10, 1), 100.0, "Cadeau de Noël", "Papa");
		
		// Attribution de la banque aux clients 1 et 2
		cl1.setBanque(b1);
		cl2.setBanque(b1);
		
		// Attribution de compte 1 aux clients 1 et 2
		listCompte.add(com1);
		cl1.setComptes(listCompte);
		cl2.setComptes(listCompte);
		
		// Rajout des comptes assuranceVie 1 et livretA 1 au client 1
		listCompteClient.add(av1);
		listCompteClient.add(la1);
		cl1.setComptes(listCompteClient);
		
		// Rajout du virement 1 au  compte livretA 1
		listVir.add(vir1);
		la1.setVirement(listVir);
		vir1.setCompteOp(la1);
		
		em.persist(b1);
		em.persist(la1);
		em.persist(av1);
		em.persist(vir1);
		em.persist(cl1);
		em.persist(cl2);
		em.persist(com1);
		
		et.commit();
		em.close();
	}
}
