package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url ="jdbc:mysql://127.0.0.1:3306/escritorio";
	private String user = "root";
	private String password = "";



public Connection conectar () {
	
	Connection con = null;
	
	// Try { catch () {}} é para tratamento de erro
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		return con;
	} catch (Exception erro) {
		System.out.println(erro);
		return null;
	}
}


}

