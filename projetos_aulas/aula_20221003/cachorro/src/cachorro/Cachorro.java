package cachorro;

public class Cachorro {
	
	private String tamanhoRabo;
	private String tipoLatido;
	private String raca;
	private String tamanho;
	private String nome;
	
	public Cachorro(String tamanhoRabo, String tipoLatido, String raca, String tamanho) {
		super();
		this.tamanhoRabo = tamanhoRabo;
		this.tipoLatido = tipoLatido;
		this.raca = raca;
		this.tamanho = tamanho;
	}
	
	public Cachorro() {
		super();
	}

	//Método que indica que o cachorro vai comer
	public void comer() {
		if(tamanho.equals("Grande"))
			System.out.println(nome + " é um cachorro " + tamanho + " e come Bastante.");
		else
			System.out.println(nome + " é um cachorro " + tamanho + " e como Pouco.");
	}
	
	public void latir() {
		System.out.println(tipoLatido);
	}
	
	public void correr() {
		if(tamanho.equals("Grande"))
			System.out.println("Rápido");
		else
			System.out.println("Lento");
	}
	
	public void pular() {
		
	}

	public String getTamanhoRabo() {
		return tamanhoRabo;
	}

	public void setTamanhoRabo(String tamanhoRabo) {
		this.tamanhoRabo = tamanhoRabo;
	}

	public String getTipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(String tipoLatido) {
		this.tipoLatido = tipoLatido;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

}
