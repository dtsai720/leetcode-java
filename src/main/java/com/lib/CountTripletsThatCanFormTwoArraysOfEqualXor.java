package com.lib;

import java.util.HashMap;

/**
 * Class to solve the problem of counting the number of triplets that can form two arrays of equal
 * XOR.
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXor {

  /**
   * Calculates the frequency of each element in the input array.
   *
   * @param nums The input array of integers.
   * @return A HashMap where the keys are the elements in the array and the values are their
   *         frequencies.
   */
  public int countTriplets(int[] nums) {
    int output = 0;
    int current = 0;
    HashMap<Integer, Integer> count = new HashMap<>();
    HashMap<Integer, Integer> total = new HashMap<>();
    count.put(0, 1);
    total.put(0, 0);
    for (int i = 0; i < nums.length; i++) {
      current ^= nums[i];
      if (count.containsKey(current)) {
        output += count.get(current) * i - total.get(current);
      }

      count.put(current, count.getOrDefault(current, 0) + 1);
      total.put(current, total.getOrDefault(current, 0) + i + 1);
    }

    return output;
  }
}
