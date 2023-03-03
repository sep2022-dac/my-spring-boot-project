package in.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MySpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProjectApplication.class, args);
	}

	// http://localhost:8080
	@GetMapping
	public String hello() {
		// ...business logic
		return "Hello World!";
	}

	// http://localhost:8080/hello1
	@GetMapping("/hello1")
	public String hello1() {
		return "Duplicate World!";
	}

	// http://localhost:8080/h2
	@GetMapping("/h2")
	public String hello2() {
		return "Duplicate World 2222222!";
	}

}


