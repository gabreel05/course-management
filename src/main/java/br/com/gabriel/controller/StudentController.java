package br.com.gabriel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gabriel.model.Student;
import br.com.gabriel.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/student")
	public String student(Model model) {
		model.addAttribute("message", "Hello Student!");

		List<Student> students = studentRepository.findAll();

		model.addAttribute("students", students);

		return "student";
	}

	@GetMapping("/student/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		studentRepository.deleteById(id);

		return "redirect:/";
	}

}
