package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.scope.PrototypeBean;
import guru.springframework.sfgdi.scope.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
    @ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})
 */
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        {
            System.out.println("---MyController");
            MyController myController = (MyController) ctx.getBean("myController");
            System.out.println(myController.sayHello());
        }

        {
            System.out.println("---PropertyInjectedController");
            PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
            System.out.println(propertyInjectedController.getGreetingMessage());
        }

        {
            System.out.println("---SetterInjectedController");
            SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
            System.out.println(setterInjectedController.getGreetingMessage());
        }

        {
            System.out.println("---ConstructorInjectedController");
            ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
            System.out.println(constructorInjectedController.getGreetingMessage());
        }

        {
            System.out.println("---I18nController");
            I18nController i18nController = (I18nController) ctx.getBean("i18nController");
            System.out.println(i18nController.getGreetingMessage());
        }

        {
            System.out.println("---PetController");
            PetController petController = (PetController) ctx.getBean("petController");
            System.out.println(petController.whichPetIsTheBest());
        }

        {
            {
                System.out.println("---SingletonBean");
                SingletonBean bean1 = ctx.getBean(SingletonBean.class);
                System.out.println(bean1.getMyScope());

                SingletonBean bean2 = ctx.getBean(SingletonBean.class);
                System.out.println(bean2.getMyScope());
            }

            {
                System.out.println("---PrototypeBean");
                PrototypeBean bean1 = ctx.getBean(PrototypeBean.class);
                System.out.println(bean1.getMyScope());

                PrototypeBean bean2 = ctx.getBean(PrototypeBean.class);
                System.out.println(bean2.getMyScope());
            }


        }

    }

}
