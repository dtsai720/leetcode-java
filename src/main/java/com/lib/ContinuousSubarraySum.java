package com.lib;

import java.util.HashSet;
import java.util.Set;

/**
 * Class to solve the problem of finding if there exists a subarray of the given array that sums to
 * a multiple of k.
 */
public class ContinuousSubarraySum {

  /**
   * Checks if there exists a subarray of the given array that sums to a multiple of k.
   *
   * @param nums The input array of integers.
   * @param k The integer to check if there exists a subarray that sums to a multiple of it.
   * @return True if there exists a subarray that sums to a multiple of k, false otherwise.
   */
  public boolean checkSubarraySum(int[] nums, int k) {
    long sum = 0;
    Set<Long> set = new HashSet<>();
    for (int num : nums) {
      sum = (sum + num) % k;
      if (set.contains(sum)) {
        return true;
      }

      set.add(((sum - num) % k + k) % k);
    }

    return false;
  }
}
