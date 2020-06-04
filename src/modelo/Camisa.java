package modelo;

public class Camisa{
	
	private Integer codigoCamisa;
	private String modeloManga; // longa | curta
	private String modeloGola; // v | canoa | rule | u
	private String tecidoCamisa; // algodão | linho | poliester
	private String corPrimaria;
	private String corSecundaria;
	private String tamanho; // P | PP | M | G | GG | EXG
	
	public Camisa() {
		
	}
	
	public Camisa(Integer codigoCamisa, String modeloManga, String modeloGola, String tecidoCamisa, String corPrimaria,
			String corSecundaria, String tamanho) {
		this.codigoCamisa = codigoCamisa;
		this.modeloManga = modeloManga;
		this.modeloGola = modeloGola;
		this.tecidoCamisa = tecidoCamisa;
		this.corPrimaria = corPrimaria;
		this.corSecundaria = corSecundaria;
		this.tamanho = tamanho;
	}
	
	public Integer getCodigoCamisa() {
		return codigoCamisa;
	}
	public void setCodigoCamisa(Integer codigoCamisa) {
		this.codigoCamisa = codigoCamisa;
	}
	public String getModeloManga() {
		return modeloManga;
	}
	public void setModeloManga(String modeloManga) {
		this.modeloManga = modeloManga;
	}
	public String getModeloGola() {
		return modeloGola;
	}
	public void setModeloGola(String modeloGola) {
		this.modeloGola = modeloGola;
	}
	public String getTecidoCamisa() {
		return tecidoCamisa;
	}
	public void setTecidoCamisa(String tecidoCamisa) {
		this.tecidoCamisa = tecidoCamisa;
	}
	public String getCorPrimaria() {
		return corPrimaria;
	}
	public void setCorPrimaria(String corPrimaria) {
		this.corPrimaria = corPrimaria;
	}
	public String getCorSecundaria() {
		return corSecundaria;
	}
	public void setCorSecundaria(String corSecundaria) {
		this.corSecundaria = corSecundaria;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	

}
