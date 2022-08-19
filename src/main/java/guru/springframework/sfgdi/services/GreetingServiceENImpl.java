package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceENImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside Primary GreetingServiceENImpl: Good morning!";
    }
}
