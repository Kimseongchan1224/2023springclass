package com.sg.leo.cotrollerr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("HTML 파일이 요청됨");
		return "redirect:starthere.html";
	}
	
	@GetMapping("/img")
	public String img() {
		System.out.println("IMG 파일이 요청됨");
		return "redirect:img/sonny.jpg";
	}
	@GetMapping("/jsp")
	public String jsp(){
		System.out.println("Jsp파일이 요청됨");
		return "hellojsp.jsp";
	}	
}