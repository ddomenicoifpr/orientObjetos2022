package br.ifpr.execucao;

import java.sql.Connection;
import java.sql.SQLException;

import br.ifpr.util.Conexao;

public class ConexaoTestar {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = Conexao.getConexao();
		System.out.println("Conexão realizada com sucesso!");
		conn.close();
	}
	
	
}
