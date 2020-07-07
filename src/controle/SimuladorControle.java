package controle;

import java.text.ParseException;

import apresentacao.ClienteApresentacao;
import apresentacao.PacoteApresentacao;
import apresentacao.PedidoApresentacao;
import apresentacao.SimuladorApresentacao;
import modelo.excecoes.ObjetoVazioException;

public class SimuladorControle {

	SimuladorApresentacao simuladorApresentacao = new SimuladorApresentacao();
	
	PacoteControle pacoteControle = new PacoteControle();
	ClienteControle clienteControle = new ClienteControle();
	PedidoControle pedidoControle = new PedidoControle();
	
	public SimuladorControle() throws ParseException {
		int op = 0;
		while (op != 4) {
			op = simuladorApresentacao.mostraMenuPrincipal();
			switch (op) {
			case 1:
				menuCliente();
				break;
			case 2:
				menuPacote();
				break;
			case 3:
				menuPedido();
				break;
			}
		}

	}

	private void menuCliente() {
		int op = 0;
		while (op != 3) {
			op = simuladorApresentacao.mostraMenuCliente();
			switch (op) {
			case 1:
				adicionaClienteControle();
				break;
			case 2:
				pesquisaClienteControle();
				break;
			}
		}
	}

	public void menuPacote() {
		int op = 0;
		while (op != 3) {
			op = simuladorApresentacao.mostraMenuPacote();
			switch (op) {
			case 1:
				adicionaPacoteControle();
				break;
			case 2:
				pesquisaTodosPacotesControle();
				break;
			}
		}
	}
	
	public void menuPedido() {
		int op = 0;
		while (op != 3) {
			op = simuladorApresentacao.mostraMenuPedido();
			switch (op) {
			case 1:
				adicionaPedidoControle();
				break;
			case 2:
				pesquisaPedidoControle();
				break;
			}
		}
	}

	private void pesquisaPedidoControle() {
		try {
			pedidoControle.listaPedido();
		} catch (ObjetoVazioException e) {
			PedidoApresentacao.pedidoVazio(e);
		}
	}

	private void adicionaPedidoControle() {
		try {
			pedidoControle.CadastraPedido();
		} catch (ObjetoVazioException e) {
			PedidoApresentacao.pacoteVazio(e);
		}
	}

	private void adicionaPacoteControle() {
		try {
			pacoteControle.cadastraPacote();
		} catch (ObjetoVazioException e) {
			PacoteApresentacao.clienteVazio(e);
		}
	}
	
	private void pesquisaTodosPacotesControle() {
		try {
			pacoteControle.listaTodosPacotesResumidos();
		} catch (ObjetoVazioException e) {
			PacoteApresentacao.listaVazia(e);
		}
	}

	private void adicionaClienteControle() {
		
		clienteControle.cadastraCliente();
	}
	
	private void pesquisaClienteControle() {
		try {
			clienteControle.listaCliente();
		} catch (ObjetoVazioException e) {
			ClienteApresentacao.listaVazia(e);
		}
	}

}
