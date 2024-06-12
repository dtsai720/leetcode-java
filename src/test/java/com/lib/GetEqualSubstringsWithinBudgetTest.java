package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.GetEqualSubstringsWithinBudget;

class GetEqualSubstringsWithinBudgetTest {

  private GetEqualSubstringsWithinBudget solution;

  @BeforeEach
  public void setUp() {
    this.solution = new GetEqualSubstringsWithinBudget();
  }

  @Test
  public void testExampleI() {
    String s = "abcd";
    String t = "bcdf";
    int maxCost = 3;
    int expected = 3;
    int actual = this.solution.equalSubstring(s, t, maxCost);

    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    String s = "abcd";
    String t = "cdef";
    int maxCost = 3;
    int expected = 1;
    int actual = this.solution.equalSubstring(s, t, maxCost);

    assertEquals(expected, actual);
  }

  @Test
  public void testExampleIII() {
    String s = "abcd";
    String t = "acde";
    int maxCost = 0;
    int expected = 1;
    int actual = this.solution.equalSubstring(s, t, maxCost);

    assertEquals(expected, actual);
  }
}
