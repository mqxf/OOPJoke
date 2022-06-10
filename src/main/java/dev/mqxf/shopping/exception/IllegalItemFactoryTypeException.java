package dev.mqxf.shopping.exception;

public class IllegalItemFactoryTypeException extends Exception {

	/**
	 * Constructs a new illegal item factory type exception with {@code null} as its
	 * detail message.  The cause is not initialized, and may subsequently be
	 * initialized by a call to {@link #initCause}.
	 */
	public IllegalItemFactoryTypeException() {
		super();
	}

	/**
	 * Constructs a new illegal item factory type exception with the specified detail message.
	 * The cause is not initialized, and may subsequently be initialized by a
	 * call to {@link #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for
	 *                later retrieval by the {@link #getMessage()} method.
	 */
	public IllegalItemFactoryTypeException(final String message) {
		super(message);
	}

}
