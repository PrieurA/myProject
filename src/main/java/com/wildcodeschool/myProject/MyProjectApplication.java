package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
					"<li><a href='http://localhost:8080/doctor/10'>Tenth Doctor</a></li>" +
					"<li><a href='http://localhost:8080/doctor/11'>Eleventh Doctor</a></li>" +
					"<li><a href='http://localhost:8080/doctor/12'>Twelfth Doctor</a></li>" +
					"<li><a href='http://localhost:8080/doctor/13'>Thirteenth Doctor</a></li>" +
				"</ul>";
	}
	@RequestMapping("/doctor/10")
	@ResponseBody
	public String tenthDoctor(){
		return "David Tennant " +
				"<hr>" +
				"<a href='http://localhost:8080/'>Home</a>";
	}
	@RequestMapping("/doctor/11")
	@ResponseBody
	public String eleventhDoctor(){
		return "Matt Smith" +
				"<hr>" +
				"<a href='http://localhost:8080/'>Home</a>";
	}
	@RequestMapping("/doctor/12")
	@ResponseBody
	public String twelfthDoctor(){
		return "Peter Capaldi" +
				"<hr>" +
				"<a href='http://localhost:8080/'>Home</a>";
	}
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String thirteenthDoctor(){
		return "Jodie Whittaker" +
				"<hr>" +
				"<a href='http://localhost:8080/'>Home</a>";
	}

}
