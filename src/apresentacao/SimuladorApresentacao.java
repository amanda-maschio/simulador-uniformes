package apresentacao;

import javax.swing.JOptionPane;

public class SimuladorApresentacao {
	
	public int mostraMenuPrincipal() {
		
		int opcao = 0;
		String aux = JOptionPane.showInputDialog(null,
				"1 - Novo Cliente\n2 - Novo Pacote\n3 - Novo Pedido\n4 - Sair\n\nDigite o numero correspondente a uma das opções:",
				"MENU PRINCIPAL", -1);
		try {
			opcao = Integer.parseInt(aux);
		} catch (NumberFormatException e) {
			System.exit(0);
		}
		
		return opcao;
		
	}
	
	public int mostraMenuCliente() {
		
		int opcao = 0;
		String aux = JOptionPane.showInputDialog(null,
				"1 - Adicionar Novo Cliente \n2 - Listar Cliente\n3 - Menu Principal\n\nDigite o numero correspondente a uma das opções:",
				"CLIENTE", -1);

		try {
			opcao = Integer.parseInt(aux);
		} catch (NumberFormatException e) {
			System.exit(0);
		}
		
		return opcao;
	}
	
	public int mostraMenuPacote() {
		
		int opcao = 0;
		String aux = JOptionPane.showInputDialog(null,
				"1 - Adicionar Novo Pacote \n2 - Listar resumo de todos os Pacotes\n3 - Menu Principal\n\nDigite o numero correspondente a uma das opções:",
				"PACOTE", -1);

		try {
			opcao = Integer.parseInt(aux);
		} catch (NumberFormatException e) {
			System.exit(0);
		}
		
		return opcao;
	}
	
	public int mostraMenuPedido() {
		
		int opcao = 0;
		String aux = JOptionPane.showInputDialog(null,
				"1 - Finalizar Pedido \n2 - Listar resumo do Pedido\n3 - Menu Principal\n\nDigite o numero correspondente a uma das opções:",
				"PEDIDO", -1);

		try {
			opcao = Integer.parseInt(aux);
		}
		catch(NumberFormatException e) {
			System.exit(0);
		}
		
		return opcao;
	}


}
