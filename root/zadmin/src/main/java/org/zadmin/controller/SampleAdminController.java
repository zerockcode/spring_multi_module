package org.zadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SampleAdminController {
	
	@GetMapping("/admin1")
	public void admin1() {
		
		log.info("/admin1................");
		
	}

}
