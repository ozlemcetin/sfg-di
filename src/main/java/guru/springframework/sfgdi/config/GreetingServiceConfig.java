package guru.springframework.sfgdi.config;


import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.GreetingRepository;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    /*
        This is the traditional usa case if we were to use a third library components.
        By default, the bean's name generated in the context is going to be the name of the method
        Default, the class name as the method name
     */
    @Primary
    @Bean
    GreetingServiceENImpl greetingServiceENImpl() {
        return new GreetingServiceENImpl();
    }

    @Bean
    GreetingServiceDEImpl greetingServiceDEImpl() {
        return new GreetingServiceDEImpl();
    }

    @Bean("greetingServiceESImpl")
    GreetingServiceESImpl greetingServiceFooBar() {
        return new GreetingServiceESImpl();
    }

    @Bean
    GreetingServiceFRImpl greetingServiceFRImpl() {
        return new GreetingServiceFRImpl();
    }


    /*
        to define @Service("i18nService")
     */

    @Profile({"EN", "default"})
    @Bean
    GreetingService i18nService(GreetingRepository repository) {
        return new GreetingServiceI18nEnglishImpl(repository);
    }

    @Bean
    GreetingRepository greetingRepository() {
        return new EnglishGreetingRepository();
    }

    @Profile({"ES"})
    @Bean("i18nService")
    GreetingService greetingServiceI18nSpanish() {
        return new GreetingServiceI18nSpanishImpl();
    }

    @Profile("FR")
    @Bean("i18nService")
    GreetingService greetingServiceI18nFrench() {
        return new GreetingServiceI18nFrenchImpl();
    }
}
