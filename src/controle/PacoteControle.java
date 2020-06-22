package controle;

import java.util.ArrayList;

import apresentacao.PacoteApresentacao;
import apresentacao.UniformeApresentacao;
import modelo.Calca;
import modelo.Camisa;
import modelo.Meia;
import modelo.Pacote;
import modelo.Uniforme;

public class PacoteControle {

	 PacoteApresentacao pacoteApresentacao = new PacoteApresentacao();
	 UniformeApresentacao uniformeApresentacao = new UniformeApresentacao();
	 UniformeControle uniformeControle = new UniformeControle();
	 
	 static ArrayList<Pacote> listaPacotes = new ArrayList<>();
	 Pacote pacoteLista = new Pacote(); //este pacote receberá o pacote criado no CadastraPacote(), para conseguirmos exibir a listagem detalhada do pacote
	
	/**
	 * método que montará o pacote
	 * @param pacote
	 */
	public void cadastraPacote() {
		
 		if (ClienteControle.getCliente().getEmail() == null) {
			
			pacoteApresentacao.clienteVazio();
			
		} 
		else {

			do {

				Pacote pacote = new Pacote();
				Uniforme uniforme = new Uniforme();
				
				pacote.setNomePacote(pacoteApresentacao.insereNomePacote());
				pacote.setQtdUniforme(pacoteApresentacao.insereQuantidadeUniforme());
				
				uniforme.setTipo(uniformeApresentacao.insereTipoUniforme());

				uniformeControle.montaUniforme(uniforme);
				adicionaUniformePacote(pacote, uniforme, pacote.getQtdUniforme(), 0);
				
				if (uniforme.getTipo().equals("ESPORTIVO")) {

					// se o tipo de uniforme for esportivo, poderá inserir um modelo de uniforme diferente dentro do pacote

					if (uniformeApresentacao.informaUniformeGoleiro()) {

						montaUniformeGoleiro(pacote);
						
					}else {
						
						pacote.setQtdUniformeGoleiro(0);
						
					}
				}

				pacoteLista = pacote;
				listaPacotes.add(pacote);
				listaPacote();
				
			} while (pacoteApresentacao.insereNovoPacote()); //Enquanto o usuário optar por incluir novos pacotes, a operação repetirá
			
		}
	}
	
	
	/**
	 * montara o uniforme do goleiro de acordo com os dados informados pelo usuario
	 * 
	 * @param pacote
	 */
	public void montaUniformeGoleiro(Pacote pacote) {

		Uniforme uniformeGoleiro = new Uniforme();

		pacote.setQtdUniformeGoleiro(pacoteApresentacao.insereQuantidadeUniforme());
		uniformeGoleiro.setTipo("ESPORTIVO");

		uniformeControle.montaUniforme(uniformeGoleiro);

		adicionaUniformePacote(pacote, uniformeGoleiro, pacote.getQtdUniformeGoleiro(), 1);

	}
	
	
	/**
	 * Essa função irá adicionar uniformes em uma lista de acordo com a quantidade de uniformes que o usuário quer. 
	 * O tamanho de calça e camisa será definido individualmente para cada uniforme
	 * 
	 * @param uniforme
	 * @param qtdUniforme
	 * @param isGoleiro
	 */
	public void adicionaUniformePacote(Pacote pacote, Uniforme uniforme, int qtdUniforme, int isGoleiro) {

		for (int i = 0; i < qtdUniforme; i++) {

			Uniforme uniforme2 = new Uniforme();
			Camisa camisa = new Camisa();
			Calca calca = new Calca();
			Meia meia = new Meia();
			
			uniforme2.setTipo(uniforme.getTipo());

			camisa.setModeloManga(uniforme.getCamisa().getModeloManga());
			camisa.setModeloGola(uniforme.getCamisa().getModeloGola());
			camisa.setTecidoCamisa(uniforme.getCamisa().getTecidoCamisa());
			camisa.setCorPrimaria(uniforme.getCamisa().getCorPrimaria());
			camisa.setCorSecundaria(uniforme.getCamisa().getCorSecundaria());

			uniforme2.setCamisa(camisa);

			calca.setTipoCalca(uniforme.getCalca().getTipoCalca());
			calca.setTecidoCalca(uniforme.getCalca().getTecidoCalca());
			calca.setCorPrimaria(uniforme.getCalca().getCorPrimaria());
			calca.setCorSecundaria(uniforme.getCalca().getCorSecundaria());

			uniforme2.setCalca(calca);
			
			if(uniforme.getHasMeia() == 1) {
				
				meia.setTipoMeia(uniforme.getMeia().getTipoMeia());
				meia.setCor(uniforme.getMeia().getCor());
				meia.setTecidoMeia(uniforme.getMeia().getTecidoMeia());
				uniforme2.setHasMeia(1);
								
				uniforme2.setMeia(meia);
				
			}else {
				uniforme2.setHasMeia(0);
			}
			
			uniforme2.getCamisa().setTamanho(uniformeApresentacao.insereTamanho("Camisa", i + 1));
			uniforme2.getCalca().setTamanho(uniformeApresentacao.insereTamanho("Calça", i + 1));
			
			if(isGoleiro == 1) {
				uniforme2.setHasGoleiro(1);
			}else {
				uniforme2.setHasGoleiro(0);
			}
			
			pacote.addUniforme(uniforme2);

		}

	}

	/**
	 * método que chamará a lista de uniformes (pacote) a ser exibida de acordo com o que foi
	 * cadastrado pelo usuário
	 */
	public void listaPacote() {

		ArrayList<Uniforme> listaPacoteGoleiro = new ArrayList<Uniforme>();
		ArrayList<Uniforme> listaPacoteCasual = new ArrayList<Uniforme>();
		ArrayList<Uniforme> listaPacote = pacoteLista.getListaUniformes();
		
		String listaPacoteTemporaria = "";
		int isGoleiro = 0;

		if (listaPacote.isEmpty() == false) {

			for (Uniforme uniforme : listaPacote) {
				if (uniforme.getHasGoleiro() == 1) {
					listaPacoteGoleiro.add(uniforme);
					isGoleiro = 1;
				} else {
					listaPacoteCasual.add(uniforme);
				}
			}

			listaPacoteTemporaria = montaLista(listaPacoteCasual, listaPacoteTemporaria);
			
			if (isGoleiro == 1) {
				listaPacoteTemporaria = montaLista(listaPacoteGoleiro, listaPacoteTemporaria);
				pacoteApresentacao.listaPacote(listaPacoteTemporaria);
			} else {
				pacoteApresentacao.listaPacote(listaPacoteTemporaria);
			}

		} else {

			pacoteApresentacao.listaVazia();

		}
	}

	/**
	 * método que montará a lista de uniformes a ser exibida de acordo com o que foi
	 * cadastrado pelo usuário
	 * 
	 * @param lista
	 * @param listaTemporaria
	 * @return
	 */
	public String montaLista(ArrayList<Uniforme> lista, String listaTemporaria) {

		int n = lista.size();
		String tipoUniforme;
		
		if (lista.get(0).getHasGoleiro() == 1) {
			tipoUniforme = " UNIFORME(S) TIPO ESPORTIVO - MODELO GOLEIRO";
		} else {
			tipoUniforme = " UNIFORME(S) TIPO " + pacoteLista.getListaUniformes().get(0).getTipo();
		}
		
		listaTemporaria += "PACOTE " + pacoteLista.getNomePacote() + "\n\n";
		listaTemporaria += Integer.toString(n) + tipoUniforme + "\n\n";
		
		if(lista.get(0).getCamisa().getCorPrimaria().equals(lista.get(0).getCamisa().getCorSecundaria())){
			listaTemporaria += "CAMISA(S): COR " 
					+ lista.get(0).getCamisa().getCorPrimaria();
		}else {
			listaTemporaria += "CAMISA(S): COR " 
					+ lista.get(0).getCamisa().getCorPrimaria() 
					+ " E "	+ lista.get(0).getCamisa().getCorSecundaria();
		}
		
		listaTemporaria	+= " - GOLA " + lista.get(0).getCamisa().getModeloGola()
				+ " - MANGA " + lista.get(0).getCamisa().getModeloManga() 
				+ " - TECIDO " + lista.get(0).getCamisa().getTecidoCamisa() + "\n";
		
		if(lista.get(0).getCalca().getCorPrimaria().equals(lista.get(0).getCalca().getCorSecundaria())) {
			listaTemporaria += "CALÇA(S): COR " 
					+ lista.get(0).getCalca().getCorPrimaria();
		}else {
			listaTemporaria += "CALÇA(S): COR " 
					+ lista.get(0).getCalca().getCorPrimaria() 
					+ " E " + lista.get(0).getCalca().getCorSecundaria();
		}
		
		listaTemporaria	+= " - " + lista.get(0).getCalca().getTipoCalca()
				+ " - TECIDO " + lista.get(0).getCalca().getTecidoCalca() + "\n";
		
		if(lista.get(0).getHasMeia() == 1) {
			listaTemporaria += "MEIA(S): COR " 
					+ lista.get(0).getMeia().getCor() 
					+ " - " + lista.get(0).getMeia().getTipoMeia() 
					+ " - TECIDO " + lista.get(0).getMeia().getTecidoMeia() + "\n";
		}else {
			listaTemporaria += "MEIA(S): NÃO CONTÉM \n"; 
		}
		
		listaTemporaria += "\n";
		
		for (int i = 0; i < n; i++) {
			
			listaTemporaria += "TAMANHO CONJUNTO " 
					+ Integer.toString(i + 1) 
					+ ": CAMISA " + lista.get(i).getCamisa().getTamanho() 
					+ " - CALÇA " + lista.get(i).getCalca().getTamanho() + "\n";

		}

		listaTemporaria += "\n";

		return listaTemporaria;
	}
	
	/**
	 * Listagem resumida de todos os pacotes inseridos
	 */
	public void listaTodosPacotesResumidos() {
		
		String listaTodosPacotesResumidos = "";
			
		if (listaPacotes.isEmpty()) {
			
			pacoteApresentacao.listaVazia();
			
		} else {

			for (int i = 0; i < listaPacotes.size(); i++) {

				listaTodosPacotesResumidos += "PACOTE " + Integer.toString(i + 1) + ": "
						+ listaPacotes.get(i).getNomePacote() + " - " + listaPacotes.get(i).getQtdUniforme()
						+ " UNIFORMES TIPO " + listaPacotes.get(i).getListaUniformes().get(i).getTipo();

				if (listaPacotes.get(i).getQtdUniformeGoleiro() != null) {

					listaTodosPacotesResumidos += " " + listaPacotes.get(i).getQtdUniformeGoleiro() + " UNIFORMES TIPO "
							+ listaPacotes.get(i).getListaUniformes().get(i).getTipo() + " MODELO GOLEIRO";

				}

				listaTodosPacotesResumidos += "\n";
			}
			
			pacoteApresentacao.listaTodosPacotes(listaTodosPacotesResumidos);
			
		}

	}
	
	public static ArrayList<Pacote> getListaPacotes() {
		
		return listaPacotes;
	}

}
