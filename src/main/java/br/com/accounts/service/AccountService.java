package br.com.accounts.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.accounts.entity.AccountEntity;
import br.com.accounts.exceptions.AccountNotFound;
import br.com.accounts.exceptions.EmailAccountNotFound;
import br.com.accounts.model.AccountDTO;
import br.com.accounts.model.AccountResponse;
import br.com.accounts.model.AccountUpdateDTO;
import br.com.accounts.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepostoty;

	public AccountResponse<AccountDTO> create(AccountDTO accountDTO) {
		return null;
	}

	public AccountResponse<AccountDTO> updateAccount(AccountUpdateDTO requestUpdateDTO) {
		return null;
	}

	public AccountResponse<AccountDTO> getAccountForEmail(String email) throws AccountNotFound {
		Optional<AccountEntity> account = accountRepostoty.findByEmailIgnoreCase(email);

		account.orElseThrow(() -> new EmailAccountNotFound("Email does not exist"));

		AccountDTO dto = new AccountDTO();
		BeanUtils.copyProperties(account, dto);
		return new AccountResponse<AccountDTO>(dto);
	}

}
