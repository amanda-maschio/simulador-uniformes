package apresentacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controle.PacoteControle;
import modelo.Calca;
import modelo.Camisa;
import modelo.Meia;
import modelo.Pacote;
import modelo.Uniforme;

public class PacoteApresentacao {
	
	ArrayList<Uniforme> listaUniforme = new ArrayList<Uniforme>();
	public int teste = 0;

	/**
	 * método para cadastrar os dados do pacote
	 * 
	 * @param pacote
	 * @return
	 */
	public int cadastraPacote(Pacote pacote) {

		Uniforme uniforme = new Uniforme();
		Camisa camisa = new Camisa();
		Calca calca = new Calca();
		Meia meia = new Meia();

		pacote.setQtdUniforme(insereQuantidadeUniforme());
		uniforme.setTipo(insereTipoUniforme());

		PacoteControle.montaUniforme(pacote, uniforme, camisa, calca, meia);

		PacoteControle.adicionaUniformePacote(listaUniforme, uniforme, camisa, calca, meia, pacote.getQtdUniforme(), "N");

		if (uniforme.getTipo().equals("ESPORTIVO")) {

			// se o tipo de uniforme for esportivo, poderá inserir um modelo de uniforme diferente dentro do pacote

			Object[] options = { "SIM", "NÃO" };
			int selectedOption = JOptionPane.showOptionDialog(null, "Deseja informar uniformes de goleiro?", "ESCOLHA",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (selectedOption == JOptionPane.YES_OPTION) {

				montaUniformeGoleiro(listaUniforme, pacote);

			}

		}

		return teste;

	}
	
	/**
	 * método responsável por montar o uniforme de goleiro
	 * 
	 * @param listaUniforme
	 * @param pacote
	 */
	public void montaUniformeGoleiro(ArrayList<Uniforme> listaUniforme, Pacote pacote) {
		
		Uniforme uniformeGoleiro = new Uniforme();
		Camisa camisaGoleiro = new Camisa();
		Calca calcaGoleiro = new Calca();
		Meia meiaGoleiro = new Meia();

		pacote.setQtdUniformeGoleiro(insereQuantidadeUniforme());
		uniformeGoleiro.setTipo("ESPORTIVO");
		
		PacoteControle.montaUniforme(pacote, uniformeGoleiro, camisaGoleiro, calcaGoleiro, meiaGoleiro);
		
		PacoteControle.adicionaUniformePacote(listaUniforme, uniformeGoleiro, camisaGoleiro, calcaGoleiro,
				meiaGoleiro, pacote.getQtdUniformeGoleiro(), "S");
		
	}
		
	/**
	 * método que le a quantidade de uniformes informada pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 */
	public int insereQuantidadeUniforme() {

		int qtdUniforme = 0;

		qtdUniforme = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Uniformes: ", "QUANTIDADE", -1));

		return qtdUniforme;
	}

	/**
	 * método que le o tipo de uniforme informado pelo usuário e retorna este valor
	 * 
	 * @return
	 */
	public String insereTipoUniforme() {

		String tipoUniforme;
		String optionsTipoUniforme[] = { "EMPRESARIAL", "COLEGIAL", "ESPORTIVO" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tipo de Uniforme: ", "TIPO", 0, -1, null,
				optionsTipoUniforme, null);
		if (tipoInt == 0) {
			tipoUniforme = "EMPRESARIAL";
		} else if (tipoInt == 1) {
			tipoUniforme = "COLEGIAL";
		} else {
			tipoUniforme = "ESPORTIVO";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tipoUniforme;
	}

	/**
	 * método que le o tipo de camisa/calca/meia informado pelo usuário e retorna
	 * este valor
	 * 
	 * @param objeto
	 * @param titulo
	 * @return
	 */
	public String insereTipo(String objeto, String titulo) {

		String tipo;
		String optionsTipo[] = { "LONGA", "CURTA" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tipo de " + objeto + ": ", titulo, 0, -1, null,
				optionsTipo, null);

		if (tipoInt == 0) {
			tipo = "LONGA";
		} else {
			tipo = "CURTA";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tipo;
	}

	/**
	 * método que le o modelo de gola da camisa informada pelo usuário e retorna
	 * este valor
	 * 
	 * @return
	 */
	public String insereModeloGolaCamisa() {

		String modeloGola;
		String optionsModeloGola[] = { "V", "CANOA", "RULE", "U", "HENLEY", "OVERSIZED" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o modelo de Gola: ", "CAMISA - MODELO DE GOLA", 0, -1,
				null, optionsModeloGola, null);

		if (tipoInt == 0) {
			modeloGola = "V";
		} else if (tipoInt == 1) {
			modeloGola = "CANOA";
		} else if (tipoInt == 2) {
			modeloGola = "RULE";
		} else if (tipoInt == 3) {
			modeloGola = "U";
		} else if (tipoInt == 4) {
			modeloGola = "HENLEY";
		} else {
			modeloGola = "OVERSIZED";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return modeloGola;
	}

	/**
	 * método que le a o tecido da camisa informado pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 */
	public String insereTecidoCamisa() {

		String tecidoCamisa;
		String optionsTecidoCamisa[] = { "ALGODAO", "LINHO", "POLIESTER" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tecido da Camisa: ", "CAMISA - TECIDO", 0, -1, null,
				optionsTecidoCamisa, null);

		if (tipoInt == 0) {
			tecidoCamisa = "ALGODAO";
		} else if (tipoInt == 1) {
			tecidoCamisa = "LINHO";
		} else {
			tecidoCamisa = "POLIESTER";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tecidoCamisa;
	}

	/**
	 * método que le a cor primaria/secundaria de camisa/calca/meia informada pelo
	 * usuário e retorna este valor
	 * 
	 * @param tipoCor
	 * @param objeto
	 * @return
	 */
	public String insereCor(String tipoCor, String objeto) {

		String cor;
		String optionsCor[] = { "PRETO", "BRANCO", "AZUL", "VERMELHO" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha a cor " + tipoCor + " da " + objeto + ": ", "COR", 0,
				-1, null, optionsCor, null);

		if (tipoInt == 0) {
			cor = "PRETO";
		} else if (tipoInt == 1) {
			cor = "BRANCO";
		} else if (tipoInt == 2) {
			cor = "AZUL";
		} else {
			cor = "VERMELHO";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return cor;
	}

	/**
	 * método que le o tamanho de camisa/calca informada pelo usuário e retorna este
	 * valor
	 * 
	 * @param objeto
	 * @param numeroUniforme
	 * @return
	 */
	public String insereTamanho(String objeto, int numeroUniforme) {

		String tamanho;
		String optionsTamanho[] = { "PP", "P", "M", "G", "GG", "EXG" };

		int tipoInt = JOptionPane.showOptionDialog(null,
				"Escolha o tamanho da " + objeto + " do Uniforme " + numeroUniforme + ": ", "TAMANHO", 0, -1, null,
				optionsTamanho, null);

		if (tipoInt == 0) {
			tamanho = "PP";
		} else if (tipoInt == 1) {
			tamanho = "P";
		} else if (tipoInt == 2) {
			tamanho = "M";
		} else if (tipoInt == 3) {
			tamanho = "G";
		} else if (tipoInt == 4) {
			tamanho = "GG";
		} else {
			tamanho = "EXG";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tamanho;
	}

	/**
	 * método que le o tecido da calça informada pelo usuário e retorna este valor
	 * 
	 * @return
	 */
	public String insereTecidoCalca() {

		String tecidoCalca;
		String optionsTecidoCalca[] = { "ALGODAO", "LA", "LINHO", "CORTELINE", "MOLETOM" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tecido da Calça: ", "CALÇA - TECIDO", 0, -1, null,
				optionsTecidoCalca, null);

		if (tipoInt == 0) {
			tecidoCalca = "ALGODAO";
		} else if (tipoInt == 1) {
			tecidoCalca = "LA";
		} else if (tipoInt == 2) {
			tecidoCalca = "LINHO";
		} else if (tipoInt == 3) {
			tecidoCalca = "CORTELINE";
		} else {
			tecidoCalca = "MOLETOM";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tecidoCalca;
	}

	/**
	 * método que le o tecido da meia informada pelo usuário e retorna este valor
	 * 
	 * @return
	 */
	public String insereTecidoMeia() {

		String tecidoMeia;
		String optionsTecidoMeia[] = { "LA", "ALGODAO", "FIBRA", "POLIESTER" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tecido da Meia: ", "MEIA - TECIDO", 0, -1, null,
				optionsTecidoMeia, null);

		if (tipoInt == 0) {
			tecidoMeia = "LA";
		} else if (tipoInt == 1) {
			tecidoMeia = "ALGODAO";
		} else if (tipoInt == 2) {
			tecidoMeia = "FIBRA";
		} else {
			tecidoMeia = "POLIESTER";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tecidoMeia;

	}
	
	/**
	 * método que retorna a listaUniforme
	 * 
	 * @return
	 */
	public ArrayList<Uniforme> getListaUniforme() {
		
		return listaUniforme;
	}
	
	/**
	 * exibe a string ListaPacote ao usuario
	 * 
	 * @param listaPacote
	 */
	public void listaPacote(String listaPacote) {

		JOptionPane.showMessageDialog(null, listaPacote);
	}

	/**
	 * Informa se a lista estiver vazia
	 */
	public void listaVazia() {

		JOptionPane.showMessageDialog(null, "Pacote não cadastrado!", "PACOTE", 1);
	}
}
