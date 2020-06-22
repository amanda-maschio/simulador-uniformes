package controle;

import java.text.ParseException;

import apresentacao.SimuladorApresentacao;

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

	private void menuCliente() throws ParseException {
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
		pedidoControle.listaPedido();
		
	}

	private void adicionaPedidoControle() {
		pedidoControle.CadastraPedido();
		
	}

	private void adicionaPacoteControle() {
		pacoteControle.cadastraPacote();
	}
	
	private void pesquisaTodosPacotesControle() {
		pacoteControle.listaTodosPacotesResumidos();
	}

	private void adicionaClienteControle() throws ParseException {
		
		clienteControle.cadastraCliente();
	}
	
	private void pesquisaClienteControle() {
		clienteControle.listaCliente();
	}

}
