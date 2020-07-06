package modelo;

public class Uniforme{
	
	private Integer codigoUniforme;
	private String tipo; // Esportivo | Escolar | Empresa
	private Integer hasGoleiro;
	private Integer hasMeia;
	
	private Camisa camisa;
	private Calca calca;
	private Meia meia;
	
	public Uniforme() {
		
	}

	public Uniforme(String tipo, Integer hasGoleiro, Integer hasMeia, Camisa camisa, Calca calca, Meia meia) {
		super();
		this.tipo = tipo;
		this.hasGoleiro = hasGoleiro;
		this.hasMeia = hasMeia;
		this.camisa = camisa;
		this.calca = calca;
		this.meia = meia;
	}

	public Integer getHasGoleiro() {
		return hasGoleiro;
	}

	public void setHasGoleiro(Integer hasGoleiro) {
		this.hasGoleiro = hasGoleiro;
	}

	public Integer getHasMeia() {
		return hasMeia;
	}

	public void setHasMeia(Integer hasMeia) {
		this.hasMeia = hasMeia;
	}

	public Integer getCodigoUniforme() {
		return codigoUniforme;
	}
	public void setCodigoUniforme(Integer codigoUniforme) {
		this.codigoUniforme = codigoUniforme;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	public Calca getCalca() {
		return calca;
	}
	public void setCalca(Calca calca) {
		this.calca = calca;
	}
	public Meia getMeia() {
		return meia;
	}
	public void setMeia(Meia meia) {
		this.meia = meia;
	}

	
}
