package br.com.gabriel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/subject")
public class SubjectController {

	@GetMapping
	public String subject(Model model) {
		model.addAttribute("message", "Hello Subject!");
		
		return "subject";
	}
	
}
