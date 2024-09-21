package br.itb.projeto.greencircle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "/pages/home";
	}

}
