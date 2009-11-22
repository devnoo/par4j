package info.denoo.par4j.model;

import info.denoo.par4j.Par4jException;

public class UnknownPacketTypeException extends Par4jException {

	public UnknownPacketTypeException() {
		super();
	}

	public UnknownPacketTypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownPacketTypeException(String message) {
		super(message);
	}

	public UnknownPacketTypeException(Throwable cause) {
		super(cause);
	}

	
}
