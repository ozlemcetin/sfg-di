package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
    Consider marking one of the beans as @Primary,
    updating the consumer to accept multiple beans,
    or using @Qualifier to identify the bean that should be consumed
 */


//@Primary
//@Service -> moved to GreetingServiceConfig.java
public class GreetingServiceENImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside Primary GreetingServiceENImpl: Good morning!";
    }
}
