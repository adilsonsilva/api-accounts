package br.com.accounts.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NO_CONTENT)
public class EmailAccountNotFound extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1834850867421531699L;

	public EmailAccountNotFound() {
		super();
	}

	public EmailAccountNotFound(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmailAccountNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailAccountNotFound(String message) {
		super(message);
	}

	public EmailAccountNotFound(Throwable cause) {
		super(cause);
	}
}
