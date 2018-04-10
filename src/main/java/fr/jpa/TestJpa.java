package fr.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();

		/*Livre l1 = new Livre();
		
		l1 = em.find(Livre.class, 1);
		if (l1 != null){
			LOG.info(l1.getTitre() + " de " + l1.getAuteur());
		}*/

		/*l1.setId(6);
		l1.setTitre("Le Seigneur des Anneaux: La communauté de l'Anneau");
		l1.setAuteur("J.R.R Tolkien");
		em.persist(l1);*/
		
			
		/*TypedQuery<Emprunt> query = em.createQuery("SELECT a FROM Emprunt a WHERE a.id=:reference",
				Emprunt.class);
		query.setParameter("reference", 1);
		
		if(query !=null) {
			List<Emprunt> emprunts = query.getResultList();
			for(Emprunt e: emprunts) {
				LOG.info(e.toString());
			}
		}
		
		TypedQuery<Client> query2 = em.createQuery("SELECT a FROM Client a WHERE a.id=:reference",
				Client.class);
		query2.setParameter("reference", 1);
		
		if(query2 !=null) {
			List<Client> Clients = query2.getResultList();
			for(Client e: Clients) {
				LOG.info(e.toString());
			}
		}*/
		
	}
}
