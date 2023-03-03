package in.cdac.service;

import in.cdac.modal.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting getGreetingObjectV3() {
        return Greeting.builder()
                .id(1)
                .message("“Inside of every problem lies an opportunity ........BUILDER PATTERN..”")
                .build();
    }
}
