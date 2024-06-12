package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.SpecialArrayWithElementsGreaterThanOrEqualX;

class SpecialArrayWithElementsGreaterThanOrEqualXTest {

  private SpecialArrayWithElementsGreaterThanOrEqualX solution;

  @BeforeEach
  void setUp() {
    this.solution = new SpecialArrayWithElementsGreaterThanOrEqualX();
  }

  @Test
  public void testExampleI() {
    int[] nums = {3,5};
    int actual = this.solution.specialArray(nums);
    int expected = 2;

    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    int[] nums = {0,0};
    int actual = this.solution.specialArray(nums);
    int expected = -1;

    assertEquals(expected, actual);
  }
}
