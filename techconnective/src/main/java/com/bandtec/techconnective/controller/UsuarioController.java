package com.bandtec.techconnective.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bandtec.techconnective.dao.MongoDAO;
import com.bandtec.techconnective.model.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	 MongoDAO dao;

	 @GetMapping("/inserirUsuario.html")
	 public ModelAndView cadastrar() {
	  return new ModelAndView("inserirUsuario");
	 }
	  
	@GetMapping("/alterarUsuario.html/{_id}")
	 public ModelAndView alterar(@PathVariable("_id") ObjectId _id) {
	  return new ModelAndView("alterarUsuario","atualizar",dao.porId(_id));
	 }
	  
	 @PostMapping("inserirUsuario")
	 public String adicionar(Usuario usuario) {
	   dao.inserir(usuario);
	   return "redirect:/usuario/listaUsuario";
	 }
	  
	 @GetMapping("listaUsuario")
	 public String listar(Model model) {
	  model.addAttribute("listas", dao.mostraTodos());
	  return "lista";
	 }
	  
	@PostMapping("alterar")
	 public String update(Usuario usuario) {
	  dao.atualizar(usuario);
	  return "redirect:/usuario/listaUsuario";
	 }
	  
	@GetMapping("remover/{_id}")
	 public String deletar(@PathVariable("_id") ObjectId _id) {
	  dao.excluir(_id);
	  return "redirect:/usuario/listaUsuario";
	 }
}
