package com.initial.studio.generative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( "/spring-boot")
@RestController
public class GenerariveController {
@GetMapping("/hello")
 public String firstApp(@RequestParam(value = "name", defaultValue = "Coder") String name) {
  return String.format("Congratulations  %s, you've built your first Spring Boot Application from Scratch!!", name);
 }
	
}
