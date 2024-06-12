package com.lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class to solve the problem of finding the two numbers that appear only once in an array of
 * numbers.
 */
public class SingleNumber3 {

  /**
   * Finds the two numbers that appear only once in the given array of numbers.
   *
   * @param nums The array of numbers to search.
   * @return The two numbers that appear only once in the given array of numbers.
   */
  public List<Integer> singleNumber(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        set.remove(num);
      } else {
        set.add(num);
      }
    }

    List<Integer> result = new ArrayList<>();
    for (int num : set) {
      result.add(num);
    }

    return result;
  }
}
