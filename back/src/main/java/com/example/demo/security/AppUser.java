package com.example.demo.security;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect 
public class AppUser {

	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
}
