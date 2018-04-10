package fr.banque;

import java.util.Set;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NUM", length = 20, nullable = false)
	private String numero;
	@Column(name = "SOLDE", nullable = false)
	private Double solde;
	
	@OneToMany(mappedBy="compteOp")
	private Set<Virement> virement;
	
	@ManyToMany(mappedBy = "comptes")
	private Set<Client> clients;
	
	public Compte(String numero, Double solde){
		this.numero = numero;
		this.solde = solde;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Double getSolde() {
		return solde;
	}
	
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Set<Virement> getVirement() {
		return virement;
	}

	public void setVirement(Set<Virement> virement) {
		this.virement = virement;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + ", clients=" + clients + ", operation="
				 + "]";
	}
	
	
}
