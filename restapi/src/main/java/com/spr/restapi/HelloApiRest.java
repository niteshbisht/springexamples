package com.spr.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiRest {

	@GetMapping("/api/hello")
	ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello");
	}
}
