package br.ifpr.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* Classe utilitária que cria uma conexão
 * com uma base de dados
 */
public class Conexao {

	public static Connection getConexao() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/pedidos",
				"root", "root");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar na base de dados.");
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
