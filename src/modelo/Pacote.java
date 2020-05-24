package modelo;

public class Pacote {
	
	private Integer codigoPacote;
	private Integer qtdUniforme;
	private Integer qtdUniformeGoleiro;
	private Uniforme uniforme;
	
	public Integer getQtdUniformeGoleiro() {
		return qtdUniformeGoleiro;
	}
	public void setQtdUniformeGoleiro(Integer qtdUniformeGoleiro) {
		this.qtdUniformeGoleiro = qtdUniformeGoleiro;
	}
	public void setCodigoPacote(Integer codigoPacote) {
		this.codigoPacote = codigoPacote;
	}
	public void setQtdUniforme(Integer qtdUniforme) {
		this.qtdUniforme = qtdUniforme;
	}
	public int getQtdUniforme() {
		return qtdUniforme;
	}
	public void setQtdUniforme(int qtdUniforme) {
		this.qtdUniforme = qtdUniforme;
	}
	public int getCodigoPacote() {
		return codigoPacote;
	}
	public void setCodigoPacote(int codigoPacote) {
		this.codigoPacote = codigoPacote;
	}
	public Uniforme getUniforme() {
		return uniforme;
	}
	public void setUniforme(Uniforme uniforme) {
		this.uniforme = uniforme;
	}
	
	
}
