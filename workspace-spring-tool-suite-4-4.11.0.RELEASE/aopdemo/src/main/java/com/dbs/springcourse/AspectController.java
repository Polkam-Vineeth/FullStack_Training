package com.dbs.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectController {

	@Autowired
	BusinessLogic bl;
	
	@GetMapping("vin")
	
	public void vin() {
//		System.out.println();
		bl.blogic();
	}

}
