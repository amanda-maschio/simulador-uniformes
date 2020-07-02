package apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.excecoes.CampoVazioException;
import modelo.excecoes.ObjetoVazioException;

public class ClienteApresentacao {

	public Long insereDocumento(String tipoDeDocumento) {

		String documento = JOptionPane.showInputDialog(null, "Digite o " + tipoDeDocumento + ": ", "DOCUMENTO", -1);
	
		return Long.parseLong(documento);

	}
	
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
	
	public Date insereNascimento(){
		
		Date d1 = new Date();

		do {
			try {
				String nascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento (dd/mm/aaaa): ",
						"NASCIMENTO", -1);
				SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
				d1 = data.parse(nascimento);

			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "Data inválida!", "ERRO", JOptionPane.ERROR_MESSAGE);
				d1 = null;
			}
		} while (d1 == null);
		
		return d1;
	}

	public String insereEndereco() {

		String endereco = JOptionPane.showInputDialog(null, "Digite o endereco: ", "ENDERECO", -1);

		return endereco;
	}

	public String insereTelefone() {

		String telefone = JOptionPane.showInputDialog(null, "Digite o telefone:", "TELEFONE", -1);

		return telefone;

	}

	public String insereEmail() {

		String email = JOptionPane.showInputDialog(null, "Digite o e-mail:", "E-MAIL", -1);

		return email;

	}

	public String insereNomeOuRazao(String tipoDeCliente, String tipo) {
	
		String nomeOuRazao = JOptionPane.showInputDialog(null, "Digite " + tipoDeCliente + ": ", tipo, -1);

		return nomeOuRazao;
	}

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

	public static void listaVazia(ObjetoVazioException e) {

		JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

	}
	
	public void listaCliente(String listaCliente) {

		JOptionPane.showMessageDialog(null, listaCliente);

	}
	
	public void campoVazio(CampoVazioException e) {

		JOptionPane.showMessageDialog(null, e.getMessage(), "INVALIDO", JOptionPane.WARNING_MESSAGE);

	}
}
