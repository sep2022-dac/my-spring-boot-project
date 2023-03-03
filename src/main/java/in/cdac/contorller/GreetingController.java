package in.cdac.contorller;

import in.cdac.modal.Greeting;
import in.cdac.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/message")
    public Greeting getGreetingObjectV1() {
        return greetingService.getGreetingObjectV3();
    }

    @GetMapping("/message1")
    public ResponseEntity<Greeting> getGreetingObjectV2() {
        Greeting greetingObject = greetingService.getGreetingObjectV3();
        return new ResponseEntity<>(greetingObject, HttpStatus.CREATED);
    }

}
