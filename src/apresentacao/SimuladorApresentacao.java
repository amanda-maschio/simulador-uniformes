package apresentacao;

import javax.swing.JOptionPane;

public class SimuladorApresentacao {
	public int mostraMenuPrincipal() {
		String aux = JOptionPane.showInputDialog(null,
				"1 - Novo Pacote\n2 - Novo Cliente\n3 - Sair\n\nDigite o numero correspondente a uma das opções:",
				"MENU PRINCIPAL", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}

	public int mostraMenuPacote() {
		String aux = JOptionPane.showInputDialog(null,
				"1 - Adicionar Novo Pacote \n2 - Menu Principal\n\nDigite o numero correspondente a uma das opções:",
				"PACOTE", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}

	public int mostraMenuCliente() {
		String aux = JOptionPane.showInputDialog(null,
				"1 - Adicionar Novo Cliente \n2 - Menu Principal\n\nDigite o numero correspondente a uma das opções:",
				"CLIENTE", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}

}
