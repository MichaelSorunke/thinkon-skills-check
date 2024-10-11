package com.example.demo;

// Add the import
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

// Add the controller
@RestController
class Helloworld {
        @GetMapping("/")
        public String greet() {
                return "Hello!";
        }
        
}
