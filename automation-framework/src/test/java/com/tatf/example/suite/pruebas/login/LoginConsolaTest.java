package com.tatf.example.suite.pruebas.login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("login")
public class LoginConsolaTest {

    @Test
    @Tag("humo")
    @DisplayName("Login consola: mensaje de humo")
    public void loginConsolaHumoTest() {
        System.out.println(">>> LoginConsolaTest.loginConsolaHumoTest [humo]");
    }

    @Test
    @Tag("regresion")
    @DisplayName("Login consola: mensaje de regresión")
    public void loginConsolaRegresionTest() {
        System.out.println(">>> LoginConsolaTest.loginConsolaRegresionTest [regresion]");
    }
}
