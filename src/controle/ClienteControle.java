package controle;

import java.text.ParseException;

import apresentacao.ClienteApresentacao;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class ClienteControle {

	static ClienteApresentacao clienteApresentacao = new ClienteApresentacao();

	public static void cadastraClienteFisica(ClientePessoaFisica clientePessoaFisica) throws ParseException {
		
		clientePessoaFisica.setCodigoClienteFisica(1);
		clientePessoaFisica.setNome(clienteApresentacao.insereNomeOuRazao("o nome", "NOME"));
		clientePessoaFisica.setEmail(clienteApresentacao.insereEmail());
		clientePessoaFisica.setTelefone(clienteApresentacao.insereTelefone());
		clientePessoaFisica.setEndereco(clienteApresentacao.insereEndereco());
		clientePessoaFisica.setNascimento(clienteApresentacao.insereNascimento());
		clientePessoaFisica.setSexo(clienteApresentacao.insereSexo());
		clientePessoaFisica.setCpf(clienteApresentacao.insereDocumento("CPF"));
		
	}
	
	public static void cadastraClienteJuridica(ClientePessoaJuridica clientePessoaJuridica) {
		
		clientePessoaJuridica.setCodigoClienteJuridica(1);
		clientePessoaJuridica.setRazaoSocial(clienteApresentacao.insereNomeOuRazao("a razao social", "RAZAO SOCIAL"));
		clientePessoaJuridica.setEmail(clienteApresentacao.insereEmail());
		clientePessoaJuridica.setTelefone(clienteApresentacao.insereTelefone());
		clientePessoaJuridica.setEndereco(clienteApresentacao.insereEndereco());
		clientePessoaJuridica.setCnpj(clienteApresentacao.insereDocumento("CNPJ"));
		
	}
	
	public static void listaCliente() {

		ClientePessoaFisica clientePessoaFisica = clienteApresentacao.getClientePessoaFisica();
		ClientePessoaJuridica clientePessoaJuridica = clienteApresentacao.getClientePessoaJuridica();
		String listaClienteTemporaria = "";

		if (clientePessoaFisica.getCodigoClienteFisica() != null) {
			
			listaClienteTemporaria = montaListaFisica(clientePessoaFisica);
			clienteApresentacao.listaCliente(listaClienteTemporaria);
		
		} else if (clientePessoaJuridica.getCodigoClienteJuridica() != null) {
			
			listaClienteTemporaria = montaListaJuridica(clientePessoaJuridica);
			clienteApresentacao.listaCliente(listaClienteTemporaria);
		
		} else {
			clienteApresentacao.listaVazia();
		}
	}

	private static String montaListaJuridica(ClientePessoaJuridica clientePessoaJuridica2) {
		
		String listaJuridica = "";
		
		listaJuridica += "CLIENTE " + clientePessoaJuridica2.getRazaoSocial() + ": \n\n"
		+ "CNPJ " + clientePessoaJuridica2.getCnpj() + "\n"
		+ "E-MAIL " + clientePessoaJuridica2.getEmail() + "\n"
		+ "TELEFONE " + clientePessoaJuridica2.getTelefone();
		
		return listaJuridica;
	}

	private static String montaListaFisica(ClientePessoaFisica clientePessoaFisica2) {
		String listaFisica = "";

		listaFisica += "CLIENTE " + clientePessoaFisica2.getNome() + ": \n\n"
		+ "CPF " + clientePessoaFisica2.getCpf() + "\n"
		+ "E-MAIL " + clientePessoaFisica2.getEmail() + "\n"
		+ "TELEFONE " + clientePessoaFisica2.getTelefone();
		
		return listaFisica;
	}
	
}
