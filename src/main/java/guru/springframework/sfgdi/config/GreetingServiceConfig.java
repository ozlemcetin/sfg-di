package guru.springframework.sfgdi.config;


import guru.springframework.sfgdi.services.GreetingServiceDEImpl;
import guru.springframework.sfgdi.services.GreetingServiceENImpl;
import guru.springframework.sfgdi.services.GreetingServiceESImpl;
import guru.springframework.sfgdi.services.GreetingServiceFRImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetingServiceConfig {

    /*
        This is the traditional usa case if we were to use a third library components.
        By default, the bean's name generated in the context is going to be the name of the method
        Default, the class name as the method name
     */


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

    @Primary
    @Bean
    GreetingServiceENImpl greetingServiceENImpl() {
        return new GreetingServiceENImpl();
    }
}
