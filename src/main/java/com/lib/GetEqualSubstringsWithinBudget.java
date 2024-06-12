package com.lib;

/**
 * Class to solve the problem of finding the longest substring of equal characters within a given
 * budget.
 */
public class GetEqualSubstringsWithinBudget {

  /**
   * Finds the longest substring of equal characters within a given budget.
   *
   * @param s The input string.
   * @param t The target string.
   * @param maxCost The maximum cost allowed.
   * @return The length of the longest substring of equal characters within the given budget.
   */
  public int equalSubstring(String s, String t, int maxCost) {
    if (s.length() != t.length()) {
      throw new IllegalArgumentException("s and t must have the same length");
    }

    int output = 0;
    for (int slow = -1, fast = 0; fast < s.length(); fast++) {
      maxCost -= Math.abs(s.charAt(fast) - t.charAt(fast));
      while (maxCost < 0) {
        maxCost += Math.abs(s.charAt(++slow) - t.charAt(slow));
      }
      output = Math.max(output, fast - slow);
    }

    return output;
  }
}
