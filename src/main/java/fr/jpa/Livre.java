package fr.jpa;

import javax.persistence.*;

@Entity
@Table(name="livre")
public class Livre {
	@Id
	private Integer id;
	@Column(name = "TITRE", length = 50, nullable = false)
	private String titre;
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String toString(){
		return "Titre: " + getTitre() + ", Auteur: " + getAuteur() + "\n";
	}
}
