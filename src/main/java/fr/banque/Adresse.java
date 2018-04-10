package fr.banque;

import javax.persistence.*;

@Embeddable
public class Adresse {

	@Column(name = "NUM", length = 20, nullable = false)
	private int numero;
	@Column(name = "RUE", length = 100, nullable = false)
	private String rue;
	@Column(name = "CODE_POSTAL", length = 10, nullable = false)
	private int codePostam;
	@Column(name = "VILLE", length = 50, nullable = false)
	private String ville;

	public Adresse(){
		
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostam() {
		return codePostam;
	}

	public void setCodePostam(int codePostam) {
		this.codePostam = codePostam;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Adresse [ numero=" + numero + ", rue=" + rue + ", codePostam=" + codePostam + ", ville="
				+ ville + "]";
	}
	
	
}
