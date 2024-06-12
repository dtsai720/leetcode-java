package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.SubarraySumsDivisibleByK;

class SubarraySumsDivisibleByKTest {

  SubarraySumsDivisibleByK solution;

  @BeforeEach
  void setUp() {
    solution = new SubarraySumsDivisibleByK();
  }

  @Test
  void test1() {
    int[] A = {4, 5, 0, -2, -3, 1};
    int K = 5;
    int expected = 7;
    int actual = solution.subarraysDivByK(A, K);
    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    int[] A = {5};
    int K = 9;
    int expected = 0;
    int actual = solution.subarraysDivByK(A, K);
    assertEquals(expected, actual);
  }
}
