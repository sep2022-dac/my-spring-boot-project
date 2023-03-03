package in.cdac.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/message")
    public String greetingMessage() {
        return "“Inside of every problem lies an opportunity.”";
    }
}
