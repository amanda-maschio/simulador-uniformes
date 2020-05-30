package modelo;

import java.util.ArrayList;

public class Pacote {
	
	private Integer codigoPacote;
	private String nomePacote;
	private Integer qtdUniforme;
	private Integer qtdUniformeGoleiro = 0;
	private ArrayList<Uniforme> listaUniformes = new ArrayList<>();
	
	public String getNomePacote() {
		return nomePacote;
	}
	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}
	public void setListaUniformes(ArrayList<Uniforme> listaUniformes) {
		this.listaUniformes = listaUniformes;
	}
	public ArrayList<Uniforme> getListaUniformes() {
		return listaUniformes;
	}
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
	public void addUniforme(Uniforme uniforme) {
		listaUniformes.add(uniforme);
	}
	
}
