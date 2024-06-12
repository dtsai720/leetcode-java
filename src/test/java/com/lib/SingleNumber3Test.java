package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.lib.SingleNumber3;

public class SingleNumber3Test {

  private SingleNumber3 solution;

  @BeforeEach
  public void setUp() {
    this.solution = new SingleNumber3();
  }

  @Test
  public void testSingleNumber() {
    int[] nums = {1, 2, 1, 3, 2, 5};
    List<Integer> expected = new ArrayList<>(List.of(3, 5));
    List<Integer> result = this.solution.singleNumber(nums);
    Collections.sort(result);
    assertEquals(expected, result);
  }

  @Test
  public void testSingleNumberII() {
    int[] nums = {-1, 0};
    List<Integer> expected = new ArrayList<>(List.of(-1, 0));
    List<Integer> result = this.solution.singleNumber(nums);
    Collections.sort(result);
    assertEquals(expected, result);
  }

  @Test
  public void testSingleNumber3() {
    int[] nums = {0, 1};
    List<Integer> expected = new ArrayList<>(List.of(0, 1));
    List<Integer> result = this.solution.singleNumber(nums);
    Collections.sort(result);
    assertEquals(expected, result);
  }
}
