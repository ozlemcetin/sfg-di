package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("---MyController");
        {
            MyController myController = (MyController) ctx.getBean("myController");
            System.out.println(myController.sayHello());
        }

        System.out.println("---PropertyInjectedController");
        {
            PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
            System.out.println(propertyInjectedController.getGreetingMessage());
        }

        System.out.println("---SetterInjectedController");
        {
            SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
            System.out.println(setterInjectedController.getGreetingMessage());
        }

        System.out.println("---ConstructorInjectedController");
        {
            ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
            System.out.println(constructorInjectedController.getGreetingMessage());
        }

    }

}
