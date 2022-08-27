package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoInitializingBeanImpl implements InitializingBean {

    public LifeCycleDemoInitializingBeanImpl() {
        System.out.println("I'm in the LifeCycleDemoInitializingBeanImpl Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }
}
