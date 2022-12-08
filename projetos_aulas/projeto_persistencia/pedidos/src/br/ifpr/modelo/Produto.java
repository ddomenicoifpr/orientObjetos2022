package br.ifpr.modelo;

public class Produto {

	private Integer idProduto;
	private String descricao;
	private String unidadeMedida;
	
	public String retornaDadosProduto() {
		String prod = "ID = " + idProduto;
		prod += " | Descrição = " + descricao;
		prod += " | Unidade Medida = " + unidadeMedida;
		
		return prod;
	}
	
	public String toString() {
		return this.retornaDadosProduto();
	}
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
}
