package com.example;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waffle.servlet.WindowsPrincipal;

import java.awt.*;

@RestController
public class TestController {
	
	@RequestMapping
	public String test(Authentication auth) {
		WindowsPrincipal wp = (WindowsPrincipal) auth.getPrincipal();
		System.out.println("User SID: " + wp.getSid());
		return String.format("You are logged in as: %s", auth.getPrincipal());
	}
	
}