package controle;

import java.util.ArrayList;

import apresentacao.PacoteApresentacao;
import modelo.Uniforme;

public class PacoteControle {

	public PacoteApresentacao pacoteApresentacao = new PacoteApresentacao();

	public static void adicionaUniformePacote(Uniforme uniforme, int qtdUniforme) {
		// Essa função irá adicionar uniformes em uma lista de acordo com a quantidade de uniformes que o usuário quer

		ArrayList<Uniforme> listaUniforme = new ArrayList<Uniforme>();

		for (int i = 0; i < qtdUniforme; i++) {

			Uniforme uniforme2 = new Uniforme();
			uniforme2.setTipo(uniforme.getTipo());
			uniforme2.setCamisa(uniforme.getCamisa());
			uniforme2.setCalca(uniforme.getCalca());
			uniforme2.setMeia(uniforme.getMeia());

			listaUniforme.add(uniforme2);

		}

	}

}
