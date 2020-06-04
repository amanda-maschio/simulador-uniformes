package modelo;

public class ClientePessoaJuridica extends Cliente{

	private Integer codigoClienteJuridica;
	private String razaoSocial;
	private String cnpj;
	
	public ClientePessoaJuridica() {
		super();
	}
	
	public ClientePessoaJuridica(Integer codigoCliente, String email, String telefone, String endereco,
			Integer codigoClienteJuridica, String razaoSocial, String cnpj) {
		super(codigoCliente, email, telefone, endereco);
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
