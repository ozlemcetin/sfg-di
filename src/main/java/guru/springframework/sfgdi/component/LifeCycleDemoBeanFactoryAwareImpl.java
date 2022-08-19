package guru.springframework.sfgdi.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBeanFactoryAwareImpl implements BeanFactoryAware {

    public LifeCycleDemoBeanFactoryAwareImpl() {
        System.out.println("I'm in the LifeCycleDemoBeanFactoryAwareImpl Constructor");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }
}
