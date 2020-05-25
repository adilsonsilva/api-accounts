package br.com.accounts.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4055187437516538315L;

	private String eamil;

	private String nickName;

	private String fullName;

	private String password;

	private String acccountName;

}
