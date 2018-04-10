package fr.banque;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "DATE", nullable = false)
	private LocalDateTime date;
	@Column(name = "MONTANT", length = 30, nullable = false)
	private Double montant;
	@Column(name = "MOTIF", length = 300, nullable = false)
	private String motif;
	
	public Operation(LocalDateTime date, Double montant, String motif) {
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	@Override
	public String toString() {
		return "Operation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
	}
}
