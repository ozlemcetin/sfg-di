package guru.springframework.sfgdi.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoDisposableBeanImpl implements DisposableBean {

    public LifeCycleDemoDisposableBeanImpl() {
        System.out.println("I'm in the LifeCycleDemoDisposableBeanImpl Constructor");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");

    }
}
