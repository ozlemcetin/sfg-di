package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

//@Service -> moved to GreetingServiceConfig.java
public class GreetingServiceDEImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceDEImpl: Guten Morgen!";
    }
}
