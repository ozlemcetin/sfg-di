package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceDEImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceDEImpl: Guten Morgen!";
    }
}
