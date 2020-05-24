package controle;

import java.util.ArrayList;

import apresentacao.PacoteApresentacao;
import modelo.Calca;
import modelo.Camisa;
import modelo.Meia;
import modelo.Pacote;
import modelo.Uniforme;

public class PacoteControle {

	static PacoteApresentacao pacoteApresentacao = new PacoteApresentacao();

	/**
	 * Essa fun��o ir� adicionar uniformes em uma lista de acordo com a quantidade
	 * de uniformes que o usu�rio quer O tamanho de cal�a e camisa ser� definido
	 * individualmente para cada uniforme
	 * 
	 * @param listaUniforme
	 * @param uniforme
	 * @param camisa
	 * @param calca
	 * @param meia
	 * @param qtdUniforme
	 */
	public static void adicionaUniformePacote(ArrayList<Uniforme> listaUniforme, Uniforme uniforme, Camisa camisa,
			Calca calca, Meia meia, int qtdUniforme) {

		for (int i = 0; i < qtdUniforme; i++) {

			Uniforme uniforme2 = new Uniforme();
			Camisa camisa2 = new Camisa();
			Calca calca2 = new Calca();
			Meia meia2 = new Meia();

			uniforme2.setTipo(uniforme.getTipo());

			camisa2.setModeloManga(camisa.getModeloManga());
			camisa2.setModeloGola(camisa.getModeloGola());
			camisa2.setTecidoCamisa(camisa.getTecidoCamisa());
			camisa2.setCorPrimaria(camisa.getCorPrimaria());
			camisa2.setCorSecundaria(camisa.getCorSecundaria());

			uniforme2.setCamisa(camisa2);

			calca2.setTipoCalca(calca.getTipoCalca());
			calca2.setTecidoCalca(calca.getTecidoCalca());
			calca2.setCorPrimaria(calca.getCorPrimaria());
			calca2.setCorSecundaria(calca.getCorSecundaria());

			uniforme2.setCalca(calca2);

			meia2.setTipoMeia(meia.getTipoMeia());
			meia2.setCor(meia.getCor());
			meia2.setTecidoMeia(meia.getTecidoMeia());

			uniforme2.setMeia(meia2);

			uniforme2.getCamisa().setTamanho(pacoteApresentacao.insereTamanho("Camisa", i + 1));
			uniforme2.getCalca().setTamanho(pacoteApresentacao.insereTamanho("Cal�a", i + 1));

			listaUniforme.add(uniforme2);

		}

	}

	/**
	 * Este m�todo montar� o uniforme de acordo com as informa��es que o usu�rio
	 * inserir
	 * 
	 * @param pacote
	 * @param uniforme
	 * @param camisa
	 * @param calca
	 * @param meia
	 */
	public static void montaUniforme(Pacote pacote, Uniforme uniforme, Camisa camisa, Calca calca, Meia meia) {

		camisa.setModeloManga(pacoteApresentacao.insereTipo("Manga", "CAMISA - TIPO DE MANGA"));
		camisa.setModeloGola(pacoteApresentacao.insereModeloGolaCamisa());
		camisa.setTecidoCamisa(pacoteApresentacao.insereTecidoCamisa());
		camisa.setCorPrimaria(pacoteApresentacao.insereCor("primaria", "Camisa"));
		camisa.setCorSecundaria(pacoteApresentacao.insereCor("secundaria", "Camisa"));

		calca.setTipoCalca(pacoteApresentacao.insereTipo("Cal�a", "CAL�A - TIPO DE CAL�A"));
		calca.setTecidoCalca(pacoteApresentacao.insereTecidoCalca());
		calca.setCorPrimaria(pacoteApresentacao.insereCor("primaria", "Cal�a"));
		calca.setCorSecundaria(pacoteApresentacao.insereCor("secundaria", "Cal�a"));

		meia.setTipoMeia(pacoteApresentacao.insereTipo("Meia", "MEIA - TIPO DE MEIA"));
		meia.setCor(pacoteApresentacao.insereCor("", "Meia"));
		meia.setTecidoMeia(pacoteApresentacao.insereTecidoMeia());

		uniforme.setCamisa(camisa);
		uniforme.setCalca(calca);
		uniforme.setMeia(meia);
	}

}
