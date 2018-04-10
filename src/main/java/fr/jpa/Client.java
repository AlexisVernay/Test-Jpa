package fr.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {
	@Id
	private Integer id;
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunts;
	
	public Client(){
		emprunts = new HashSet<Emprunt>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void nom(String nom) {
		this.nom = nom;
	}
	
	public String getprenom() {
		return prenom;
	}
	
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String toString(){
		return "Nom: " + getNom() + ", Pr�nom: " + getprenom() + "\n" + emprunts.toString();
	}
}
