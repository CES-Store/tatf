package com.tatf.example.suite;

import com.tatf.example.suite.pruebas.home.HomeTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite por clase: HomeTest")
@SelectClasses(HomeTest.class)
public class SuitePorClase {
}
