package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ola")
public class OLAcontroller {
	
	//will trim all the strings from leading and trailing white space and turn blank fields to null
	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/Step1")
	public String step1(Model model) {
		Ola ola = new Ola();

		model.addAttribute("ola", ola);

		return "Step1";
	}

	
	@RequestMapping("/navigateStep2")
	public String step2(@Valid @ModelAttribute("ola") Ola ola, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "Step1";
		} else {
			if (ola.getEmail().equalsIgnoreCase(ola.getEmailReEnter())) {
				ola.setEmail(ola.getEmail().toLowerCase());
				System.out.println("|"+ola.getFirstName()+"|");

				return "Step2";
			} else {
				System.out.println("emails don't match");
				return null;
			}
		}
	}

}
