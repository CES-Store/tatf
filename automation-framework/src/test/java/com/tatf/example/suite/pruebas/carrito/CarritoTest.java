package com.tatf.example.suite.pruebas.carrito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("carrito")
public class CarritoTest {

    @Test
    @Tag("humo")
    @Tag("regresion")
    @DisplayName("Carrito: mensaje de humo y regresión")
    public void carritoHumoTest() {
        System.out.println(">>> CarritoTest.carritoHumoTest [humo, regresion]");
    }

    @Test
    @Tag("regresion")
    @DisplayName("Carrito: mensaje de regresión")
    public void carritoRegresionTest() {
        System.out.println(">>> CarritoTest.carritoRegresionTest [regresion]");
    }

    @Test
    @DisplayName("Carrito: mensaje sin tags")
    public void carritoSinTagTest() {
        System.out.println(">>> CarritoTest.carritoSinTagTest [sin tag]");
    }
}
