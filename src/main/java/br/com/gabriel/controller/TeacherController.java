package br.com.gabriel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/teacher")
public class TeacherController {

	@GetMapping
	public String teacher(Model model) {
		model.addAttribute("message", "Hello Teacher!");
		
		return "teacher";
	}
	
}
