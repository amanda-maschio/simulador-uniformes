package apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.excecoes.ObjetoVazioException;

public class ClienteApresentacao {

	public Long insereDocumento(String String) {

		Long documento = null;
		
		do {
			try {
				String documentoAux = JOptionPane.showInputDialog(null, "Digite o " + String + ": ", "DOCUMENTO", -1).replaceAll("[^0-9]", "");
				documento = Long.parseLong(documentoAux);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Documento inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		} while (documento == null);
		
		return documento;
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
				String nascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento (dd/mm/aaaa): ",	"NASCIMENTO", -1);
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

		String endereco = "";
		
		do {
			endereco = JOptionPane.showInputDialog(null, "Digite o Endereço:", "ENDEREÇO", -1);
			
			if (endereco.equals("") || endereco.trim().length() == 0) {
				campoVazio();
				endereco = null;
			}
		} while (endereco == null);

		return endereco;
	}

	public Long insereTelefone() {

		Long telefone = null;

		do {
			try {
				String telefoneAux = JOptionPane.showInputDialog(null, "Digite o telefone:", "TELEFONE", -1).replaceAll("[^0-9]", "");
				telefone = Long.parseLong(telefoneAux);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Telefone inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		} while (telefone == null);

		return telefone;

	}

	public String insereEmail() {

		String email = "";
		
		do {
			email = JOptionPane.showInputDialog(null, "Digite o e-mail:", "E-MAIL", -1);
			
			if (email.equals("") || email.trim().length() == 0) {
				campoVazio();
				email = null;
			}
		} while (email == null);
				
		return email;

	}

	public String insereNomeOuRazao(String tipoDeCliente, String tipo) {

		String nomeOuRazao = "";
		
		do {
			nomeOuRazao = JOptionPane.showInputDialog(null, "Digite " + tipoDeCliente + ": ", tipo, -1);
			
			if (nomeOuRazao.equals("") || nomeOuRazao.trim().length() == 0) {
				campoVazio();
				nomeOuRazao = null;
			}
		} while (nomeOuRazao == null);
		
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
	
	public void campoVazio() {
		JOptionPane.showMessageDialog(null, "Campo vazio!", "ERRO - CAMPO OBRIGATÓRIO", JOptionPane.ERROR_MESSAGE);
	}

}
