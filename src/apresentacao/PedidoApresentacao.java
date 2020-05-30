package apresentacao;

import javax.swing.JOptionPane;

public class PedidoApresentacao {
	
	public void pedidoVazio() {
		
		JOptionPane.showMessageDialog(null, "Nenhum pedido cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);

	}

	public void listaPedido(String listaPedido) {
		
		JOptionPane.showMessageDialog(null, listaPedido);
		
	}
	
}
