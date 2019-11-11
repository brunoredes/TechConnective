package com.bandtec.techconnective.model;

public class Contato {

	private long tel;
	private long cel;
	private String email;

	public Contato() {
	}

	public Contato(long tel, long cel, String email) {
		this.tel = tel;
		this.cel = cel;
		this.email = email;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public long getCel() {
		return cel;
	}

	public void setCel(long cel) {
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
