package com.demo.main_package;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/test")
	public String sampleFunction () {
		
		
		return "sample";
	}
	
	
	

}
