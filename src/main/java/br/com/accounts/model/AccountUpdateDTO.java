package br.com.accounts.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "password")
public class AccountUpdateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4602938831780660145L;

	@ApiModelProperty(example = "MC000001", required = true)
	@JsonInclude(Include.NON_NULL)
	private String accountId;

	@ApiModelProperty(example = "teste", required = true)
	@NotNull(message = "not informed")
	@Size(min = 3, max = 15, message = "nickname containing 3 and a maximum of 15 characters")
	private String nickName;

	@ApiModelProperty(example = "teste da silva", required = true)
	@NotNull
	@Size(min = 3, max = 100, message = "fullName containing 3 and a maximum of 15 characters")
	private String fullName;

	@ApiModelProperty(example = "aaaa00000", required = true)
	@JsonProperty(access = Access.WRITE_ONLY)
	@NotNull(message = "password cannot be null")
	private String password;

	@ApiModelProperty(example = "Wallet", required = true)
	@NotNull(message = "acccountName cannot be null")
	private String acccountName;

}
