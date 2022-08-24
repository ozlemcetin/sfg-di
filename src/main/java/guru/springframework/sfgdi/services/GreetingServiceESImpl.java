package guru.springframework.sfgdi.services;

//@Service -> moved to GreetingServiceConfig.java
public class GreetingServiceESImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceESImpl: Buenos días!";
    }
}
