package modelo;

import java.util.Date;

public class ClientePessoaFisica extends Cliente{

	private Integer codigoClienteFisica;
	private String nome;
	private Date nascimento;
	private String sexo;
	private String cpf;
	
	public ClientePessoaFisica() {
		super();
	}
	
	public ClientePessoaFisica(Integer codigoCliente, String email, String telefone, String endereco,
			Integer codigoClienteFisica, String nome, Date nascimento, String sexo, String cpf) {
		super(codigoCliente, email, telefone, endereco);
		this.codigoClienteFisica = codigoClienteFisica;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
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
