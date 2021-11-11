package com.codingdojo.heyhuman.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@RequestMapping("/")
	public String index() {
		return "Hello Human";
	}
	
	@RequestMapping("/{name}")
	public String helloName(@PathVariable String name) {
		return String.format("Hello %s",name);
	}
	
	@RequestMapping("/{name}/sir")
	public String fullName(@PathVariable String name, @RequestParam(value="lname") String lname) {
		return String.format("Hello %s %s", name, lname);
	}
}
