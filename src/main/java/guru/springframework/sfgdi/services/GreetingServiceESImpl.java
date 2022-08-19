package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*
    Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
 */

@Service
public class GreetingServiceESImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceESImpl: Buenos días!";
    }
}
