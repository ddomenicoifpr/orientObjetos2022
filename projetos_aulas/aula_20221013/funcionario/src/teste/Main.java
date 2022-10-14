package teste;

import funcionario.Funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario func1 = 
				new Funcionario("João", "da Silva", 15000.25F);
		func1.imprimirSalarioAnual();
		
		Funcionario func2 = 
				new Funcionario("Fabiana", "Carraro", 4020.12F);
		func2.imprimirSalarioAnual();
		
		//Verifica qual dos funcioários tem o maior salário
		Float maiorSalarioAnual = 0F;
		String nomeDoMaiorSalario;
		//Se salario_func1 > salario_func2
		if(func1.salarioAnual() > func2.salarioAnual()) {
			maiorSalarioAnual = func1.salarioAnual();
			nomeDoMaiorSalario = func1.getPrimeiroNome();
		} else { //Senão
			maiorSalarioAnual = func2.salarioAnual();
			nomeDoMaiorSalario = func2.getPrimeiroNome();
		}
		
		System.out.println("O maior salário anual é: " 
				+ maiorSalarioAnual + 
				" recebido por: " + nomeDoMaiorSalario);
		
		//Rotina para conceder aumento ao funcionário
		System.out.println("\n\n----NOVOS SALÁRIOS APÓS AUMENTO----");
		func1.concederAumento(10);
		func1.imprimirSalarioAnual();
		
		func2.concederAumento(25);
		func2.imprimirSalarioAnual();
	}

}
