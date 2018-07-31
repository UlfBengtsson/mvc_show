package se.lexicon.mvc_show.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	
	@GetMapping("/")
	public String index()
	{
		return "Index";
	}
	
	@GetMapping("/Contact")
	public String contact()
	{
		return "Contact";
	}
}
