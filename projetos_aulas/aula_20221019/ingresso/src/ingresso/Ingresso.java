package ingresso;

public class Ingresso {

	protected Float valor;
	
	public Ingresso() {
		super();
	}
	
	public Ingresso(Float valor) {
		super();
		this.valor = valor;
	}

	public void imprimirValor() {
		System.out.println("Valor do ingresso: " 
				+ this.valor);
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
} //Fim da classe Ingresso


