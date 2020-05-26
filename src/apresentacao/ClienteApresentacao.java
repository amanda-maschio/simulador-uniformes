package apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import controle.ClienteControle;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class ClienteApresentacao {
	
	ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
	ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
	
	public int teste = 0;
	
	/**
	 * método para cadastrar os dados do cliente
	 * 
	 * @param clientePessoaFisica
	 * @param clientePessoaJuridica
	 * @return
	 * @throws ParseException
	 */
	public int cadastraCliente()
			throws ParseException {

		String tipoCliente = insereTipoCliente();

		if (tipoCliente.equals("FISICA")) {
			
			ClienteControle.cadastraClienteFisica(clientePessoaFisica);
		
		} else {
			
			ClienteControle.cadastraClienteJuridica(clientePessoaJuridica);
			
		}

		return teste;
	}

	/**
	 * método que le o cpf/cnpj informado pelo usuário e retorna este
	 * valor
	 * 
	 * @param tipoDeDocumento
	 * @return
	 */
	public String insereDocumento(String tipoDeDocumento) {

		String documento = JOptionPane.showInputDialog(null, "Digite o " + tipoDeDocumento + ": ", "TELEFONE", -1);

		return documento;

	}
	
	/**
	 * método que le o sexo informado pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 */
	public String insereSexo() {

		String sexo;
		String optionsTipoCliente[] = { "FEMININO", "MASCULINO" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Informe o sexo: ", "SEXO", 0, -1, null, optionsTipoCliente,
				null);
		if (tipoInt == 0) {
			sexo = "FEMININO";
		} else {
			sexo = "MASCULINO";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return sexo;

	}
	
	/**
	 * método que le a data de nascimento informada pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 * @throws ParseException
	 */
	public Date insereNascimento() throws ParseException {

		String nascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento (dd/mm/aaaa): ",
				"NASCIMENTO", -1);

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		Date y1 = data.parse(nascimento);

		return y1;
	}

	/**
	 * método que le o endereço informado pelo usuário e retorna este
	 * valor
	 * @return
	 */
	public String insereEndereco() {

		String endereco = JOptionPane.showInputDialog(null, "Digite o endereco: ", "ENDERECO", -1);

		return endereco;
	}
	
	/**
	 * método que le o telefone informado pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 */
	public String insereTelefone() {

		String telefone = JOptionPane.showInputDialog(null, "Digite o telefone:", "TELEFONE", -1);

		return telefone;

	}
	
	/**
	 * método que le o email informado pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 */
	public String insereEmail() {

		String email = JOptionPane.showInputDialog(null, "Digite o e-mail:", "E-MAIL", -1);

		return email;

	}

	/**
	 * método que le o nome/razão social informado pelo usuário e retorna este
	 * valor
	 * 
	 * @param tipoDeCliente
	 * @param tipo
	 * @return
	 */
	public String insereNomeOuRazao(String tipoDeCliente, String tipo) {

		String nomeOuRazao = JOptionPane.showInputDialog(null, "Digite " + tipoDeCliente + ": ", tipo, -1);

		return nomeOuRazao;
	}
	
	/**
	 * método que le o tipo de cliente informado pelo usuário e retorna este
	 * valor
	 * 
	 * @return
	 */
	public String insereTipoCliente() {

		String tipoCliente;
		String optionsTipoCliente[] = { "FISICA", "JURIDICA" };

		int tipoInt = JOptionPane.showOptionDialog(null, "Informe o tipo de pessoa: ", "TIPO", 0, -1, null,
				optionsTipoCliente, null);
		if (tipoInt == 0) {
			tipoCliente = "FISICA";
		} else {
			tipoCliente = "JURIDICA";
		}
		if (tipoInt == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}

		return tipoCliente;
	}

	/**
	 * metodo responsavel por pegar e retornar o objeto ClientePessoaFisica
	 * 
	 * @return
	 */
	public ClientePessoaFisica getClientePessoaFisica() {

		return clientePessoaFisica;
	}
	
	/**
	 * metodo responsavel por pegar e retornar o objeto ClientePessoaJuridica
	 * @return
	 */
	public ClientePessoaJuridica getClientePessoaJuridica() {
		
		return clientePessoaJuridica;
	}
	
	/**
	 * Informa se o cliente não foi cadastrado (objeto nulo)
	 */
	public void listaVazia() {

		JOptionPane.showMessageDialog(null, "Cliente não cadastrado!", "CLIENTE", 1);

	}
	
	/**
	 * exibe a string ListaCliente ao usuario
	 * 
	 * @param listaCliente
	 */
	public void listaCliente(String listaCliente) {

		JOptionPane.showMessageDialog(null, listaCliente);

	}
}
