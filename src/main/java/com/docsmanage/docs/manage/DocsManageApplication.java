package com.docsmanage.docs.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DocsManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocsManageApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Salut") String name) {
		return String.format("Py dis %s!", name);
	}

}