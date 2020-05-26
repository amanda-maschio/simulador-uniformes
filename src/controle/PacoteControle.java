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
	private static ArrayList<Uniforme> listaPacote = new ArrayList<Uniforme>();

	/**
	 * Essa fun��o ir� adicionar uniformes em uma lista de acordo com a quantidade
	 * de uniformes que o usu�rio quer. O tamanho de cal�a e camisa ser� definido
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
			Calca calca, Meia meia, int qtdUniforme, String isGoleiro) {

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
			
			if(isGoleiro.equals("S")) {
				uniforme2.setIsGoleiro("S");
			}else {
				uniforme2.setIsGoleiro("N");
			}
			
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

	/**
	 * m�todo que chamar� a lista de uniformes (pacote) a ser exibida de acordo com o que foi
	 * cadastrado pelo usu�rio
	 */
	public static void listaPacote() {

		ArrayList<Uniforme> listaPacoteGoleiro = new ArrayList<Uniforme>();
		ArrayList<Uniforme> listaPacoteCasual = new ArrayList<Uniforme>();

		listaPacote = pacoteApresentacao.getListaUniforme();
		String listaPacoteTemporaria = "";
		int isGoleiro = 0;

		if (listaPacote.isEmpty() == false) {

			for (Uniforme uniforme : listaPacote) {
				if (uniforme.getIsGoleiro().equals("S")) {
					listaPacoteGoleiro.add(uniforme);
					isGoleiro = 1;
				} else {
					listaPacoteCasual.add(uniforme);
				}
			}

			listaPacoteTemporaria = montaLista(listaPacoteCasual, listaPacoteTemporaria);

			if (isGoleiro == 1) {
				listaPacoteTemporaria = montaLista(listaPacoteGoleiro, listaPacoteTemporaria);
				pacoteApresentacao.listaPacote(listaPacoteTemporaria);
			} else {
				pacoteApresentacao.listaPacote(listaPacoteTemporaria);
			}

		} else {

			pacoteApresentacao.listaVazia();

		}
	}

	/**
	 * m�todo que montar� a lista de uniformes a ser exibida de acordo com o que foi
	 * cadastrado pelo usu�rio
	 * 
	 * @param lista
	 * @param listaTemporaria
	 * @return
	 */
	public static String montaLista(ArrayList<Uniforme> lista, String listaTemporaria) {

		int n = lista.size();
		String tipoUniforme;
		
		if (lista.get(0).getIsGoleiro().equals("S")) {
			tipoUniforme = " UNIFORME(S) TIPO ESPORTIVO - MODELO GOLEIRO";
		} else {
			tipoUniforme = " UNIFORME(S) TIPO " + listaPacote.get(0).getTipo();
		}

		listaTemporaria += Integer.toString(n) + tipoUniforme + "\n\n";
		
		listaTemporaria += "CAMISA(S): COR " 
				+ lista.get(0).getCamisa().getCorPrimaria() 
				+ " E "	+ lista.get(0).getCamisa().getCorSecundaria() 
				+ " - GOLA " + lista.get(0).getCamisa().getModeloGola()
				+ " - MANGA " + lista.get(0).getCamisa().getModeloManga() 
				+ " - TECIDO " + lista.get(0).getCamisa().getTecidoCamisa() + "\n";

		listaTemporaria += "CAL�A(S): COR " 
				+ lista.get(0).getCalca().getCorPrimaria() 
				+ " E " + lista.get(0).getCalca().getCorSecundaria() 
				+ " - " + lista.get(0).getCalca().getTipoCalca()
				+ " - TECIDO " + lista.get(0).getCalca().getTecidoCalca() + "\n";

		listaTemporaria += "MEIA(S): COR " 
				+ lista.get(0).getMeia().getCor() 
				+ " - " + lista.get(0).getMeia().getTipoMeia() 
				+ " - TECIDO " + lista.get(0).getMeia().getTecidoMeia() + "\n\n";

		for (int i = 0; i < n; i++) {
			
			listaTemporaria += "TAMANHO CONJUNTO " 
					+ Integer.toString(i + 1) 
					+ ": CAMISA " + lista.get(i).getCamisa().getTamanho() 
					+ " - CAL�A " + lista.get(i).getCalca().getTamanho() + "\n";

		}

		listaTemporaria += "\n";

		return listaTemporaria;
	}
}
