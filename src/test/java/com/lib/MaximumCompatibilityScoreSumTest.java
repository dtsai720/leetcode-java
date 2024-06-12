package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lib.MaximumCompatibilityScoreSum;

class MaximumCompatibilityScoreSumTest {

  private MaximumCompatibilityScoreSum solution;

  @BeforeEach
  void init() {
    this.solution = new MaximumCompatibilityScoreSum();
  }

  @Test
  void testExampleI() {
    int[][] students = {{1, 1, 0}, {1, 0, 1}, {0, 0, 1}};
    int[][] mentors = {{1, 0, 0}, {0, 0, 1}, {1, 1, 0}};
    assertEquals(8, this.solution.maxCompatibilitySum(students, mentors));
  }

  @Test
  void testExampleII() {
    int[][] students = {{0, 0}, {0, 0}, {0, 0}};
    int[][] mentors = {{1, 1}, {1, 1}, {1, 1}};
    assertEquals(0, this.solution.maxCompatibilitySum(students, mentors));
  }
}
