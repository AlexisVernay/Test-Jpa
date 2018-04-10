package fr.banque;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="virement")
public class Virement extends Operation {
	@Column(name = "BENEFICIAIRE", length = 30, nullable = false)
	private String beneficiaire;
	
	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compteOp;
	
	public Virement(LocalDateTime date, Double montant, String motif, String beneficiaire) {
		super(date, montant, motif);
		this.beneficiaire = beneficiaire;
	}
	
	public String getBeneficiaire() {
		return beneficiaire;
	}
	
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public Compte getCompteOp() {
		return compteOp;
	}

	public void setCompteOp(Compte compteOp) {
		this.compteOp = compteOp;
	}
	
	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}
}
