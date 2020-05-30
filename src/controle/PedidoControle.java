package controle;

import apresentacao.PedidoApresentacao;
import modelo.Pacote;
import modelo.Pedido;
import modelo.Uniforme;

public class PedidoControle {

	static PedidoApresentacao pedidoApresentacao = new PedidoApresentacao();
	static Pedido pedido = new Pedido();

	public static void CadastraPedido() {
		
		if (ClienteControle.getClientePessoaFisica().getCpf() != null) {
			pedido.setClientePessoaFisica(ClienteControle.getClientePessoaFisica());
		} else {
			pedido.setClientePessoaJuridica(ClienteControle.getClientePessoaJuridica());
		}	
		
		pedido.setListaPacotes(PacoteControle.getListaPacotes());
		pedido.setQtdPacote(pedido.getListaPacotes().size());
		
		pedido.setValorCompra(calculaTotalPedido(pedido));
		listaPedido();
		System.exit(0);

	}
	
	public static Double calculaTotalPedido(Pedido pedido) {
		
		Double ValorTotalCompra = 0.0;
		String tipo = "";
		Integer temMeia = 0;
		
		for (Pacote pacote : pedido.getListaPacotes()) {
			for (Uniforme uniforme : pacote.getListaUniformes()) {
				tipo = uniforme.getTipo();
				if(uniforme.getTemMeia() != 0){
					temMeia = 1;
				}
			}
		
			ValorTotalCompra += calculaValorPacote(tipo, pacote.getQtdUniforme(), pacote.getQtdUniformeGoleiro(), temMeia);
			temMeia = 0;
		}
		
		return ValorTotalCompra;
	}
	
	public static Double calculaValorPacote(String tipo, Integer qtdUni, Integer qtdUniGoleiro, Integer temMeia){
		
		Double valorTotalCompra;
		
		if(tipo.equals("EMPRESARIAL")) {
			if(temMeia == 1) {
				valorTotalCompra = (double) ((60 + 5) * qtdUni);
			}else {
				valorTotalCompra = (double) (60 * qtdUni);
			}
		}else if (tipo.equals("COLEGIAL")) {
			if(temMeia == 1) {
				valorTotalCompra = (double) ((80 + 5) * qtdUni);
			}else {
				valorTotalCompra = (double) (80 * qtdUni);
			}
		}else {
			Double precoTotalGoleiro = (double) (150 * qtdUniGoleiro);
			valorTotalCompra = (double) (100 * qtdUni) + precoTotalGoleiro;
		}
		
		return valorTotalCompra;
		
	}
	
	public static void listaPedido() {
		
		if(pedido == null) {
			
			pedidoApresentacao.pedidoVazio();
			
		}else {
			String listaPedido = "";
			String endereco = "";
			String email = "";
			
			if(ClienteControle.getClientePessoaFisica().getCpf() != null) {
				
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