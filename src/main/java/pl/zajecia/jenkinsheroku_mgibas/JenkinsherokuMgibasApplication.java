package pl.zajecia.jenkinsheroku_mgibas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsherokuMgibasApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsherokuMgibasApplication.class, args);
    }

    @GetMapping
    public String get(){
        return "Hello Jenkins";
    }
}
