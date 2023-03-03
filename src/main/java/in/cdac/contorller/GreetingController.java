package in.cdac.contorller;

import in.cdac.modal.Greeting;
import in.cdac.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/message")
    public String greetingMessage() {
        return greetingService.getGreeting();
    }

    @GetMapping("/message-obj-v1")
    public Greeting getGreetingObjectV1() {
        // return greetingService.getGreetingObject();
        return greetingService.getGreetingObjectV3();
    }

    /*@GetMapping("/message-java-geeks")
    public String greetingMessageJavaGeeks() {
        GreetingService greetingService1 = new GreetingService();
        return greetingService1.getGreeting();
    }*/



}
