package fr.banque;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import fr.jpa.Emprunt;

@Entity
@Table(name="banque")
public class Banque {
	@Id
	private Integer id;
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> clients;
	
	public Banque(){
		clients = new HashSet<Client>();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Set<Client> getClients() {
		return clients;
	}
	
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + ", clients=" + clients + "]";
	}
	
}
