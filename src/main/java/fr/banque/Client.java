package fr.banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	@Column(name = "DATE_NAISSANCE", nullable = false)
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse Adresse;
	
	@ManyToOne
	@JoinColumn(name="ID_BANK")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name = "compo",
	joinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "ID_COM",  referencedColumnName="ID")
			)
	private Set<Compte> comptes;
	
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
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public Adresse getAdresse() {
		return Adresse;
	}

	public void setAdresse(Adresse adresse) {
		Adresse = adresse;
	}
	
	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", banque=" + banque + "]";
	}
}
