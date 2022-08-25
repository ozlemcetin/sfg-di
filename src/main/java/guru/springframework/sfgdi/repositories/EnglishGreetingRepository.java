package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepository implements GreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World from Repository!";
    }
}
