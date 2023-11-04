package academy.digitallab.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.css.Counter;

import java.util.concurrent.atomic.AtomicLong;

@RestController 
@RequestMapping(value="greeting")  //para definir el path de nuestro enpoint
    public class GreetingController {

    private final AtomicLong = new AtomicLong();
    private static final String template ="Hello %";

    @GetMapping
    public Greeting greeting(@RequestParam(value="name",dedfaultValue="Wordl"),String name  ){
    return new Greeting(counter.incrementAndGet(),String.format(template,name));

    }



    
}

