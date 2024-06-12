package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.CountTripletsThatCanFormTwoArraysOfEqualXor;

class CountTripletsThatCanFormTwoArraysOfEqualXorTest {

  private CountTripletsThatCanFormTwoArraysOfEqualXor solution;

  @BeforeEach
  public void setUp() {
    this.solution = new CountTripletsThatCanFormTwoArraysOfEqualXor();
  }

  @Test
  public void testExampleI() {
    int[] nums = {2, 3, 1, 6, 7};
    int expected = 4;
    int actual = this.solution.countTriplets(nums);
    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    int[] nums = {1, 1, 1, 1, 1};
    int expected = 10;
    int actual = this.solution.countTriplets(nums);
    assertEquals(expected, actual);
  }
}
