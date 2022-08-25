package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.GreetingRepository;

//@Profile({"EN", "default"})
//@Service("i18nService") -> moved to GreetingServiceConfig.java
public class GreetingServiceI18nEnglishImpl implements GreetingService {


    private final GreetingRepository repository;

    public GreetingServiceI18nEnglishImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceI18nEnglishImpl: " + repository.getGreeting();
    }
}
