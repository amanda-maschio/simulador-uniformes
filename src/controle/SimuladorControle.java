package controle;

import java.text.ParseException;
import java.util.Random;

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
				menuCliente();
				break;
			case 2:
				menuPacote();
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
		while (op != 4) {
			op = simuladorApresentacao.mostraMenuPacote();
			switch (op) {
			case 1:
				adicionaPacoteControle();
				break;
			case 2:
				pesquisaTodosPacotesControle();
				break;
			case 3:
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
	
	private void pesquisaTodosPacotesControle() {
		PacoteControle.listaTodosPacotesResumidos();
	}

	private void adicionaClienteControle() throws ParseException {
		
		ClienteControle.cadastraCliente();
	}
	
	private void pesquisaClienteControle() {
		ClienteControle.listaCliente();
	}
	
	public static int geraId() {
		
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt((1000 - 0) + 1) + 0;
		
		return valor;
	}


}
