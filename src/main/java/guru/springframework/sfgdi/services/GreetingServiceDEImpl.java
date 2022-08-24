package guru.springframework.sfgdi.services;

//@Service -> moved to GreetingServiceConfig.java
public class GreetingServiceDEImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceDEImpl: Guten Morgen!";
    }
}
