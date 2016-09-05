package exceptions;

public class ValorInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException() {
		super("Valor Invalido");
	}
	
	public ValorInvalidoException(String mensagem) {
		super(mensagem);
	}

}
