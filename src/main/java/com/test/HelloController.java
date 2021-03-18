package com.test;


import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	Logger logger = LoggerFactory.getLogger(HelloController.class);


	@GetMapping(value = "/test")
	public String test() throws InterruptedException {
		Integer i=0;
		for(i=0;i<=200000;i++) {
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		Thread.sleep(2000);
		logger.trace("after sleep",i.toString());
	}
		logger.trace("finished calling the function");
		return "Sample Spring Boot App - Log4j";

	}

}
