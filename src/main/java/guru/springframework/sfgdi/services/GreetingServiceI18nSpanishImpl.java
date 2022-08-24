package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES"})
@Service("i18nService")
public class GreetingServiceI18nSpanishImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceI18nSpanishImpl: Hola Mundo!";
    }
}
