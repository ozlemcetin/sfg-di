package guru.springframework.sfgdi.repositories;

public class FrenchGreetingRepository implements GreetingRepository {

    @Override
    public String getGreeting() {
        return "Bonjour le monde from Repository!";
    }
}
