package objetos;

import cachorro.Cachorro;

public class CriarCachorros {

	public static void main(String[] args) {
		
		Cachorro pingo = new Cachorro();
		pingo.setTamanhoRabo("Curto");
		pingo.setTipoLatido("Grosso");
		pingo.setRaca("Boxer");
		pingo.setTamanho("Grande");
		pingo.setNome("Pingo");
		pingo.latir();
		pingo.correr();
		pingo.comer();
				
		System.out.println("\n");
		
		Cachorro scoob = new Cachorro("Medio", "Fino", 
				"Pinscher", "Pequeno");
		scoob.setNome("Scoob");
		scoob.latir();
		scoob.correr();
		scoob.comer();
	}

}
