package main;

import ingresso.Ingresso;
import ingresso.IngressoVIP;

public class Main {

	public static void main(String[] args) {
		Ingresso ingComum = new Ingresso(25F);
		ingComum.imprimirValor();
		
		IngressoVIP ingVIP = new IngressoVIP(15F);
		ingVIP.setValor(25F);
		ingVIP.imprimirValor();
	}

}
