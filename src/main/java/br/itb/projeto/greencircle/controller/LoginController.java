package br.itb.projeto.greencircle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.itb.projeto.greencircle.model.entity.Login;
import br.itb.projeto.greencircle.model.entity.Usuario;
import br.itb.projeto.greencircle.service.UsuarioService;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	private UsuarioService usuarioService;

	public LoginController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/login")
	public String getNovoLogin(ModelMap model) {

		model.addAttribute("login", new Login());
		model.addAttribute("serverMessage", "");
		return "pages/Login";
	}
	
	@PostMapping("/acessar")
	public String acessar(ModelMap model, @ModelAttribute("login") Login login, HttpSession session) {
		
		Usuario usuarioLogado = usuarioService.acessar(login.getEmail(), login.getSenha());

		if (usuarioLogado != null) {
			
			session.setAttribute("usuarioLogado", usuarioLogado);
			model.addAttribute("usuario", usuarioLogado);
			
			if (usuarioLogado.getNivelAcesso().equals("ADMIN")) {
				
				return "redirect:/usuario/admin";
				
			} else if (usuarioLogado.getNivelAcesso().equals("USER")) {
				
				return "redirect:/usuario/user";
				
			}
	
		}
		
		String serverMessage = "Dados Incorretos!";
		model.addAttribute("serverMessage", serverMessage);
		
		return "redirect:/usuario/login";
	}

}
