package info.denoo.par4j;

/**
 * General exception type for par4j.
 * @author Job de Noo
 *
 */
public class Par4jException extends RuntimeException{

	public Par4jException() {
		super();
	}

	public Par4jException(String message, Throwable cause) {
		super(message, cause);
	}

	public Par4jException(String message) {
		super(message);
	}

	public Par4jException(Throwable cause) {
		super(cause);
	}
}
