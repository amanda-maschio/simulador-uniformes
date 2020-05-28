package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	private Integer codigoPedido;
	private Integer qtdPacote;
	private Date dataCompra; 
	private Double valorCompra;
	private ClientePessoaJuridica clientePessoaJuridica; 
	private ClientePessoaFisica clientePessoaFisica;
	private ArrayList<Pacote> listaPacotes = new ArrayList<>();
	
	public ArrayList<Pacote> getListaPacotes() {
		return listaPacotes;
	}
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
	public ClientePessoaJuridica getClientePessoaJuridica() {
		return clientePessoaJuridica;
	}
	public void setClientePessoaJuridica(ClientePessoaJuridica clientePessoaJuridica) {
		this.clientePessoaJuridica = clientePessoaJuridica;
	}
	public ClientePessoaFisica getClientePessoaFisica() {
		return clientePessoaFisica;
	}
	public void setClientePessoaFisica(ClientePessoaFisica clientePessoaFisica) {
		this.clientePessoaFisica = clientePessoaFisica;
	}
	public void addPacote(Pacote pacote) {
		listaPacotes.add(pacote);
	}

}
