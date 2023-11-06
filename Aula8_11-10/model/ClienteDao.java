package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.conexao;

public class ClienteDao {
	
	Connection con;
	
	
	
	public void Salvar(Cliente cli) {
		
		try {
		
		con = new conexao().conectar();
	
		String sql = "insert into cliente(nome, telefone)values(?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setString(1,cli.getNome());
		stmt.setString(2,cli.getTelefone());
		stmt.executeUpdate();
		
		stmt.close();
	}
		
		catch(Exception erro) {
			
		}
	
	}
}