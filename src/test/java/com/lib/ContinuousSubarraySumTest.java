package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.ContinuousSubarraySum;

class ContinuousSubarraySumTest {

  private ContinuousSubarraySum solution;

  @BeforeEach
  void setUp() {
    this.solution = new ContinuousSubarraySum();
  }

  @Test
  void test1() {
    int[] nums = {23, 2, 4, 6, 7};
    int k = 6;
    assertTrue(this.solution.checkSubarraySum(nums, k));
  }

  @Test
  void test2() {
    int[] nums = {23, 2, 6, 4, 7};
    int k = 6;
    assertTrue(this.solution.checkSubarraySum(nums, k));
  }

  @Test
  void test3() {
    int[] nums = {23, 2, 6, 4, 7};
    int k = 13;
    assertFalse(this.solution.checkSubarraySum(nums, k));
  }
}
