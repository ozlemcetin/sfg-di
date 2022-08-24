package guru.springframework.sfgdi.services;

//@Profile({"EN", "default"})
//@Service("i18nService") -> moved to GreetingServiceConfig.java
public class GreetingServiceI18nEnglishImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceI18nEnglishImpl: Hello World!";
    }
}
