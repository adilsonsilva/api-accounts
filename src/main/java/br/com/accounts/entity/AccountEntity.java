package br.com.accounts.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "ACCOUNT", schema = "dbo")
@SequenceGenerator(name = "account_seq", initialValue = 1, allocationSize = 1)
public class AccountEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "account_seq")
	private Long id;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "NICK_NAME")
	private String nickName;

	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ACCOUNT_NAME")
	private String acccountName;
	
	@Column(name = "ACTIVE")
	private Boolean isActive;
	
	@Column(name = "DATA_CREATION")
	private LocalDateTime dataCreation;

}
