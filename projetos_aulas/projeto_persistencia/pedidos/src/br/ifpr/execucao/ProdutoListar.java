package br.ifpr.execucao;

import java.sql.SQLException;
import java.util.List;

import br.ifpr.dao.ProdutoDAO;
import br.ifpr.modelo.Produto;

public class ProdutoListar {

	public static void main(String[] args) throws SQLException {
		ProdutoDAO prodDAO = new ProdutoDAO();
		List<Produto> lista = prodDAO.listar();
		
		System.out.println(lista.size());
		/*for (Produto produto : lista) {
			System.out.println(produto);
		}*/
		
		for(int i=0; i<lista.size(); i++) {
			Produto produto = lista.get(i);
			System.out.println(produto);
		}
	}

}
