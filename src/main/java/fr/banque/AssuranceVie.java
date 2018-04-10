package fr.banque;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="assurance_vie")
public class AssuranceVie extends Compte{

	@Column(name = "DATE_FIN", nullable = false)
	private LocalDate dateFin;
	@Column(name = "TAUX", length = 5, nullable = false)
	private Double taux;

	public AssuranceVie(String numero, Double solde, LocalDate dateFin, Double taux) {
		super(numero, solde);
		this.dateFin = dateFin;
		this.taux = taux;
	}
	
	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	@Override
	public String toString() {
		return "AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}
}
