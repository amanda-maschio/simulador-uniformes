package apresentacao;

import javax.swing.JOptionPane;

import modelo.excecoes.ObjetoVazioException;

public class PedidoApresentacao {
	
	public static void pedidoVazio(ObjetoVazioException e) {
		
		JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

	}

	public void listaPedido(String listaPedido) {
		
		JOptionPane.showMessageDialog(null, listaPedido);
		
	}
	
	public static void pacoteVazio(ObjetoVazioException e) {
		
		JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		
	}
	
	public Boolean confirmaPedido() {

		Boolean confirmaPedido = false;

		Object[] options = { "SIM", "NÃO" };
		int selectedOption = JOptionPane.showOptionDialog(null, "Confirmar Pedido?",
				"ESCOLHA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if (selectedOption == JOptionPane.YES_OPTION) {

			confirmaPedido = true;
		}

		return confirmaPedido;
	}

	public void pedidoIncluido() {
		JOptionPane.showMessageDialog(null, "Pedido finalizado com sucesso!", "SUCESSO", -1);
		
	}

	public void pedidoCancelado() {
		JOptionPane.showMessageDialog(null, "Operação cancelada!", "CANCELADO", -1);
		System.exit(0);
	}
	
}
