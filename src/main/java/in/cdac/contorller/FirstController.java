package in.cdac.contorller;

import in.cdac.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080
// http://localhost:8080/first
@RestController
@RequestMapping("/first")
public class FirstController {

    @Autowired
    GreetingService greetingService;

    // http://localhost:8080/first/hi
    @GetMapping("/hi")
    public String hello() {
        // ...business logic
        return "First - Hello World!";
    }

    // http://localhost:8080/first/hello1
    @GetMapping("/hello1")
    public String hello1() {
        return "First - Duplicate World!";
    }

    // http://localhost:8080/first/h2
    @GetMapping("/h2")
    public String hello2() {
        return "First - Duplicate World 2222222!";
    }

}
