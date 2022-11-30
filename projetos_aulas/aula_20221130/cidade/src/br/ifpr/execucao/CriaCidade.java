package br.ifpr.execucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.ifpr.modelo.Cidade;
import br.ifpr.modelo.Estado;

public class CriaCidade {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		Estado est = new Estado();
		
		System.out.println("------ESTADO------");
		System.out.println("Informe o nome do Estado: ");
		String nome = reader.readLine();
		est.setNome(nome);
		
		System.out.println("Informe sigla do Estado: ");
		String sigla = reader.readLine();
		est.setSigla(sigla);
		
		Cidade city = new Cidade(); 
		
		System.out.println("------CIDADE------");
		System.out.println("Informe o nome da Cidade: ");
		String nomeC = reader.readLine();
		city.setNome(nomeC);
		
		System.out.println("Informe os habitantes da Cidade: ");
		String habit = reader.readLine();
		city.setQtdHabitantes(Integer.parseInt(habit));
		
		System.out.println("Informe a área da Cidade: ");
		String area = reader.readLine();
		city.setAreaTerritorial(Float.parseFloat(area));
		
		System.out.println("Informe a altitude da Cidade: ");
		String altitude = reader.readLine();
		city.setAltitude(Float.parseFloat(altitude));
		
		city.setEstado(est);
		
		//Imprimir dados do estado a partir da cidade
		System.out.println();
		System.out.println(city.retornaDadosEstado());
		System.out.println(city.getEstado().getNome());
		System.out.println(city.getEstado().getSigla());
	}

}
