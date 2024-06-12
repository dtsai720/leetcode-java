package com.lib;

/**
 * Class to solve the problem of reducing a number in binary representation to one.
 */
public class NumberOfStepsToReduceNumberInBinaryRepresentationToOne {

  /**
   * Calculates the number of steps to reduce a binary number to one. Each step can be either a
   * binary right shift or a binary addition of one.
   *
   * @param s The binary number represented as a string.
   * @return The number of steps to reduce the binary number to one.
   */
  public int numSteps(String s) {
    int count = 0;
    int carry = 0;
    for (int i = s.length() - 1; i > 0; i--) {
      count++;
      if (s.charAt(i) - '0' + carry == 1) {
        carry = 1;
        count++;
      }
    }

    return count + carry;
  }
}
