package fr.banque;

import javax.persistence.*;

@Entity
@Table(name="virement")
public class Virement extends Operation {
	@Column(name = "BENEFICIAIRE", length = 30, nullable = false)
	private String beneficiaire;
	
	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compteOp;
	
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
