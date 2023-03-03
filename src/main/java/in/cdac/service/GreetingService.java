package in.cdac.service;

import in.cdac.modal.Greeting;
import in.cdac.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public List<Greeting> getAllGrettings() {
        return greetingRepository.findAll();
    }


    public Greeting getGreetingObjectV3() {
        return Greeting.builder()
                .id(1)
                .message("“Inside of every problem lies an opportunity ........BUILDER PATTERN..”")
                .build();
    }
}
