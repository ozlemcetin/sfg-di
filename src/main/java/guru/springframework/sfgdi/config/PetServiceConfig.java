package guru.springframework.sfgdi.config;


import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PetServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }


    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory factory) {
        return factory.getPetService("dog");
    }

    @Profile({"cat"})
    @Bean
    PetService catPetService(PetServiceFactory factory) {
        return factory.getPetService("cat");
    }
}
