package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${hello.message}")
    private static String message;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + " hello from spring boot";
    }
    
}
