package pl.teb.edukacja.owca;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.management.counter.Counter;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
    private static final  String template="Hello,%s";
    private final AtomicLong counter=new AtomicLong();
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "hw") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template,name));

    }


}
