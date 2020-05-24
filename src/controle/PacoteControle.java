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
	
	public static void adicionaUniformePacote(ArrayList<Uniforme> listaUniforme, Uniforme uniforme, int qtdUniforme) {
		// Essa fun��o ir� adicionar uniformes em uma lista de acordo com a quantidade de uniformes que o usu�rio quer
		
		for (int i = 0; i < qtdUniforme; i++) {

			Uniforme uniforme2 = new Uniforme();
			uniforme2.setTipo(uniforme.getTipo());
			uniforme2.setCamisa(uniforme.getCamisa());
			uniforme2.setCalca(uniforme.getCalca());
			uniforme2.setMeia(uniforme.getMeia());

			listaUniforme.add(uniforme2);

		}

	}
	
	public static void montaUniforme(Pacote pacote, Uniforme uniforme, Camisa camisa, Calca calca, Meia meia) {
		
		camisa.setModeloManga(pacoteApresentacao.insereTipo("Manga", "CAMISA - TIPO DE MANGA"));
		camisa.setModeloGola(pacoteApresentacao.insereModeloGolaCamisa());
		camisa.setTecidoCamisa(pacoteApresentacao.insereTecidoCamisa());
		camisa.setCorPrimaria(pacoteApresentacao.insereCor("primaria", "Camisa"));
		camisa.setCorSecundaria(pacoteApresentacao.insereCor("secundaria", "Camisa"));
		camisa.setTamanho(pacoteApresentacao.insereTamanho("Camisa"));
		
		calca.setTipoCalca(pacoteApresentacao.insereTipo("Cal�a", "CAL�A - TIPO DE CAL�A"));
		calca.setTecidoCalca(pacoteApresentacao.insereTecidoCalca());
		calca.setCorPrimaria(pacoteApresentacao.insereCor("primaria", "Cal�a"));
		calca.setCorSecundaria(pacoteApresentacao.insereCor("secundaria", "Cal�a"));
		calca.setTamanho(pacoteApresentacao.insereTamanho("Cal�a"));
		
		meia.setTipoMeia(pacoteApresentacao.insereTipo("Meia", "MEIA - TIPO DE MEIA"));
		meia.setCor(pacoteApresentacao.insereCor("", "Meia"));
		meia.setTecidoMeia(pacoteApresentacao.insereTecidoMeia());
		
		uniforme.setCamisa(camisa);
		uniforme.setCalca(calca);
		uniforme.setMeia(meia);
	}

}
