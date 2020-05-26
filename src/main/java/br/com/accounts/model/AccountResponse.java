package br.com.accounts.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountResponse<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3265306353457712941L;

	@JsonInclude(Include.NON_NULL)
	private T data;

	@JsonInclude(Include.NON_NULL)
	private List<Error> erros;

}
