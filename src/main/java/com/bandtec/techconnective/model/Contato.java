package com.bandtec.techconnective.model;

public class Contato {

	private String tel;
	private String cel;
	private String email;

	public Contato() {
	}

	public Contato(String tel, String cel, String email) {
		this.tel = tel;
		this.cel = cel;
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
