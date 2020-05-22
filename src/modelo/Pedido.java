package modelo;
import java.util.Date;

public class Pedido {
	
	private Integer codigoPedido;
	private Integer qtdPacote;
	private Date dataCompra; 
	private Double valorCompra;
	private ClientePessoaJuridica cliente; 
	private Pacote pacote;
	
	public Integer getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public Integer getQtdPacote() {
		return qtdPacote;
	}
	public void setQtdPacote(Integer qtdPacote) {
		this.qtdPacote = qtdPacote;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public ClientePessoaJuridica getCliente() {
		return cliente;
	}
	public void setCliente(ClientePessoaJuridica cliente) {
		this.cliente = cliente;
	}
	public Pacote getPacote() {
		return pacote;
	}
	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	
}
