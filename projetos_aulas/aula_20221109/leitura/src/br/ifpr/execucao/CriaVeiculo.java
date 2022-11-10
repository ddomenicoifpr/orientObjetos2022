package br.ifpr.execucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.ifpr.modelo.Veiculo;

public class CriaVeiculo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =	new BufferedReader(
				new InputStreamReader(System.in));
		
		//String teste = reader.readLine();
		//System.out.println("Valor digitado: " + teste);
		
		Veiculo veiculo = new Veiculo(); 
		
		System.out.println("Informe a placa: ");
		String placa = reader.readLine();
		veiculo.setPlaca(placa);
		
		System.out.println("Informe a modelo: ");
		String modelo = reader.readLine();
		veiculo.setModelo(modelo);
		
		System.out.println("Informe o fabricante: ");
		String fab = reader.readLine();
		veiculo.setFabricante(fab);
		
		System.out.println("Informe o ano: ");
		String ano = reader.readLine();
		//Integer anoInt = Integer.parseInt(ano);
		veiculo.setAno(Integer.parseInt(ano));
		
		System.out.println(veiculo.retornaDadosVeiculo());
	}

}
