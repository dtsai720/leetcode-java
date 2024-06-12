package com.lib;

/**
 * Class to solve the problem of finding the number of possible attendance records for a student.
 */
public class StudentAttendanceRecord2 {

  final int mod = 1000000007;
  final int maxAbsents = 2;
  final int maxLate = 3;

  /**
   * Finds the number of possible attendance records for a student.
   *
   * @param n The number of days.
   * @return The number of possible attendance records for a student.
   */
  public int checkRecord(int n) {
    int[][][] dp = new int[n + 1][2][3];
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 3; k++) {
          dp[i][j][k] = 0;
        }
      }
    }

    dp[0][0][0] = 1;

    for (int i = 0; i < n; i++) {
      for (int absent = 0; absent < this.maxAbsents; absent++) {
        for (int late = 0; late < this.maxLate; late++) {
          dp[i + 1][absent][0] = (dp[i + 1][absent][0] + dp[i][absent][late]) % this.mod;

          if (absent < 1) {
            dp[i + 1][absent + 1][0] = (dp[i + 1][absent + 1][0] + dp[i][absent][late]) % this.mod;
          }

          if (late < 2) {
            dp[i + 1][absent][late + 1] =
                (dp[i + 1][absent][late + 1] + dp[i][absent][late]) % this.mod;
          }
        }
      }
    }

    int output = 0;
    for (int absent = 0; absent < this.maxAbsents; absent++) {
      for (int late = 0; late < this.maxLate; late++) {
        output = (output + dp[n][absent][late]) % this.mod;
      }
    }

    return output;
  }
}
