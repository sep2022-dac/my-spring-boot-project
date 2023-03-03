package in.cdac.service;

import in.cdac.modal.Greeting;
import in.cdac.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {


    @Autowired
    GreetingRepository greetingRepository;

    public Greeting addRecord(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    public List<Greeting> getAllGrettings() {
        return greetingRepository.findAll();
    }

    public Greeting readGreetingById(Integer id) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        return optionalGreeting.orElseGet(() -> {
             throw new RuntimeException("Record Does not Exists. Please check the ID");
        });
    }

    public boolean deleteById(Integer id) {
        greetingRepository.deleteById(id);
        return true;
    }


    public Greeting addRecordHardCoded() {
        Greeting greeting = Greeting.builder()
                .message("“Inside of every problem lies an opportunity ........Thanks Postgres for Saving my day..”")
                .build();

        // Saving into the databse here.
        return greetingRepository.save(greeting);
    }

    public Greeting getGreetingObjectV3() {
        return Greeting.builder()
                .id(1)
                .message("“Inside of every problem lies an opportunity ........BUILDER PATTERN..”")
                .build();
    }
}
