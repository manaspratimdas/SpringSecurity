package manas.spring.security.nee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import manas.spring.security.nee.domain.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
	
	public Account findByUsername(String username);

}
