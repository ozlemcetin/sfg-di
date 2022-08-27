package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoApplicationContextAwareImpl implements ApplicationContextAware {

    public LifeCycleDemoApplicationContextAwareImpl() {
        System.out.println("I'm in the LifeCycleDemoApplicationContextAwareImpl Constructor");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }
}
