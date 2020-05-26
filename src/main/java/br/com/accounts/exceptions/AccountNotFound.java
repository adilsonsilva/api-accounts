package br.com.accounts.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AccountNotFound extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 283675651373009143L;

	public AccountNotFound() {
		super();
	}

	public AccountNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccountNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountNotFound(String message) {
		super(message);
	}

	public AccountNotFound(Throwable cause) {
		super(cause);
	}

}
