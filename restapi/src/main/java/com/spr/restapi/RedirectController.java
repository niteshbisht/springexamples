package com.spr.restapi;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RedirectController {

	@GetMapping("/redirect")
	public void redirectTo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("https://google.com");
	}
	
}
