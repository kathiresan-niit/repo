/*
this is a sample demo for branching
*/
package com.techsoft.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(){
		return "blogOperations";
	}
}
