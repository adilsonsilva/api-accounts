package br.com.accounts.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AccountException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1620136907195545055L;

	public AccountException() {
		super();
	}

	public AccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccountException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountException(String message) {
		super(message);
	}

	public AccountException(Throwable cause) {
		super(cause);
	}

}
