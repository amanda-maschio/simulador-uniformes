package apresentacao;

import javax.swing.JOptionPane;

import modelo.excecoes.ObjetoVazioException;

public class PacoteApresentacao {

	public String insereNomePacote() {

		String nomePacote = JOptionPane.showInputDialog(null, "Informe um nome para o seu pacote (Exemplo: UNIFORMES MARCOPOLO SETOR COMPRAS):", "NOME PACOTE", -1);

		return nomePacote;

	}
	
	public int insereQuantidadeUniforme() {

		int qtdUniforme = 0;

		qtdUniforme = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Uniformes: ", "QUANTIDADE", -1));

		return qtdUniforme;
	}

	public void listaPacote(String listaPacote) {

		JOptionPane.showMessageDialog(null, listaPacote);
	}
	
	public void listaTodosPacotes(String listaTodosPacotes) {

		JOptionPane.showMessageDialog(null, listaTodosPacotes);
	}

	public static void listaVazia(ObjetoVazioException e) {

		JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	}
	
	public Boolean insereNovoPacote() {
		
		Boolean insereNovoPacote = false;
		
		Object[] options = { "SIM", "N�O" };
		int selectedOption = JOptionPane.showOptionDialog(null, "Pacote inclu�do. Deseja incluir mais Pacotes?", "ESCOLHA",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if (selectedOption == JOptionPane.YES_OPTION) {

			insereNovoPacote = true;
		}
		
		return insereNovoPacote;
	}

	public static void clienteVazio(ObjetoVazioException e) {
		
		JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		
	}

}
