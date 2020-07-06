package modelo;

public class Cliente {
	
	protected Integer codigoCliente;
	protected String email;
	protected Long telefone;
	protected String endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String email, Long telefone, String endereco) {
		super();
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
