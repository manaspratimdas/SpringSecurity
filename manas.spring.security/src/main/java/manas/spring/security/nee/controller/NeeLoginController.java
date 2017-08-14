package manas.spring.security.nee.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NeeLoginController {
	
	
	public String showLoginPage(ModelMap model){
		
		model.put("name", "manas");
        return "welcome";
	
		
	}
	
	@RequestMapping(value="/entry", method=RequestMethod.GET)
	public String entry(){
		 
		System.out.println("entry for my app..........");
		return "Success";
	}

}
