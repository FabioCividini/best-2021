package org.generation.italy.controller;


import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("/")
	public String title(Model model){
		
		model.addAttribute("name", "Fabio Cividini");
		
		return "index";
	}
	
	
	@GetMapping("/movies")
	public String movies(Model model) {
		
		model.addAttribute("movies", Arrays.asList("Spiderman", "Don't look Up", "Dune", "Infinite"));
		model.addAttribute("name", "Fabio Cividini");
		return "movies";
	}
	
	
	@GetMapping("/songs")
	public String songs(Model model) {
		
		model.addAttribute("songs", Arrays.asList("NOI", "LORO", "GLI ALTRI", "DUBBI"));
		model.addAttribute("name", "Fabio Cividini");
		return "songs";
	}
	
}
