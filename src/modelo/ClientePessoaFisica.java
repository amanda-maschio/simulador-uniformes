package modelo;

import java.util.Date;

public class ClientePessoaFisica {

	private Integer codigoClienteFisica;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private Date nascimento;
	private String sexo;
	private String cpf;

	public Integer getCodigoClienteFisica() {
		return codigoClienteFisica;
	}

	public void setCodigoClienteFisica(Integer codigoClienteFisica) {
		this.codigoClienteFisica = codigoClienteFisica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
