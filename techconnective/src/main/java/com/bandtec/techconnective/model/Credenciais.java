package com.bandtec.techconnective.model;

public class Credenciais {
<<<<<<< HEAD
	private String email;
=======

	private String login;
>>>>>>> 9f1cb8653c7bc622e83af81f43e049eb81f1f6b3
	private String senha;

	public Credenciais() {
	}

<<<<<<< HEAD
	public Credenciais(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
=======
	public Credenciais(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public boolean iguais() {
		return login.equals(senha);
>>>>>>> 9f1cb8653c7bc622e83af81f43e049eb81f1f6b3
	}

	public String getSenha() {
		return senha;
	}

<<<<<<< HEAD
	public void setSenha(String senha) {
		this.senha = senha;
	}

=======
	public String getLogin() {
		return login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credenciais other = (Credenciais) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
>>>>>>> 9f1cb8653c7bc622e83af81f43e049eb81f1f6b3
}
