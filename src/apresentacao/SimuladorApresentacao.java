package apresentacao;

import javax.swing.JOptionPane;

public class SimuladorApresentacao {
	public int mostraMenuPrincipal() {
		String aux = JOptionPane.showInputDialog(null,
				"1 - Novo Cliente\n2 - Novo Pacote\n3 - Sair\n\nDigite o numero correspondente a uma das op��es:",
				"MENU PRINCIPAL", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}
	
	public int mostraMenuCliente() {
		String aux = JOptionPane.showInputDialog(null,
				"1 - Adicionar Novo Cliente \n2 - Listar Cliente\n3 - Menu Principal\n\nDigite o numero correspondente a uma das op��es:",
				"CLIENTE", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}
	
	public int mostraMenuPacote() {
		String aux = JOptionPane.showInputDialog(null,
				"1 - Adicionar Novo Pacote \n2 - Listar resumo de todos os Pacotes\n3 - Listar detalhes do �ltimo Pacote\n4 - Menu Principal\n\nDigite o numero correspondente a uma das op��es:",
				"PACOTE", -1);
		int opcao = Integer.parseInt(aux);
		return opcao;
	}

}
