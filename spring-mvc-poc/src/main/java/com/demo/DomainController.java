package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DomainController {
	
	private static final Logger logger = LogManager.getLogger(DomainController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "index")
	public String hello(Model model) {
		
		logger.info("@@inside info");
		logger.debug("@@inside debug");
		logger.error("@@inside error");
		logger.trace("@@inside trace");
		System.out.println("inside");
		model.addAttribute("name", "Kablu Mandal");
		model.addAttribute("age", 21);
		model.addAttribute("branch", "Phusro");
		logger.info("@@end hello");
		return "index";
	}
}
