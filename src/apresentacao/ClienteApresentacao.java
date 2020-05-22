package apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class ClienteApresentacao {

	public int teste = 0;

	public int cadastraCliente(ClientePessoaFisica clientePessoaFisica, ClientePessoaJuridica clientePessoaJuridica)
			throws ParseException {
		// metodo para cadastrar os dados do cliente

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

	private String insereDocumento(String tipoDeDocumento) {

		/* DOCUMENTO */

		String documento = JOptionPane.showInputDialog(null, "Digite o " + tipoDeDocumento + ": ", "TELEFONE", -1);

		return documento;

	}

	private String insereSexo() {

		/* SEXO */

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

	private Date insereNascimento() throws ParseException {

		/* NASCIMENTO */

		String nascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento (dd/mm/aaaa): ",
				"NASCIMENTO", -1);

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		Date y1 = data.parse(nascimento);

		return y1;
	}

	private String insereEndereco() {

		String endereco = JOptionPane.showInputDialog(null, "Digite o endereco: ", "ENDERECO", -1);

		return endereco;
	}

	private String insereTelefone() {

		String telefone = JOptionPane.showInputDialog(null, "Digite o telefone:", "TELEFONE", -1);

		return telefone;

	}

	private String insereEmail() {

		/* EMAIL */

		String email = JOptionPane.showInputDialog(null, "Digite o e-mail:", "E-MAIL", -1);

		return email;

	}

	private String insereNomeOuRazao(String tipoDeCliente, String tipo) {

		/* NOME OU RAZAO SOCIAL */

		String nomeOuRazao = JOptionPane.showInputDialog(null, "Digite " + tipoDeCliente + ": ", tipo, -1);

		return nomeOuRazao;
	}

	private String insereTipoCliente() {

		/* TIPO CLIENTE */

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
