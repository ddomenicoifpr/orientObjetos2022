package br.ifpr.execucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.ifpr.dao.ProdutoDAO;
import br.ifpr.modelo.Produto;
import br.ifpr.util.Conexao;

public class ProdutoCriar {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		
		Produto produto = new Produto();
		
		System.out.println("Informe a descrição: ");
		String desc = reader.readLine();
		produto.setDescricao(desc);
		
		System.out.println("Informe a unidade de medida: ");
		String uniM = reader.readLine();
		produto.setUnidadeMedida(uniM);
		
		System.out.println(produto.retornaDadosProduto());
		//System.out.println(produto);
		
		//Salvar o objeto no banco de dados
		ProdutoDAO prodDAO = new ProdutoDAO();
		prodDAO.inserir(produto);
	}

}
