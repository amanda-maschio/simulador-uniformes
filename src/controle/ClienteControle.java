package controle;

import java.text.ParseException;

import apresentacao.ClienteApresentacao;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class ClienteControle {

	static ClienteApresentacao clienteApresentacao = new ClienteApresentacao();
	static ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
	static ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
	
	/**
	 * metodo para cadastrar os dados do cliente
	 * @throws ParseException
	 */
	public static void cadastraCliente() throws ParseException {

		String tipoCliente = clienteApresentacao.insereTipoCliente();

		if (tipoCliente.equals("FISICA")) {
			
			//equals comparação de strings
			
			clientePessoaFisica = cadastraClienteFisica();
			
		} else {
			
			clientePessoaJuridica = cadastraClienteJuridica();
			
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

		if (clientePessoaFisica.getCpf() != null) {
			
			listaClienteTemporaria = montaListaFisica(clientePessoaFisica);
			clienteApresentacao.listaCliente(listaClienteTemporaria);
		
		} else if (clientePessoaJuridica.getCnpj() != null) {
			
			listaClienteTemporaria = montaListaJuridica(clientePessoaJuridica);
			clienteApresentacao.listaCliente(listaClienteTemporaria);
		
		} else {
			clienteApresentacao.listaVazia();
		}
	}
	
	/**
	 * monta uma lista com os dados do cliente do tipo pessoa juridica informados pelo usuario
	 * 
	 * @param clientePessoaJuridica
	 * @return
	 */
	private static String montaListaJuridica(ClientePessoaJuridica clientePessoaJuridica) {
		
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
	private static String montaListaFisica(ClientePessoaFisica clientePessoaFisica) {
		
		String listaFisica = "";

		listaFisica += "CLIENTE " + clientePessoaFisica.getNome() + ": \n\n"
		+ "CPF: " + clientePessoaFisica.getCpf() + "\n"
		+ "E-MAIL: " + clientePessoaFisica.getEmail() + "\n"
		+ "TELEFONE: " + clientePessoaFisica.getTelefone();
		
		return listaFisica;
	}
	
	public static ClientePessoaFisica getClientePessoaFisica() {
		
		return clientePessoaFisica;
	}
	
	public static ClientePessoaJuridica getClientePessoaJuridica() {
		
		return clientePessoaJuridica;
	}
	
}
