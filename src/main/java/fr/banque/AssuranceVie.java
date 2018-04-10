package fr.banque;

import javax.persistence.*;

@Entity
@Table(name="assurance_vie")
public class AssuranceVie extends Compte{
	@Column(name = "DATE_FIN", nullable = false)
	private Double dateFin;
	@Column(name = "TAUX", length = 5, nullable = false)
	private Double taux;

	public Double getDateFin() {
		return dateFin;
	}

	public void setDateFin(Double dateFin) {
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
