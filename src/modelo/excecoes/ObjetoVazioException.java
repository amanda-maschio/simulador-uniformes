package modelo.excecoes;

public class ObjetoVazioException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ObjetoVazioException(String msg) {
		super(msg);
	}
}
