package br.ifpr.modelo;

public class Departamento {

	private String nome;
	private Integer numeroSala;
	
	public String retornaDadosDepto() {
		return this.nome + " - " + this.numeroSala;
	}
	
	public String toString() {
		return this.retornaDadosDepto();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
	
}
