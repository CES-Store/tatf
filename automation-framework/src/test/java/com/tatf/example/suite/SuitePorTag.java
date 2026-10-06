package com.tatf.example.suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite por tag: humo")
@SelectPackages("com.tatf.example.suite.pruebas")
@IncludeTags("humo")
public class SuitePorTag {
}
