package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /*
       @Autowired annotation on the constructor is optional
     */
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreetingMessage() {
        return greetingService.sayGreeting();
    }
}
