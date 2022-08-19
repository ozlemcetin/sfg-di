package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFRImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceFRImpl: Bonjour!";
    }
}
