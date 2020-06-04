package controle;

import java.text.ParseException;

import apresentacao.ClienteApresentacao;
import modelo.Cliente;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class ClienteControle {

	static ClienteApresentacao clienteApresentacao = new ClienteApresentacao();
	
	static Cliente cliente = new Cliente();
	static String tipoCliente;
	
	/**
	 * metodo para cadastrar os dados do cliente
	 * @throws ParseException
	 */
	public static void cadastraCliente() throws ParseException {

		tipoCliente = clienteApresentacao.insereTipoCliente();

		if (tipoCliente.equals("FISICA")) {
			
			cliente = cadastraClienteFisica();
			cliente.setCodigoCliente(SimuladorControle.geraId());
			
		} else {
			
			cliente = cadastraClienteJuridica();
			cliente.setCodigoCliente(SimuladorControle.geraId());
		}
		
	}
	
	/**
	 * reponsavel por cadastrar cliente do tipo pessoa fisica
	 * 
	 * @return
	 * @throws ParseException
	 */
	public static ClientePessoaFisica cadastraClienteFisica() throws ParseException {
		
		ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
		
		clientePessoaFisica.setCodigoCliente(SimuladorControle.geraId());
		clientePessoaFisica.setNome(clienteApresentacao.insereNomeOuRazao("o nome", "NOME"));
		clientePessoaFisica.setSexo(clienteApresentacao.insereSexo());
		clientePessoaFisica.setCpf(clienteApresentacao.insereDocumento("CPF"));
		clientePessoaFisica.setNascimento(clienteApresentacao.insereNascimento());
		clientePessoaFisica.setEndereco(clienteApresentacao.insereEndereco());
		clientePessoaFisica.setEmail(clienteApresentacao.insereEmail());
		clientePessoaFisica.setTelefone(clienteApresentacao.insereTelefone());
		
		return clientePessoaFisica;
	}
	
	/**
	 * reponsavel por cadastrar cliente do tipo pessoa juridica
	 * 
	 * @return
	 */
	public static ClientePessoaJuridica cadastraClienteJuridica() {
		
		ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
		
		clientePessoaJuridica.setCodigoClienteJuridica(SimuladorControle.geraId());
		clientePessoaJuridica.setRazaoSocial(clienteApresentacao.insereNomeOuRazao("a razao social", "RAZAO SOCIAL"));
		clientePessoaJuridica.setEmail(clienteApresentacao.insereEmail());
		clientePessoaJuridica.setTelefone(clienteApresentacao.insereTelefone());
		clientePessoaJuridica.setEndereco(clienteApresentacao.insereEndereco());
		clientePessoaJuridica.setCnpj(clienteApresentacao.insereDocumento("CNPJ"));
		
		return clientePessoaJuridica;
	}
	
	/**
	 * exibe os dados do cliente de acordo com os dados informados pelo usuario
	 * 
	 */
	public static void listaCliente() {

		String listaClienteTemporaria = "";

		if (tipoCliente == null) {

			clienteApresentacao.listaVazia();

		} else if (tipoCliente.equals("FISICA")) {

			listaClienteTemporaria = montaListaFisica(cliente);
			clienteApresentacao.listaCliente(listaClienteTemporaria);

		} else {

			listaClienteTemporaria = montaListaJuridica(cliente);
			clienteApresentacao.listaCliente(listaClienteTemporaria);

		}
	}
	
	/**
	 * monta uma lista com os dados do cliente do tipo pessoa juridica informados pelo usuario
	 * 
	 * @param clientePessoaJuridica
	 * @return
	 */
	private static String montaListaJuridica(Cliente cliente) {
		
		ClientePessoaJuridica clientePessoaJuridica = (ClientePessoaJuridica)cliente;
		
		String listaJuridica = "";
		
		listaJuridica += "CLIENTE " + clientePessoaJuridica.getRazaoSocial() + ": \n\n"
		+ "CNPJ " + clientePessoaJuridica.getCnpj() + "\n"
		+ "E-MAIL " + clientePessoaJuridica.getEmail() + "\n"
		+ "TELEFONE " + clientePessoaJuridica.getTelefone();
		
		return listaJuridica;
	}
	
	/**
	 * monta uma lista com os dados do cliente do tipo pessoa fisica informados pelo usuario
	 * 
	 * @param clientePessoaFisica
	 * @return
	 */
	private static String montaListaFisica(Cliente cliente) {
		
		ClientePessoaFisica clientePessoaFisica = (ClientePessoaFisica)cliente;

		String listaFisica = "";

		listaFisica += "CLIENTE " + clientePessoaFisica.getNome() + ": \n\n"
		+ "CPF: " + clientePessoaFisica.getCpf() + "\n"
		+ "E-MAIL: " + clientePessoaFisica.getEmail() + "\n"
		+ "TELEFONE: " + clientePessoaFisica.getTelefone();
		
		return listaFisica;
	}
	
	public static Cliente getCliente() {
		
		return cliente;
	}
	
}
