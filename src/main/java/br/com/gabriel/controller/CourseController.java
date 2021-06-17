package br.com.gabriel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/course")
public class CourseController {

	@GetMapping
	public String course(Model model) {
		model.addAttribute("message", "Hello Course!");
		
		return "course";
	}
	
}
