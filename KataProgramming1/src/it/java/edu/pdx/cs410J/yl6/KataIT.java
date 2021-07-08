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
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooQix**"));
  }

  @Test
  void testcase2() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "101");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("1*1"));
  }

  @Test
  void testcase3() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "105");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooBarQix*Bar"));
  }
  
  @Test
  void testcase4() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "303");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooFoo*Foo"));
  }

  @Test
  void testcase5() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "1");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("1"));
  }

  @Test
  void testcase6() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("2"));
  }

  @Test
  void testcase7() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "3");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooFoo"));
  }

  @Test
  void testcase8() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "5");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("BarBar"));
  }

  @Test
  void testcase9() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "7");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("QixQix"));
  }

  @Test
  void testcase10() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "15");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooBarBar"));
  }

  @Test
  void testcase11() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "33");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooFooFoo"));
  }
  
  @Test
  void testcase12() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "53");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("BarFoo"));
  }

  @Test
  void testcase13() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "51");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooBar"));
  }

  @Test
  void testcase14() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "21");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooQix"));
  }

  @Test
  void testcase15() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "13");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo"));
  }

  /**
   * 10 can be divided by 5, append Foo.
   * 1st digit is 1, append nothing.
   * 2nd digit is 0, append *.
   */
  @Test
  void testcase16() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "10");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Bar*"));
  }

  @Test
  void testcase17() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "9");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo"));
  }

  @Test
  void testcase18() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "8");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("8"));
  }

  @Test
  void testcase19() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "6");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo"));
  }

  @Test
  void testcase20() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("4"));
  }
}
