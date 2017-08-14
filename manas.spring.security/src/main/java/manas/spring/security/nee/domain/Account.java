package manas.spring.security.nee.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account {
	
	
	@Id
	private String id;
	private String username;
	private String password;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	
	

}
