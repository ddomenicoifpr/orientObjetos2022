package ingresso;

public class IngressoVIP extends Ingresso {
	
	private Float valorAdicional;

	public IngressoVIP(Float valorAdicional) {
		super();
		this.valorAdicional = valorAdicional;
	}

	public IngressoVIP() {
		super();
	}
	
	public void imprimirValor() {
		Float valorTotal = 
				this.valor + this.valorAdicional;
		System.out.println("Valor do ingresso: " + 
					valorTotal);
	}

	public Float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
