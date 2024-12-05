package com.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	private static Logger _logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping
	public String home(@RequestParam(defaultValue = "default value", required = false) String value) {
		_logger.trace("This is home page {}",value);
		_logger.info("This is home page {}",value);
		_logger.warn("This is home page {}",value);
		_logger.error("This is home page {}",value);
		_logger.debug("This is home page {}",value);

		// not recommended
//		System.out.println("this is home page");
		return "This is home api";
	}
}
