package guru.springframework.sfgdi.services;

//@Profile("FR")
//@Service("i18nService") -> moved to GreetingServiceConfig.java
public class GreetingServiceI18nFrenchImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceI18nFrenchImpl: Bonjour le monde!";
    }
}
