package apresentacao;

import javax.swing.JOptionPane;

public class UniformeApresentacao {
	
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

	public String insereModeloGolaCamisa() {

		String modeloGola;
		String optionsModeloGola[] = { "V", "CANOA", "RULE", "U" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o modelo de Gola: ", "CAMISA - MODELO DE GOLA", 0, -1,
				null, optionsModeloGola, null);

		if (tipoInt == 0) {
			modeloGola = "V";
		} else if (tipoInt == 1) {
			modeloGola = "CANOA";
		} else if (tipoInt == 2) {
			modeloGola = "RULE";
		} else {
			modeloGola = "U";
		} 
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return modeloGola;
	}

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

	public String insereTecidoCalca() {

		String tecidoCalca;
		String optionsTecidoCalca[] = { "ALGODAO", "LA", "LINHO", "MOLETOM" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Escolha o tecido da Calça: ", "CALÇA - TECIDO", 0, -1, null,
				optionsTecidoCalca, null);

		if (tipoInt == 0) {
			tecidoCalca = "ALGODAO";
		} else if (tipoInt == 1) {
			tecidoCalca = "LA";
		} else if (tipoInt == 2) {
			tecidoCalca = "LINHO";
		} else {
			tecidoCalca = "MOLETOM";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tecidoCalca;
	}

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
	
	public Boolean informaUniformeGoleiro() {
		
		Boolean informaUniformeGoleiro;

		Object[] options = { "SIM", "NÃO" };
		int selectedOption = JOptionPane.showOptionDialog(null, "Deseja informar uniformes de goleiro?", "ESCOLHA",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if (selectedOption == JOptionPane.YES_OPTION) {

			informaUniformeGoleiro = true;

		}else {
			informaUniformeGoleiro = false;
		}

		return informaUniformeGoleiro;
	}
	
	public Boolean informaMeia(String tipoUniforme) {
		
		Boolean informaMeia = false;
		
		if(tipoUniforme.equals("COLEGIAL") || tipoUniforme.equals("EMPRESARIAL")) {
			
			Object[] options = { "SIM", "NÃO" };
			int selectedOption = JOptionPane.showOptionDialog(null, "Deseja inserir Meias no(s) Uniforme(s)?", "ESCOLHA",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (selectedOption == JOptionPane.YES_OPTION) {
	
				informaMeia = true;
	
			}
		}
		
		return informaMeia;
	}
	
}
