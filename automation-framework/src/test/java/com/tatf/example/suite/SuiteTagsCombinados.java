package com.tatf.example.suite;

import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("Suite combinada: regresión sin debug")
@SelectPackages("com.tatf.example.suite.pruebas")
@IncludeTags("regresion")
@ExcludeTags("debug")
@IncludeClassNamePatterns(".*Test")
public class SuiteTagsCombinados {
}
