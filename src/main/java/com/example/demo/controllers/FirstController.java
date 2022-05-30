package com.example.demo.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	private static Logger log=LogManager.getLogger(FirstController.class);
	@RequestMapping("/")
	public String logging() {
		log.info("it tells the current executing state!....");
    	log.debug("it tells the success messages!....");
    	log.warn("it will execute warning messages!.....");
    	log.error("it executes error messages!.....");
    	log.fatal("it was the fatal method!....");
		return "Hello world!...";
	}

}
