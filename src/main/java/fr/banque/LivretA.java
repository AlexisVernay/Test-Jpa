package fr.banque;

import javax.persistence.*;

@Entity
@Table(name="livre_a")
public class LivretA extends Compte{
	@Column(name = "TAUX", length = 5, nullable = false)
	private Double taux;
	
	public LivretA(String numero, Double solde, Double taux) {
		super(numero, solde);
		this.taux = taux;
	}
	
	public Double getTaux() {
		return taux;
	}
	
	public void setTaux(Double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}
}
