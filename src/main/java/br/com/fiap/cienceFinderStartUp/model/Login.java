package br.com.fiap.cienceFinderStartUp.model;

public class Login {

	private String login;

	private String senha;

	public Login() {
		super();
	}

	public Login(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senhaEstudante) {
		this.senha = senhaEstudante;
	}

	@Override
	public String toString() {
		return "LoginEstudante {idLoginEstudante=" + login + ", senhaEstudante=" + senha + "}";
	}

}
