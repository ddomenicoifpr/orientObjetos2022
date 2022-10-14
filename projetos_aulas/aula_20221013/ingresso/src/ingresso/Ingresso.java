package ingresso;

public class Ingresso {

	private Float valor;
	
	public Ingresso(Float valor) {
		super();
		this.valor = valor;
	}
	
	public Ingresso() {
		super();
	}

	public void imprimirValor() {
		System.out.println("Valor do ingresso: " + this.valor);
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
}
