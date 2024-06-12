package com.lib;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to solve the problem of checking if a list of numbers can be divided into n groups of k
 * consecutive numbers.
 */
public class HandOfStraights {

  /**
   * Checks if the given list of numbers can be divided into n groups of k consecutive numbers.
   *
   * @param nums The list of numbers to check.
   * @param k The number of consecutive numbers in each group.
   * @return True if the list of numbers can be divided into n groups of k consecutive numbers,
   *         false otherwise.
   */
  public boolean isStraightHand(List<Integer> nums, int k) {
    if (nums.size() % k != 0) {
      return false;
    }
    Collections.sort(nums);
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int num : nums) {
      if (map.get(num) == 0) {
        continue;
      }
      for (int i = 0; i < k; i++) {
        Integer count = map.getOrDefault(num + i, 0);

        if (count == 0) {
          return false;
        }

        map.put(num + i, count - 1);
      }
    }

    return true;
  }
}
