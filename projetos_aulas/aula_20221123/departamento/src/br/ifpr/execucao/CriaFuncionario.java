package br.ifpr.execucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.ifpr.modelo.Departamento;
import br.ifpr.modelo.Funcionario;

public class CriaFuncionario {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =
				new BufferedReader(
				new InputStreamReader(System.in) );
		
		System.out.println(
				"-----Informe os dados do departamento-----");
		Departamento depto = new Departamento();
		
		//Ler dados do depto
		System.out.println("Informe o nome do Departamento:");
		String nome = reader.readLine();
		depto.setNome(nome);
		
		System.out.println("Informe a sala do Departamento:");
		String sala = reader.readLine();
		depto.setNumeroSala(Integer.parseInt(sala));
		
		System.out.println(
				"-----Informe os dados do funcionario-----");
		Funcionario func = new Funcionario();
		//Ler dados do funcionário
		System.out.println("Informe o nome do funcionário:");
		nome = reader.readLine();
		func.setNome(nome);
		
		System.out.println("Informe a idade do funcionário:");
		String idade = reader.readLine();
		func.setIdade(Integer.parseInt(idade));
		
		System.out.println("Informe o cargo do funcionário:");
		func.setCargo(reader.readLine());
		
		System.out.println("Informe o salário do funcionário:");
		String salario = reader.readLine();
		func.setSalario(Float.parseFloat(salario));
		
		//Atribuir o departameto para o funcionário
		func.setDepto(depto);
		
		System.out.println();
		System.out.println(
				"Depto do funcionário: " + 
			     func.retornaNomeDepto());
		System.out.println("Dados do departamento: " +
				 func.retornaDadosDepartamento());
	}

}
