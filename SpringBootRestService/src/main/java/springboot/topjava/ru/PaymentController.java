package springboot.topjava.ru;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.topjava.ru.entity.Task;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PaymentController {

    @GetMapping("/")
    public ResponseEntity main(){

        return ResponseEntity.ok("bingo");

    }

    @GetMapping("/task")

    public ResponseEntity task(){

        return ResponseEntity.ok(new Task(1,"Евгений"));
    }
}
