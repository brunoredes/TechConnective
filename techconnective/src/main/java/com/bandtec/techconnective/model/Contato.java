package com.bandtec.techconnective.model;

public class Contato {
	private byte prefixo;
	private long tel;
	private long cel;
	
	public Contato() {}
	
	public Contato(byte prefixo, long tel, long cel) {
		this.prefixo = prefixo;
		this.tel = tel;
		this.cel = cel;
	}
	
	public byte getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(byte prefixo) {
		this.prefixo = prefixo;
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
	
	
}
