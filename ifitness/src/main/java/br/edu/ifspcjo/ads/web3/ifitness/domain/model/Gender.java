package br.edu.ifspcjo.ads.web3.ifitness.domain.model;

public enum Gender {
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro"),
	PREFIRO_NAO_DIZER("Prefiro não dizer");
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private Gender(String description) {
		this.description = description;
	}
	
}
