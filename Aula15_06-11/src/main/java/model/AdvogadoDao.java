package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import util.conexao;

public class AdvogadoDao {

	Connection con;
	ResultSet rs;

	public void Salvar(Advogado adv) {

		try {

			con = new conexao().conectar();

			String sql = "insert into advogado(oab, nome, telefone, email)values(?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, adv.getOab());
			stmt.setString(2, adv.getNome());
			stmt.setString(3, adv.getTelefone());
			stmt.setString(4, adv.getEmail());
			stmt.executeUpdate();

			stmt.close();
		}

		catch (Exception erro) {
			erro.printStackTrace();

		}
	}

	public ArrayList<Advogado> Listar() {

		try {

			con = new conexao().conectar();
			ArrayList<Advogado> advogados = new ArrayList<>();
			String sql = "select * from advogado";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idadv = rs.getInt("idadv");
				Date data = rs.getDate("dataadv");
				String oab = rs.getString("oab");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				String status = rs.getString("statusadv");
				String email = rs.getString("email");

				advogados.add(new Advogado(idadv, data, oab, nome, telefone, email, status));
			}

			return advogados;
		}

		catch (Exception erro) {
			System.out.println(erro);
			return null;
		}
	}
}
