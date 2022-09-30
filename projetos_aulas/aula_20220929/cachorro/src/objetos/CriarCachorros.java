package objetos;

import cachorro.Cachorro;

public class CriarCachorros {

	public static void main(String[] args) {
		
		Cachorro pingo = new Cachorro();
		pingo.setTamanhoRabo("Curto");
		pingo.setTipoLatido("Grosso");
		pingo.setRaca("Boxer");
		pingo.setTamanho("Grande");
		pingo.latir();
		
		Cachorro scoob = new Cachorro("Medio", "Fino", 
				"Pinscher", "Pequeno");
		scoob.latir();
	}

}
