package com.lib;

/**
 * Class to solve the problem of finding the number of combinations that make up a given amount
 * using a set of coins.
 */
public class CoinChange2 {

  /**
   * Finds the number of combinations that make up the given amount using the given coins.
   *
   * @param amount The amount to make up.
   * @param coins The set of coins available.
   * @return The number of combinations that make up the given amount using the given coins.
   */
  public int change(int amount, int[] coins) {
    int[] dp = new int[amount + 1];
    dp[0] = 1;

    for (int coin : coins) {
      for (int i = coin; i <= amount; i++) {
        dp[i] += dp[i - coin];
      }
    }

    return dp[amount];
  }
}
