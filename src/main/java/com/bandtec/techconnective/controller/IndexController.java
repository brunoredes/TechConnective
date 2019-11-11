package com.bandtec.techconnective.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bandtec.techconnective.model.Usuario;

public class IndexController {
	 public final static String INDEX_URL = "index.html";

	    @GetMapping("/index")
	    public String IndexController(@ModelAttribute Usuario model){
	        return INDEX_URL;
	    }

	    public String LoginController(Model model){
	        return INDEX_URL;
	    }
}
