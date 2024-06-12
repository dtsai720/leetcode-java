package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.CoinChange2;

/**
 * Class to solve the problem of finding the number of combinations that make up a given amount
 * using a set of coins.
 */
class CoinChange2Test {

  private CoinChange2 solution;

  @BeforeEach
  void setUp() {
    this.solution = new CoinChange2();
  }

  @Test
  void test1() {
    int amount = 5;
    int[] coins = {1, 2, 5};
    int result = this.solution.change(amount, coins);
    assertEquals(4, result);
  }

  @Test
  void test2() {
    int amount = 3;
    int[] coins = {2};
    int result = this.solution.change(amount, coins);
    assertEquals(0, result);
  }

  @Test
  void test3() {
    int amount = 10;
    int[] coins = {10};
    int result = this.solution.change(amount, coins);
    assertEquals(1, result);
  }
}
