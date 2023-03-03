package in.cdac.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/hello
@RestController
@RequestMapping("/hello")
public class HelloController {

    // http://localhost:8080/hello/he
    @GetMapping("/he")
    public String hello() {
        // ...business logic
        return "Hello World!";
    }

    // http://localhost:8080/hello/hello1
    @GetMapping("/hello1")
    public String hello1() {
        return "Duplicate World!";
    }

    // http://localhost:8080/hello/h2
    @GetMapping("/h2")
    public String hello2() {
        return "Duplicate World 2222222!";
    }

}
