package hoodclassics.opp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class CustomUser {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String surname;
	
	@Column(unique=true)
	private String email;
	
	private String username;

	public CustomUser(String name, String surname, String email, String username) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.username = username;
	}

	//Spring ovo treba ali ne znam zašto
	public CustomUser() {
		this.name = null;
		this.surname = null;
		this.email = null;
		this.username = null;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", username="
				+ username + "]";
	}
	
}
