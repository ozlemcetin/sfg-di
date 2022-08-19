package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("EN")
@Service("i18nService")
public class GreetingServiceI18nEnglishImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceI18nEnglishImpl: Hello World!";
    }
}
