package manas.spring.security.nee.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import manas.spring.security.nee.domain.Account;
import manas.spring.security.nee.repository.AccountRepository;

@Configuration
public class NeeWebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {
	
	@Autowired
	AccountRepository accountRepository;
	
	
	
	
	
	public void init(AuthenticationManagerBuilder auth) throws Exception {
	  auth.userDetailsService(userDetailsService());
	 
	  }
	

	

	
	 @Bean
	  UserDetailsService userDetailsService() {
	    return new UserDetailsService() {

	      public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Account account = accountRepository.findByUsername(username);
	        if(account != null) {
	        return new User(account.getUsername(), account.getPassword(), true, true, true, true,
	                AuthorityUtils.createAuthorityList("USER"));
	        } else {
	          throw new UsernameNotFoundException("could not find the user '"
	                  + username + "'");
	        }
	      }
	      
	    };
	  }


}
