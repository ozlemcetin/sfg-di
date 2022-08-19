package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceENImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceENImpl();
    }

    @Test
    void getGreetingMessage() {
        System.out.println(controller.getGreetingMessage());
    }
}