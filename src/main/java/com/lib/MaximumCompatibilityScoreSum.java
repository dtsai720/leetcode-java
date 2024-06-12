package com.lib;

/**
 * Class to solve the problem of finding the maximum compatibility score sum between students and
 * mentors.
 */
public class MaximumCompatibilityScoreSum {

  private int output = 0;
  private boolean[] visited;
  private int[][] dp;

  /**
   * Depth first search to find the maximum compatibility score sum.
   *
   * @param idx The index of the student.
   * @param sum The sum of the compatibility scores.
   */
  private void dfs(int idx, int sum) {
    if (idx == visited.length) {
      output = Math.max(output, sum);
      return;
    }

    for (int i = 0; i < visited.length; i++) {
      if (visited[i]) {
        continue;
      }
      visited[i] = true;
      dfs(idx + 1, sum + dp[idx][i]);
      visited[i] = false;
    }
  }

  /**
   * Finds the maximum compatibility score sum between students and mentors.
   *
   * @param students The compatibility scores of the students.
   * @param mentors The compatibility scores of the mentors.
   * @return The maximum compatibility score sum between students and mentors.
   */
  public int maxCompatibilitySum(int[][] students, int[][] mentors) {
    if (students == null || mentors == null || mentors.length != students.length) {
      throw new IllegalArgumentException("length of students and mentors should be same");
    }

    int n = students.length;
    int m = students[0].length;

    this.visited = new boolean[n];
    this.dp = new int[n][n];

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {
        if (students[x] == null || mentors[y] == null
            || students[x].length != mentors[y].length) {
          throw new IllegalArgumentException(
              "length of students and mentors should be same");
        }

        for (int i = 0; i < m; i++) {
          this.dp[x][y] += students[x][i] == mentors[y][i] ? 1 : 0;
        }
      }
    }
    this.dfs(0, 0);

    return this.output;
  }
}
