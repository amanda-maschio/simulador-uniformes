package modelo;

public class Cliente {
	
	protected Integer codigoCliente;
	protected String email;
	protected String telefone;
	protected String endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer codigoCliente, String email, String telefone, String endereco) {
		this.codigoCliente = codigoCliente;
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
	
}
