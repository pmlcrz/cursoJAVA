package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import util.conexao; //nome de classe sempre maiuscula em java e métodos sempre minuscula

public class ClienteDao {
	Connection con;
	ResultSet rs;

	public void Salvar(Cliente cli) {

		try {
			con = new conexao().conectar();
			String sql = "insert into cliente(nome,telefone)values(?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cli.getNome());
			stmt.setString(2, cli.getTelefone());
			stmt.executeUpdate();

			stmt.close();
			con.close();

		} catch (Exception erro) {
			erro.printStackTrace();
		}
	}

	public ArrayList<Cliente> Listar() {
		try {

			con = new conexao().conectar();
			ArrayList<Cliente> clientes = new ArrayList<>();
			String sql = "select * from cliente WHERE statuscliente='on'";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				int idcliente = rs.getInt("idcliente");
				Date data = rs.getDate("datacliente");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				String status = rs.getString("statuscliente");
				clientes.add(new Cliente(idcliente, data, nome, telefone, status));
			}

			return clientes;

		} catch (Exception erro) {
			System.out.println(erro);
			return null;
		}
		}
		

	public void Apagar(String id) {

		try {

			con = new conexao().conectar();
			String sql = "UPDATE cliente SET statuscliente = 'off' WHERE idcliente=?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();

		} catch (Exception erro) {
			erro.printStackTrace();
		}
	}
	
	public List<Cliente> Editar(String id){
		
		List<Cliente> cliente = new ArrayList<>();

		try {
			con = new conexao().conectar();
			String sql = "SELECT * FROM cliente WHERE idcliente = ? AND statuscliente = 'on'";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			int idcliente = rs.getInt("idcliente");
			Date data = rs.getDate("datacliente");
			String nome = rs.getString("nome");
			String telefone = rs.getString("telefone");
			cliente.add(new Cliente(idcliente, data, nome, telefone));
			return cliente;

		} catch (Exception erro) {
			erro.printStackTrace();
			return null;
			
		}
		
		//return cliente;
	}

}
