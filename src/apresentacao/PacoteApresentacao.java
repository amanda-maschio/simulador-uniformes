package apresentacao;

import javax.swing.JOptionPane;

import controle.PacoteControle;
import modelo.Calca;
import modelo.Camisa;
import modelo.Meia;
import modelo.Pacote;
import modelo.Uniforme;

public class PacoteApresentacao {

	public int teste = 0;

	public int cadastraPacote(Pacote pacote) {
		// metodo para cadastrar os dados do pacote

		Uniforme uniforme = new Uniforme();
		Camisa camisa = new Camisa();
		Calca calca = new Calca();
		Meia meia = new Meia();

		/*
		 * PACOTE - QUANTIDADE DE UNIFORMES
		 */
		pacote.setQtdUniforme(insereQuantidadeUniforme());

		/*
		 * UNIFORME - TIPO UNIFORME
		 */
		uniforme.setTipo(insereTipoUniforme());

		/*
		 * CAMISA - MODELO MANGA - MODELO GOLA - TECIDO - COR PRIMARIA - COR SECUNDARIA
		 * - TAMANHO
		 */
		camisa.setModeloManga(insereTipo("Manga", "CAMISA - TIPO DE MANGA"));
		camisa.setModeloGola(insereModeloGolaCamisa());
		camisa.setTecidoCamisa(insereTecidoCamisa());
		camisa.setCorPrimaria(insereCor("primaria", "Camisa"));
		camisa.setCorSecundaria(insereCor("secundaria", "Camisa"));
		camisa.setTamanho(insereTamanho("Camisa"));

		/*
		 * CALÇA - TIPO - TECIDO - COR PRIMARIA - COR SECUNDARIA - TAMANHO
		 */
		calca.setTipoCalca(insereTipo("Calça", "CALÇA - TIPO DE CALÇA"));
		calca.setTecidoCalca(insereTecidoCalca());
		calca.setCorPrimaria(insereCor("primaria", "Calça"));
		calca.setCorSecundaria(insereCor("secundaria", "Calça"));
		calca.setTamanho(insereTamanho("Calça"));

		/*
		 * MEIA - TIPO - COR - TECIDO
		 */
		meia.setTipoMeia(insereTipo("Meia", "MEIA - TIPO DE MEIA"));
		meia.setCor(insereCor("", "Meia"));
		meia.setTecidoMeia(insereTecidoMeia());

		uniforme.setCamisa(camisa);
		uniforme.setCalca(calca);
		uniforme.setMeia(meia);

		PacoteControle.adicionaUniformePacote(uniforme, pacote.getQtdUniforme());
		// chamaremos este método para montar o pacote de acordo com a quantidade de
		// uniformes informados

		return teste;

	}

	public int insereQuantidadeUniforme() {

		/* QUANTIDADE DE UNIFORMES */

		int qtdUniforme = 0;

		qtdUniforme = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Uniformes: ", "QUANTIDADE", -1));

		return qtdUniforme;
	}

	public String insereTipoUniforme() {

		/* TIPO DE UNIFORME */

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

	public String insereTipo(String objeto, String titulo) {

		/* MODELO MANGA CAMISA | TIPO CALÇA | TIPO MEIA */

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

	public String insereModeloGolaCamisa() {

		/* MODELO GOLA CAMISA */

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

	public String insereTecidoCamisa() {

		/* TECIDO */

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

	public String insereCor(String tipoCor, String objeto) {

		/* COR */

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

	public String insereTamanho(String objeto) {

		/* TAMANHO */

		String tamanho;
		String optionsTamanho[] = { "PP", "P", "M", "G", "GG", "EXG" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tamanho da " + objeto + ": ", "TAMANHO", 0, -1,
				null, optionsTamanho, null);

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

	public String insereTecidoCalca() {

		/* TECIDO CALÇA */

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

	public String insereTecidoMeia() {

		/* TECIDO MEIA */

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
}
