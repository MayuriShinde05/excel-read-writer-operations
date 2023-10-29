package com.crif.globe.utility;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crif.globe.utility.service.ExcelReader;

@RestController
@SpringBootApplication
public class AuthorizationServerApplication {
	@Autowired
	private ExcelReader excelReader;

	public static void main(String[] args) {
    	SpringApplication.run(AuthorizationServerApplication.class, args);
    }

	@PostMapping(value = { "/secured" }, produces = "application/json")
	public String sayHello(Model model, @RequestParam(defaultValue = "Globe5KRecord", required = false) String name)
			throws IOException {
		model.addAttribute("name", name);
		excelReader.prepareOrchestratorRequest();
		return "Hello " + name;
	}
}
