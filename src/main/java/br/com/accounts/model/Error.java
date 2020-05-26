package br.com.accounts.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Error extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2338599688409049595L;

	@ApiModelProperty(notes = "messagem error")
	private String message;

	@ApiModelProperty(notes = "tracer error")
	private String messageTracer;
}
