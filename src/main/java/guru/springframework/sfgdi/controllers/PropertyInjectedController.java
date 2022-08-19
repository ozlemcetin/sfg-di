package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /*
        Field injection is not recommended!
     */
    @Autowired
    public GreetingService greetingService;

    public String getGreetingMessage() {
        return greetingService.sayGreeting();
    }
}
