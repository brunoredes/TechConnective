package com.bandtec.techconnective.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.bandtec.techconnective.dao.Log;

public class LogUsuario {
	private Log logWriter = new Log();
	public void logLogin(Usuario usuario) {
		 SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy");
	        Date d = new Date();

	        String time = df.format(d) +" | "+usuario.getCredenciais().getLogin();

	        logWriter.logLogin(time);
	}
}
