package modelo;

public class Meia{
	
	private Integer codigoMeia;
	private String tipoMeia; // curta | longa
	private String cor;
	private String tecidoMeia; // la | algodao | fibra | poliester
	
	public Meia() {
		
	}
	
	public Meia(Integer codigoMeia, String tipoMeia, String cor, String tecidoMeia) {
		this.codigoMeia = codigoMeia;
		this.tipoMeia = tipoMeia;
		this.cor = cor;
		this.tecidoMeia = tecidoMeia;
	}
	
	public Integer getCodigoMeia() {
		return codigoMeia;
	}
	public void setCodigoMeia(Integer codigoMeia) {
		this.codigoMeia = codigoMeia;
	}
	public String getTipoMeia() {
		return tipoMeia;
	}
	public void setTipoMeia(String tipoMeia) {
		this.tipoMeia = tipoMeia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTecidoMeia() {
		return tecidoMeia;
	}
	public void setTecidoMeia(String tecidoMeia) {
		this.tecidoMeia = tecidoMeia;
	}
	
	
	
}
