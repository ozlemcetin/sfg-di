package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


//@Service -> moved to GreetingServiceConfig.java
public class GreetingServiceESImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceESImpl: Buenos días!";
    }
}
