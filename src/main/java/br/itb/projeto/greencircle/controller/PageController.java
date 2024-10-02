package br.itb.projeto.greencircle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/index")
	public String index() {
		return "pages/home";
	}
	
	@GetMapping("/usuarioEdit")
	public String usuerEdit() {
		return "usuario-editar";
	}
	@GetMapping("/fragments")
	public String frag() {
		return "fragments";
	}
	@GetMapping("/services")
	public String services() {
		return "pages/index/services";
	}

	
}
