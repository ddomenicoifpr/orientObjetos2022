package br.ifpr.modelo;

public class Cidade {
	
	private String nome;
	private Integer qtdHabitantes;
	private Float areaTerritorial;
	private Float altitude;
	private Estado estado;
	
	public String retornaDadosEstado() {
		String est = this.estado.getNome();
		est = est + " - ";
		//est += " - ";
		est += this.estado.getSigla();
		
		return est;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQtdHabitantes() {
		return qtdHabitantes;
	}
	public void setQtdHabitantes(Integer qtdHabitantes) {
		this.qtdHabitantes = qtdHabitantes;
	}
	public Float getAreaTerritorial() {
		return areaTerritorial;
	}
	public void setAreaTerritorial(Float areaTerritorial) {
		this.areaTerritorial = areaTerritorial;
	}
	public Float getAltitude() {
		return altitude;
	}
	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
