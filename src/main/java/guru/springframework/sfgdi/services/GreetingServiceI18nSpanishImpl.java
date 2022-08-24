package guru.springframework.sfgdi.services;

//@Profile({"ES"})
//@Service("i18nService")-> moved to GreetingServiceConfig.java
public class GreetingServiceI18nSpanishImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceI18nSpanishImpl: Hola Mundo!";
    }
}
