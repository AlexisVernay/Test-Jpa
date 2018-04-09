package fr.jpa;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="emprunt")
public class Emprunt {
	@Id
	private Integer id;
	@Column(name = "DATE_DEBUT", nullable = false)
	private LocalDateTime dateDebut;
	@Column(name = "DATE_FIN", nullable = false)
	private LocalDateTime dateFin;
	@Column(name = "DELAI", length = 10)
	private Integer delai;
	
	@ManyToMany
	@JoinTable(name = "compo",
		joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_LIV",  referencedColumnName="ID")
	)
	private Set<Livre> livres;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	public Emprunt(){
		livres = new HashSet<Livre>();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDateTime getDate_debut() {
		return dateDebut;
	}
	
	public void setDate_debut(LocalDateTime date_debut) {
		this.dateDebut = date_debut;
	}
	
	public LocalDateTime getDateFin() {
		return dateFin;
	}
	
	public void setDate_fin(LocalDateTime date_fin) {
		this.dateFin = date_fin;
	}
	
	public Integer getDelai() {
		return delai;
	}
	
	public void setDelai(Integer delai) {
		this.delai = delai;
	}
	
	public Set<Livre> getLivres() {
		return livres;
	}
	
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}
	
	public String toString(){
		return "Emprunt numéro : " + getId() + ", contient les livres " + livres.toString();
	}
}
