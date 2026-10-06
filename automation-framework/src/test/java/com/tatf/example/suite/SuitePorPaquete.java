package com.tatf.example.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite por paquete: pruebas.home")
@SelectPackages("com.tatf.example.suite.pruebas.home")
public class SuitePorPaquete {
}
