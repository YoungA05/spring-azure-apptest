package com.example.springazureapptest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@Controller
public class SpringAzureApptestApplication {

	@GetMapping("/")
		public String WelcomeMethod() {
			return "main/welcome";
		}


	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApptestApplication.class, args);
	}

}
