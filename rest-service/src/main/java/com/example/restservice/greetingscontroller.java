package com.example.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	
	@RestController
	public class greetingscontroller {

		private static final String template = "%s";
		

		@GetMapping("/whoami")
		public greetings greetings(@RequestParam(value = "firstName", defaultValue = "Mehmet") String firstName, @RequestParam(value = "lastName", defaultValue = "Yüksel") String lastName) {
			return new greetings((String.format(template, firstName)),(String.format(template, lastName)) );
		}
	}
	


