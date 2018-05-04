package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ola")
public class OLAcontroller {

	@RequestMapping("/Step1")
	public String step1(Model model) {
		Ola ola = new Ola();

		model.addAttribute("ola", ola);

		return "Step1";
	}

	@RequestMapping("/navigateStep2")
	public String step2(@ModelAttribute("ola") Ola ola) {
		// System.out.println(ola.getFirstName());
		if (ola.getEmail().equalsIgnoreCase(ola.getEmailReEnter())) {
			ola.setEmail(ola.getEmail().toLowerCase());
			return "Step2";
		} else {
			System.out.println("emails don't match");
			return null;
		}
	}

}
