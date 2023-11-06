package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.conexao;

public class ClienteDao {

	Connection con;

	ResultSet rs;

	public void Salvar(Cliente cli) {
		
		//String sqlx = "SELECT idcliente FROM cliente WHERE nome=? AND telefone=?";

		try {

			con = new conexao().conectar();

			String sql = "insert into cliente(nome, telefone)values(?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, cli.getNome());
			stmt.setString(2, cli.getTelefone());
			stmt.executeUpdate();

			stmt.close();
			con.close();
		}

		catch (Exception erro) {

		}

	}

	public ArrayList<Cliente> Listar() {

		try {

			con = new conexao().conectar();
			ArrayList<Cliente> clientes = new ArrayList<>();
			String sql = "select * from cliente WHERE status = 'on'";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idcliente = rs.getInt(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				clientes.add(new Cliente(idcliente, nome, telefone));
			}

			return clientes;

		}

		catch (Exception erro) {
			System.out.println(erro);
			return null;
		}
	}

}