package br.com.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.accounts.model.AccountRequest;
import br.com.accounts.model.AccountResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/v1/accounts")
public class AccountController {

	@PostMapping
	public ResponseEntity<AccountResponse> createdAccount(@RequestBody AccountRequest request) {
		return new ResponseEntity<AccountResponse>(new AccountResponse(), HttpStatus.OK);
	}

}
