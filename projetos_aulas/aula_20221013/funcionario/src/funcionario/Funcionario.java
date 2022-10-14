package funcionario;

public class Funcionario {
	
	private String primeiroNome;
	private String sobrenome;
	private Float salarioMensal;
	
	//Construtor
	public Funcionario(String primeiroNome, String sobrenome, 
			Float salarioMensal) {
		super();
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}
	
	//Métodos
	public void imprimirSalarioAnual() {
		System.out.println(this.primeiroNome + 
				" " + 
				this.sobrenome +
				" ganha R$ " + 
				this.salarioAnual() + 
				" anulamente");
	}
	
	public Float salarioAnual() {
		//Float salarioAnual = this.salarioMensal*13;
		//return salarioAnual;
		return this.salarioMensal*13;
	}
	
	public void concederAumento(Integer percentualAumento) {
		Float percent = (float) (percentualAumento / 100.0); //Cast de tipo requerido pelo JAVA
		Float aumento = this.salarioMensal * percent;
		this.salarioMensal = this.salarioMensal + aumento;
	}
	
	//FIM Métodos
	
	//GETs e SETs
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Float getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(Float salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public String toString() {
		return this.primeiroNome;
	}
	
}
