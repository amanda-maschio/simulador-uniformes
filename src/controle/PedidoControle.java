package controle;

import apresentacao.PedidoApresentacao;
import modelo.Pedido;

public class PedidoControle {

	static PedidoApresentacao pedidoApresentacao = new PedidoApresentacao();
	static Pedido pedido = new Pedido();

	public static void CadastraPedido() {

		if (ClienteControle.getClientePessoaFisica().getCpf() != null) {
			pedido.setClientePessoaFisica(ClienteControle.getClientePessoaFisica());
		} else {
			pedido.setClientePessoaJuridica(ClienteControle.getClientePessoaJuridica());
		}

		pedido.setListaPacotes(PacoteControle.getListaPacotes());
		pedido.setQtdPacote(pedido.getListaPacotes().size());
		
	}
}