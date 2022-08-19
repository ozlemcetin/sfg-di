package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceENImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceENImpl());
    }

    @Test
    void getGreetingMessage() {
        System.out.println(controller.getGreetingMessage());
    }
}