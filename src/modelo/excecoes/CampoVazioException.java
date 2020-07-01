package modelo.excecoes;

public class CampoVazioException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CampoVazioException(String msg) {
		super(msg);
	}
}
