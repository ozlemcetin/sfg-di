package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceENImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceENImpl: Hello World!";
    }
}
