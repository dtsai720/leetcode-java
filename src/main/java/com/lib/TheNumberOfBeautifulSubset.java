package com.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to solve the problem of finding the number of beautiful subsets in a list of numbers.
 */
public class TheNumberOfBeautifulSubset {

  /**
   * Finds the number of beautiful subsets in the given list of numbers.
   *
   * @param nums The list of numbers to search.
   * @param k The difference between the numbers in the beautiful subset.
   * @return The number of beautiful subsets in the given list of numbers.
   */
  private int helper(List<Integer> nums, List<Integer> array, int k, int idx) {
    if (idx == nums.size()) {
      return 0;
    }

    int count = helper(nums, array, k, idx + 1);
    if (Collections.binarySearch(array, nums.get(idx) - k) < 0) {
      array.add(nums.get(idx));
      count += 1 + helper(nums, array, k, idx + 1);
      array.remove(array.size() - 1);
    }

    return count;
  }

  /**
   * Finds the number of beautiful subsets in the given list of numbers.
   *
   * @param nums The list of numbers to search.
   * @param k The difference between the numbers in the beautiful subset.
   * @return The number of beautiful subsets in the given list of numbers.
   */
  public int beautifulSubsets(List<Integer> nums, int k) {
    Collections.sort(nums);
    return this.helper(nums, new ArrayList<>(), k, 0);
  }
}
