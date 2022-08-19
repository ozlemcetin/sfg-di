package guru.springframework.sfgdi.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemo {

    public LifeCycleDemo() {
        System.out.println("I'm in the LifeCycleDemo Constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The  @PostConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The  @PreDestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor - postProcessBeforeInitialization()");
    }

    public void afterInit() {
        System.out.println("## - After Init - Called by Bean Post Processor - postProcessAfterInitialization()");
    }
}
