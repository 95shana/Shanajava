package com.example.demo.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mpdel.Usershana;

@Controller

public class Controllerhome {
	@GetMapping("/")
	public String shaa() {
		// commment // from server
		return "shana";
		
	}
	@PostMapping("/send")
	public String hghg(Usershana user ,Model model) {
		model.addAttribute("title","Success page");
		model.addAttribute("data",user);
		return "success";
	
	}

}
