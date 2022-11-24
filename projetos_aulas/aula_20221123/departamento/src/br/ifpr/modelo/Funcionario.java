package br.ifpr.modelo;

public class Funcionario {

	private String nome;
	private Integer idade;
	private String cargo;
	private Float salario;
	private Departamento depto;
	
	public String retornaNomeDepto() {
		return this.depto.getNome();
	}
	
	public String retornaDadosDepartamento() {
		//Forma 1
		/*return this.depto.getNome() +
				" - " +
				this.depto.getNumeroSala();
		*/
		
		//Forma 2
		//return this.depto.retornaDadosDepto();
		
		//Forma 3
		return this.depto.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public Departamento getDepto() {
		return depto;
	}
	public void setDepto(Departamento depto) {
		this.depto = depto;
	}
	
}
