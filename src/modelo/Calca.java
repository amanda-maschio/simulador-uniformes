package modelo;

public class Calca{
	
	private Integer codigoCalca;
	private String tipoCalca; // longa | curta
	private String tecidoCalca; // algodao | la | linho | moletom
	private String corPrimaria;
	private String corSecundaria;
	private String tamanho; // P | PP | M | G | GG | EXG
	
	public Calca() {
		
	}

	public Calca(String tipoCalca, String tecidoCalca, String corPrimaria, String corSecundaria, String tamanho) {
		super();
		this.tipoCalca = tipoCalca;
		this.tecidoCalca = tecidoCalca;
		this.corPrimaria = corPrimaria;
		this.corSecundaria = corSecundaria;
		this.tamanho = tamanho;
	}

	public Integer getCodigoCalca() {
		return codigoCalca;
	}
	public void setCodigoCalca(Integer codigoCalca) {
		this.codigoCalca = codigoCalca;
	}
	public String getTipoCalca() {
		return tipoCalca;
	}
	public void setTipoCalca(String tipoCalca) {
		this.tipoCalca = tipoCalca;
	}
	public String getTecidoCalca() {
		return tecidoCalca;
	}
	public void setTecidoCalca(String tecidoCalca) {
		this.tecidoCalca = tecidoCalca;
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
