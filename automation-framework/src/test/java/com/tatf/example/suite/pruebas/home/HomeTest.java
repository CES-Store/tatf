package com.tatf.example.suite.pruebas.home;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("home")
public class HomeTest {

    @Test
    @Tag("humo")
    @DisplayName("Home: mensaje de humo")
    public void homeHumoTest() {
        System.out.println(">>> HomeTest.homeHumoTest [humo]");
    }

    @Test
    @Tag("regresion")
    @DisplayName("Home: mensaje de regresión")
    public void homeRegresionTest() {
        System.out.println(">>> HomeTest.homeRegresionTest [regresion]");
    }

    @Test
    @Tag("regresion")
    @Tag("debug")
    @DisplayName("Home: mensaje de regresión + debug")
    public void homeDebugTest() {
        System.out.println(">>> HomeTest.homeDebugTest [regresion, debug]");
    }
}
