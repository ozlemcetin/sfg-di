package guru.springframework.sfgdi.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("***Creating a SingletonBean");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
