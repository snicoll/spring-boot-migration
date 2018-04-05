package com.example.speakerservice.web;

import com.example.speakerservice.HelloProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private final HelloProperties properties;

	public HomeController(HelloProperties properties) {
		this.properties = properties;
	}

	@GetMapping("/")
	public String hello() {
		return String.format("Hello %s (You have %d seconds)",
				this.properties.getTarget(), this.properties.getAnswerTimeout());
	}

}
