package controle;

import java.text.ParseException;

import apresentacao.SimuladorApresentacao;

public class SimuladorControle {

	SimuladorApresentacao simuladorApresentacao = new SimuladorApresentacao();
	PacoteControle pacoteControle = new PacoteControle();
	ClienteControle clienteControle = new ClienteControle();

	public SimuladorControle() throws ParseException {
		int op = 0;
		while (op != 3) {
			op = simuladorApresentacao.mostraMenuPrincipal();
			switch (op) {
			case 1:
				menuPacote();
				break;
			case 2:
				menuCliente();
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
				pesquisaPacoteControle();
				break;
			}
		}
	}

	private void adicionaPacoteControle() {
		PacoteControle.cadastraPacote();
	}
	
	private void pesquisaPacoteControle() {
		PacoteControle.listaPacote();
	}

	private void adicionaClienteControle() throws ParseException {
		
		ClienteControle.cadastraCliente();
	}
	
	private void pesquisaClienteControle() {
		ClienteControle.listaCliente();
	}


}
