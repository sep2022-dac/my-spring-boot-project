package in.cdac.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// SINGELTON
@Service
public class GreetingService {

    public String getGreeting() {
        return "“Inside of every problem lies an opportunity ..........”";
    }

    public String getGreeting1() {
        return "“Inside of every problem lies an opportunity ..........”";
    }
}
