package com.demo.main_package;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestConroller annotation let compiler know there is  restController ,when compiler scan the class path it will 
// it will get compile 
@RestController
public class TestController {
	//@RequestMapping as a default accepts get requests,if any API call triggers from the fronted 
	//it will get to the path what mentioned in API call
	@RequestMapping("/test")
	public String sampleFunction () {
		
		
		return "sample";
	}
	
	

}
