package exceptions;

public class StringInvalidaException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringInvalidaException() {
		super("String Invalida");
	}
	
	public StringInvalidaException(String mensagem) {
		super(mensagem);
	}
}
