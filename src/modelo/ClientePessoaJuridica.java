package modelo;

public class ClientePessoaJuridica extends Cliente{

	private Integer codigoClienteJuridica;
	private String razaoSocial;
	private Long cnpj;
	
	public ClientePessoaJuridica() {
		super();
	}
	
	public ClientePessoaJuridica(String email, String telefone, String endereco, Integer codigoClienteJuridica,
			String razaoSocial, Long cnpj) {
		super(email, telefone, endereco);
		this.codigoClienteJuridica = codigoClienteJuridica;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

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
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

}
