package guru.springframework.sfgdi.component;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBeanNameAwareImpl implements BeanNameAware {

    public LifeCycleDemoBeanNameAwareImpl() {
        System.out.println("I'm in the LifeCycleDemoBeanNameAwareImpl Constructor");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);

    }

}
