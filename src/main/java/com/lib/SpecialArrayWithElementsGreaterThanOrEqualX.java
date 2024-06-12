package com.lib;

/**
 * Class to solve the problem of finding the smallest integer x such that there are exactly x
 * elements in the array that are greater than or equal to x.
 */
public class SpecialArrayWithElementsGreaterThanOrEqualX {

  /**
   * Returns the index of the first element in the sorted array that is greater than or equal to the
   * target.
   *
   * @param nums The sorted array of integers.
   * @param target The target value to find.
   * @return The index of the first element that is greater than or equal to the target.
   */
  private int lowerBound(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

  /**
   * Returns the smallest integer x such that there are exactly x elements in the array that are
   * greater than or equal to x.
   *
   * @param nums The array of integers.
   * @return The smallest integer x that satisfies the condition, or -1 if no such integer exists.
   */
  public int specialArray(int[] nums) {
    int minValue = 0;
    int maxValue = nums[nums.length - 1];
    while (minValue <= maxValue) {
      int mid = minValue + (maxValue - minValue) / 2;
      int idx = lowerBound(nums, mid);
      if (nums.length - idx == mid) {
        return mid;
      } else if (nums.length - idx > mid) {
        minValue = mid + 1;
      } else {
        maxValue = mid - 1;
      }
    }

    return -1;
  }
}
