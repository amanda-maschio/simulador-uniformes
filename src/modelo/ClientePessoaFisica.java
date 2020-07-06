package modelo;

import java.util.Date;

public class ClientePessoaFisica extends Cliente{

	private Integer codigoClienteFisica;
	private String nome;
	private Date nascimento;
	private String sexo;
	private Long cpf;
	
	public ClientePessoaFisica() {
		super();
	}

	public ClientePessoaFisica(String email, Long telefone, String endereco, String nome, Date nascimento, String sexo,
			Long cpf) {
		super(email, telefone, endereco);
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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

}
