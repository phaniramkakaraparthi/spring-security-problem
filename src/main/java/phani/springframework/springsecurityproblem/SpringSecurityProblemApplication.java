package phani.springframework.springsecurityproblem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class)
@SpringBootApplication
public class SpringSecurityProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProblemApplication.class, args);
	}
}
