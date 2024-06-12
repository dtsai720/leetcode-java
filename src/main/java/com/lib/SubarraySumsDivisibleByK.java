package com.lib;

/**
 * Class to solve the problem of finding the number of subarrays whose sum is divisible by K.
 */
public class SubarraySumsDivisibleByK {

  /**
   * Finds the number of subarrays whose sum is divisible by K.
   *
   * @param nums The array of integers to search.
   * @param k The integer to check if there exists a subarray that sums to a multiple of it.
   * @return The number of subarrays whose sum is divisible by K.
   */
  public int subarraysDivByK(int[] nums, int k) {
    int[] count = new int[k];
    count[0] = 1;
    int sum = 0;
    int res = 0;
    for (int num : nums) {
      sum = ((sum + num) % k + k) % k;
      res += count[sum]++;
    }
    return res;
  }
}
