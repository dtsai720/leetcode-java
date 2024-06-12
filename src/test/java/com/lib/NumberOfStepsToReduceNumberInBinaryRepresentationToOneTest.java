package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.NumberOfStepsToReduceNumberInBinaryRepresentationToOne;

public class NumberOfStepsToReduceNumberInBinaryRepresentationToOneTest {

  private NumberOfStepsToReduceNumberInBinaryRepresentationToOne solution;

  @BeforeEach
  public void init() {
    this.solution = new NumberOfStepsToReduceNumberInBinaryRepresentationToOne();
  }

  @Test
  public void testExampleI() {
    String s = "1101";
    int actual = this.solution.numSteps(s);
    int expected = 6;

    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    String s = "10";
    int actual = this.solution.numSteps(s);
    int expected = 1;

    assertEquals(expected, actual);
  }

  @Test
  public void testExampleIII() {
    String s = "1";
    int actual = this.solution.numSteps(s);
    int expected = 0;

    assertEquals(expected, actual);
  }
}
