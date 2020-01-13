package task.manager.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class RunApplication {
	@RequestMapping("/")
	public String welcome(Model model) {		
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}
}
