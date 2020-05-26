package br.com.accounts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.accounts.model.AccountDTO;
import br.com.accounts.model.AccountResponse;
import br.com.accounts.model.AccountUpdateDTO;
import br.com.accounts.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/v1/accounts")
@Api(value = "accounts", description = "the accounts API")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@ApiOperation(value = "get accounts for email", nickname = "accountsEmailGet", notes = "", response = AccountResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource exist", response = AccountResponse.class),
			@ApiResponse(code = 204, message = "Resource does not exist"),
			@ApiResponse(code = 400, message = "Invalid request", response = AccountResponse.class),
			@ApiResponse(code = 404, message = "Resource not found", response = AccountResponse.class),
			@ApiResponse(code = 500, message = "500 - Internal server error", response = AccountResponse.class) })
	@GetMapping
	public ResponseEntity<AccountResponse<AccountDTO>> accountsEmailGet(
			@ApiParam(value = "user email", required = true) @PathVariable("email") String email) {
		return ResponseEntity.ok(accountService.getAccountForEmail(email));
	}

	@ApiOperation(value = "Create accounts", nickname = "accountsPost", notes = "", response = AccountResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Sucess create", response = AccountResponse.class),
			@ApiResponse(code = 400, message = "Invalid request", response = AccountResponse.class),
			@ApiResponse(code = 500, message = "Internal server error", response = AccountResponse.class) })
	@PostMapping
	public ResponseEntity<AccountResponse<AccountDTO>> accountsPost(
			@ApiParam(value = "", required = true) @Valid @RequestBody AccountDTO accountDTO) {
		return ResponseEntity.ok(accountService.create(accountDTO));
	}

	@ApiOperation(value = "Update accounts", nickname = "accountsPut", notes = "", response = AccountResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucess", response = AccountResponse.class),
			@ApiResponse(code = 400, message = "Invalid request", response = AccountResponse.class),
			@ApiResponse(code = 500, message = "500 - Internal server error", response = AccountResponse.class) })
	@PutMapping
	public ResponseEntity<AccountResponse<AccountDTO>> accountsPut(
			@ApiParam(value = "", required = true) @Valid @RequestBody AccountUpdateDTO updateAccountDTO) {
		return ResponseEntity.ok(accountService.updateAccount(updateAccountDTO));
	}

}
