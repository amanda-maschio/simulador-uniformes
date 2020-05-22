package modelo;

public class Calca{
	
	private Integer codigoCalca;
	private String tipoCalca; // longa | curta
	private String tecidoCalca; // algodao | la | linho | corteline | moletom
	private String corPrimaria;
	private String corSecundaria;
	private String tamanho; // P | PP | M | G | GG | EXG
	
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
