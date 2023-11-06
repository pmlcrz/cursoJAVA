package model;

public class Causas {
	public Causas(int idCausas, String tipos) {
		super();
		this.idCausas = idCausas;
		Tipos = tipos;
	}
	private int idCausas;
	private String Tipos;
	public int getIdCausas() {
		return idCausas;
	}
	public void setIdCausas(int idCausas) {
		this.idCausas = idCausas;
	}
	public String getTipos() {
		return Tipos;
	}
	public void setTipos(String tipos) {
		Tipos = tipos;
	}
}

