package com.vinay.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Profile {

	  @RequestMapping("/profile")
	    public String greeting() {
	        return "This is vinay, success..";
	    }
}
