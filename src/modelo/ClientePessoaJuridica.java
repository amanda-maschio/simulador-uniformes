package modelo;

public class ClientePessoaJuridica {

	private Integer codigoClienteJuridica;
	private String razaoSocial;
	private String email;
	private String telefone;
	private String endereco;
	private String cnpj;

	public Integer getCodigoClienteJuridica() {
		return codigoClienteJuridica;
	}

	public void setCodigoClienteJuridica(Integer codigoClienteJuridica) {
		this.codigoClienteJuridica = codigoClienteJuridica;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
