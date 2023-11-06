package model;

public class cliente {
	private int IdCliente;
	private String Nome;
	private String CPF;
	private String RG;
	private String Telefone;
	public cliente(int idCliente, String nome, String cPF, String rG, String telefone) {
		super();
		IdCliente = idCliente;
		Nome = nome;
		CPF = cPF;
		RG = rG;
		Telefone = telefone;
		
	}
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	
}
