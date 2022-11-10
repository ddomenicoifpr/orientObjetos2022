package br.ifpr.modelo;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private String fabricante;
	private Integer ano;

	public String retornaDadosVeiculo() {
		String dados = "Placa: " + this.placa;
		dados = dados + " Modelo: " + this.modelo;
		dados += " Fabricante: " + this.fabricante;
		dados += " Ano: " + this.ano;
		
		return dados;
	}
		
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}
