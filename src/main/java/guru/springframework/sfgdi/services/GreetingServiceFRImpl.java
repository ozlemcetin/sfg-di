package guru.springframework.sfgdi.services;

//@Service -> moved to GreetingServiceConfig.java
public class GreetingServiceFRImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceFRImpl: Bonjour!";
    }
}
