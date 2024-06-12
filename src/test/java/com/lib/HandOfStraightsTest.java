package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import com.lib.HandOfStraights;

class HandOfStraightsTest {

  HandOfStraights solution;

  @BeforeEach
  void init() {
    this.solution = new HandOfStraights();
  }

  @Test
  void testExampleI() {
    List<Integer> nums = Arrays.asList(1, 2, 3, 6, 2, 3, 4, 7, 8);
    assertTrue(this.solution.isStraightHand(nums, 3));
  }

  @Test
  void testExampleII() {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
    assertFalse(this.solution.isStraightHand(nums, 4));
  }
}
