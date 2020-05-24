package apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class ClienteApresentacao {

	public int teste = 0;
	
	/**
	 * m�todo para cadastrar os dados do cliente
	 * 
	 * @param clientePessoaFisica
	 * @param clientePessoaJuridica
	 * @return
	 * @throws ParseException
	 */
	public int cadastraCliente(ClientePessoaFisica clientePessoaFisica, ClientePessoaJuridica clientePessoaJuridica)
			throws ParseException {

		String tipoCliente = insereTipoCliente();

		if (tipoCliente.equals("FISICA")) {

			clientePessoaFisica.setNome(insereNomeOuRazao("o nome", "NOME"));
			clientePessoaFisica.setEmail(insereEmail());
			clientePessoaFisica.setTelefone(insereTelefone());
			clientePessoaFisica.setEndereco(insereEndereco());
			clientePessoaFisica.setNascimento(insereNascimento());
			clientePessoaFisica.setSexo(insereSexo());
			clientePessoaFisica.setCpf(insereDocumento("CPF"));

		} else {

			clientePessoaJuridica.setRazaoSocial(insereNomeOuRazao("a razao social", "RAZAO SOCIAL"));
			clientePessoaJuridica.setEmail(insereEmail());
			clientePessoaJuridica.setTelefone(insereTelefone());
			clientePessoaJuridica.setEndereco(insereEndereco());
			clientePessoaJuridica.setCnpj(insereDocumento("CNPJ"));
		}

		return teste;
	}
	
	/**
	 * m�todo que le o cpf/cnpj informado pelo usu�rio e retorna este
	 * valor
	 * 
	 * @param tipoDeDocumento
	 * @return
	 */
	private String insereDocumento(String tipoDeDocumento) {

		String documento = JOptionPane.showInputDialog(null, "Digite o " + tipoDeDocumento + ": ", "TELEFONE", -1);

		return documento;

	}
	
	/**
	 * m�todo que le o sexo informado pelo usu�rio e retorna este
	 * valor
	 * 
	 * @return
	 */
	private String insereSexo() {

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
	 * m�todo que le a data de nascimento informada pelo usu�rio e retorna este
	 * valor
	 * 
	 * @return
	 * @throws ParseException
	 */
	private Date insereNascimento() throws ParseException {

		String nascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento (dd/mm/aaaa): ",
				"NASCIMENTO", -1);

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		Date y1 = data.parse(nascimento);

		return y1;
	}

	/**
	 * m�todo que le o endere�o informado pelo usu�rio e retorna este
	 * valor
	 * @return
	 */
	private String insereEndereco() {

		String endereco = JOptionPane.showInputDialog(null, "Digite o endereco: ", "ENDERECO", -1);

		return endereco;
	}
	
	/**
	 * m�todo que le o telefone informado pelo usu�rio e retorna este
	 * valor
	 * 
	 * @return
	 */
	private String insereTelefone() {

		String telefone = JOptionPane.showInputDialog(null, "Digite o telefone:", "TELEFONE", -1);

		return telefone;

	}
	
	/**
	 * m�todo que le o email informado pelo usu�rio e retorna este
	 * valor
	 * 
	 * @return
	 */
	private String insereEmail() {

		String email = JOptionPane.showInputDialog(null, "Digite o e-mail:", "E-MAIL", -1);

		return email;

	}

	/**
	 * m�todo que le o nome/raz�o social informado pelo usu�rio e retorna este
	 * valor
	 * 
	 * @param tipoDeCliente
	 * @param tipo
	 * @return
	 */
	private String insereNomeOuRazao(String tipoDeCliente, String tipo) {

		String nomeOuRazao = JOptionPane.showInputDialog(null, "Digite " + tipoDeCliente + ": ", tipo, -1);

		return nomeOuRazao;
	}
	
	/**
	 * m�todo que le o tipo de cliente informado pelo usu�rio e retorna este
	 * valor
	 * 
	 * @return
	 */
	private String insereTipoCliente() {

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
}
