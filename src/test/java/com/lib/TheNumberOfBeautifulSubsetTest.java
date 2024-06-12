package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import com.lib.TheNumberOfBeautifulSubset;

class TheNumberOfBeautifulSubsetTest {

  private TheNumberOfBeautifulSubset solution;

  @BeforeEach
  void setUp() {
    this.solution = new TheNumberOfBeautifulSubset();
  }

  @Test
  public void testExampleI() {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6));
    int k = 2;
    int actual = this.solution.beautifulSubsets(nums, k);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1));
    int k = 1;
    int actual = this.solution.beautifulSubsets(nums, k);
    int expected = 1;
    assertEquals(expected, actual);
  }
}
