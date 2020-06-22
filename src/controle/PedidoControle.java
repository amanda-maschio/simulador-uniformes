package controle;

import java.util.Date;

import apresentacao.PedidoApresentacao;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;
import modelo.Pacote;
import modelo.Pedido;
import modelo.Uniforme;

public class PedidoControle {

	PedidoApresentacao pedidoApresentacao = new PedidoApresentacao();
	Pedido pedido = new Pedido();

	public void CadastraPedido() {
		
		if (PacoteControle.getListaPacotes().isEmpty()) {
			
			pedidoApresentacao.pacoteVazio();
			
		}else {
			
			Date dataCompra = new Date();
			
			pedido.setDataCompra(dataCompra);
			
			if (ClienteControle.getCliente() instanceof ClientePessoaFisica) {
	
				ClientePessoaFisica clientePessoaFisica = (ClientePessoaFisica)ClienteControle.getCliente();
				pedido.setClientePessoaFisica(clientePessoaFisica);
				
			} else {
				
				ClientePessoaJuridica clientePessoaJuridica = (ClientePessoaJuridica)ClienteControle.getCliente();
				pedido.setClientePessoaJuridica(clientePessoaJuridica);
				
			}	
			
			pedido.setListaPacotes(PacoteControle.getListaPacotes());
			pedido.setQtdPacote(pedido.getListaPacotes().size());
			
			pedido.setValorCompra(calculaTotalPedido(pedido));
			
			listaPedido();
			
			if (pedidoApresentacao.confirmaPedido()) {
				pedidoApresentacao.pedidoIncluido();
			}else {
				pedidoApresentacao.pedidoCancelado();
			}
			
		}
	}
	
	public Double calculaTotalPedido(Pedido pedido) {
		
		Double ValorTotalCompra = 0.0;
		String tipo = "";
		Integer hasMeia = 0;
		
		for (Pacote pacote : pedido.getListaPacotes()) {
			
			for (Uniforme uniforme : pacote.getListaUniformes()) {
				tipo = uniforme.getTipo();
				
				if(uniforme.getHasMeia() != 0){
					hasMeia = 1;
				}
				
			}
		
			ValorTotalCompra += calculaValorPacote(pacote, tipo, hasMeia);
			hasMeia = 0;
		}
		
		return ValorTotalCompra;
	}
	
	public Double calculaValorPacote(Pacote pacote, String tipo, Integer hasMeia){
		
		Double valorTotalCompra;
		
		if(tipo.equals("EMPRESARIAL")) {
			
			if(hasMeia == 1) {
				valorTotalCompra = (double) ((60 + 5) * pacote.getQtdUniforme());
			}else {
				valorTotalCompra = (double) (60 * pacote.getQtdUniforme());
			}
			
		}else if (tipo.equals("COLEGIAL")) {
			
			if(hasMeia == 1) {
				valorTotalCompra = (double) ((80 + 5) * pacote.getQtdUniforme());
			}else {
				valorTotalCompra = (double) (80 * pacote.getQtdUniforme());
			}
			
		}else {
			Double precoTotalGoleiro = (double) (150 * pacote.getQtdUniformeGoleiro());
			valorTotalCompra = (double) (100 * pacote.getQtdUniforme()) + precoTotalGoleiro;
		}
		
		return valorTotalCompra;
		
	}
	
	public void listaPedido() {
		
		if(pedido.getQtdPacote() == 0) {
			
			pedidoApresentacao.pedidoVazio();
			
		}else {
			
			String listaPedido = "";
			String endereco = "";
			String email = "";
			
			if(ClienteControle.getCliente() instanceof ClientePessoaFisica) {
				
				listaPedido += pedido.getClientePessoaFisica().getNome();
				endereco = pedido.getClientePessoaFisica().getEndereco();
				email = pedido.getClientePessoaFisica().getEmail();
				
			}else {
				
				listaPedido += pedido.getClientePessoaJuridica().getRazaoSocial();
				endereco = pedido.getClientePessoaJuridica().getEndereco();
				email = pedido.getClientePessoaJuridica().getEmail();
		
			}
			
			listaPedido += ", ESTES SÃO OS DETALHES DO SEU PEDIDO: \n";
			
			for (int i = 0; i < pedido.getListaPacotes().size(); i++) {
				listaPedido += "PACOTE " + Integer.toString(i+1) + ": " + pedido.getListaPacotes().get(i).getNomePacote() + "\n";
			}
			
			listaPedido += "\n";
			listaPedido += "TOTAL DO PEDIDO: " + pedido.getValorCompra() + "\n\n";
			
			listaPedido += "ENDEREÇO DE ENTREGA: " + endereco + "\n"
					+ "E-MAIL PARA ENVIO DA NF: " + email;
			
			pedidoApresentacao.listaPedido(listaPedido);
		}
	}

}