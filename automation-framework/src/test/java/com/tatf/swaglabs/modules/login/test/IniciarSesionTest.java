package com.tatf.swaglabs.login.test;

import com.tatf.swaglabs.base.BaseTest;
import com.tatf.swaglabs.login.data.LoginData;
import com.tatf.swaglabs.login.task.LoginTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IniciarSesionTest extends BaseTest {

    private LoginTask iniciarSesion;

    @BeforeEach
    public void configurar() {
        this.iniciarSesion = new LoginTask(browser);
    }

    @Test
    @DisplayName("Inicia sesión con usuario y contraseña correcto")
    public void iniciarSesionCorrectoTest() {
        this.iniciarSesion.enterToSystem(url);
        this.iniciarSesion.verifyTitle(LoginData.TITLE);
        this.iniciarSesion.logInToTheSystemAndVerify(userNameValue, passwordValue);
    }
}
