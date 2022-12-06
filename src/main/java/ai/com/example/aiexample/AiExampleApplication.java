package ai.com.example.aiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class AiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiExampleApplication.class, args);
	}
	
	@GetMapping("/ai-example")
  	public String greet() {
    		return "Hello, world!";
  	}

}
