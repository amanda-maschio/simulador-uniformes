package controle;

import apresentacao.UniformeApresentacao;
import modelo.Calca;
import modelo.Camisa;
import modelo.Meia;
import modelo.Uniforme;

public class UniformeControle {
	
	UniformeApresentacao uniformeApresentacao = new UniformeApresentacao();
	
	/**
	 * método responsável por incluir as informações inseridas pelo usuário dentro do Uniforme
	 * 
	 * @param uniforme
	 */
	public void montaUniforme(Uniforme uniforme) {

		uniforme.setCamisa(montaCamisa());
		uniforme.setCalca(montaCalca());

		if (uniformeApresentacao.informaMeia(uniforme.getTipo()) || uniforme.getTipo().equals("ESPORTIVO")) {

			uniforme.setMeia(montaMeia());
			uniforme.setHasMeia(1);

		}else {
			uniforme.setHasMeia(0);
		}

	}
	
	public Camisa montaCamisa() {

		Camisa camisa = new Camisa();

		camisa.setTecidoCamisa(uniformeApresentacao.insereTecidoCamisa());
		camisa.setModeloManga(uniformeApresentacao.insereTipo("Manga", "CAMISA - TIPO DE MANGA"));
		camisa.setModeloGola(uniformeApresentacao.insereModeloGolaCamisa());
		camisa.setCorPrimaria(uniformeApresentacao.insereCor("primaria", "Camisa"));
		camisa.setCorSecundaria(uniformeApresentacao.insereCor("secundaria", "Camisa"));

		return camisa;
	}
	
	public Calca montaCalca() {
		
		Calca calca = new Calca();
		
		calca.setTecidoCalca(uniformeApresentacao.insereTecidoCalca());
		calca.setTipoCalca(uniformeApresentacao.insereTipo("Calça", "CALÇA - TIPO DE CALÇA"));
		calca.setCorPrimaria(uniformeApresentacao.insereCor("primaria", "Calça"));
		calca.setCorSecundaria(uniformeApresentacao.insereCor("secundaria", "Calça"));
		
		return calca;
	}
	
	public Meia montaMeia() {
		
		Meia meia = new Meia();
		
		meia.setTecidoMeia(uniformeApresentacao.insereTecidoMeia());
		meia.setTipoMeia(uniformeApresentacao.insereTipo("Meia", "MEIA - TIPO DE MEIA"));
		meia.setCor(uniformeApresentacao.insereCor("", "Meia"));
		
		return meia;
		
	}
	
}
