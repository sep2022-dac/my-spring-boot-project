package in.cdac.contorller;

import in.cdac.modal.Greeting;
import in.cdac.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @PostMapping("/add-record")
    public ResponseEntity<?> addRecord(@RequestBody Greeting greeting) {
        Greeting greeting1 = greetingService.addRecord(greeting);
        return new ResponseEntity<>(greeting1, HttpStatus.CREATED);
    }

    @GetMapping("/read-all-record")
    public ResponseEntity<?> getAllGreetings() {
        List<Greeting> allGrettings = greetingService.getAllGrettings();
        return new ResponseEntity<>(allGrettings, HttpStatus.OK);
    }

    @GetMapping("/read-by-id/{id}")
    public ResponseEntity<?> readGreetingById(@PathVariable Integer id) {
        Greeting greeting = greetingService.readGreetingById(id);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<?> deleteRecordById(@PathVariable Integer id) {
        boolean byId = greetingService.deleteById(id);
        return new ResponseEntity<>(byId, HttpStatus.GONE);
    }


    @PostMapping("/add-record-hard-coded")
    public ResponseEntity<?> addRecordHardCoded() {
        Greeting greeting = greetingService.addRecordHardCoded();
        return new ResponseEntity<>(greeting, HttpStatus.CREATED);
    }

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
