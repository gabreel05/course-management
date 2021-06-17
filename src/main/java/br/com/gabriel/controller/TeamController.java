package br.com.gabriel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/team")
public class TeamController {

	@GetMapping
	public String team(Model model) {
		model.addAttribute("message", "Hello Team!");
		
		return "team";
	}
	
}
