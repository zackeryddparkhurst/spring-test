package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${hello.message}")
    private String message;

    @Value("${hello.something}")
    private String something;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + " hello from spring boot" + message;
    }
    
}
