package in.cdac.service;

import in.cdac.modal.Greeting;
import org.springframework.stereotype.Service;

// SINGELTON
@Service
public class GreetingService {

    public String getGreeting() {
        return "“Inside of every problem lies an opportunity ..........”";
    }

    public Greeting getGreetingObject() {
        Greeting greeting = new Greeting();
        greeting.setId(1);
        greeting.setMessage("“Inside of every problem lies an opportunity ..........”");
        return greeting;
    }

    public Greeting getGreetingObjectV2() {
        Greeting greeting = new Greeting(1, "“Inside of every problem lies an opportunity ..........”");
        return greeting;
    }

    // MEthod Chaining.
    public Greeting getGreetingObjectV3() {
        return Greeting.builder()
                .id(1)
                .message("“Inside of every problem lies an opportunity ........BUILDER PATTERN..”")
                .build();
    }

    public String getGreeting1() {
        return "“Inside of every problem lies an opportunity ..........”";
    }
}
