package edu.pdx.cs410J.yl6;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void testcase1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "10101");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooQix**\r\n"));
  }

  @Test
  void testcase2() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "101");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("1*1\r\n"));
  }

  @Test
  void testcase3() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "105");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooBarQix*Bar\r\n"));
  }
  
  @Test
  void testcase4() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "303");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooFoo*Foo\r\n"));
  }
}
