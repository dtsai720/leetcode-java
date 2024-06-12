package com.lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class to solve the problem of breaking a string into all possible sentences using words from a
 * dictionary.
 */
public class WordBreak2 {

  private List<String> output;
  private Set<String> words;
  private Set<Integer> sizes;

  /**
   * Constructor for WordBreak2 class.
   */
  public WordBreak2() {
    this.output = new ArrayList<>();
    this.sizes = new HashSet<>();
  }

  /**
   * Helper method to recursively build all possible sentences from the given string.
   *
   * @param s The string to break into words.
   * @param idx The current index in the string.
   * @param array The list of words formed so far.
   */
  private void helper(String s, int idx, List<String> array) {
    if (idx == s.length()) {
      this.output.add(String.join(" ", array));
      return;
    }

    for (final int size : this.sizes) {
      if (idx + size > s.length()) {
        continue;
      }

      String word = s.substring(idx, idx + size);
      if (this.words.contains(word)) {
        array.add(word);
        this.helper(s, idx + size, array);
        array.remove(array.size() - 1);
      }
    }
  }

  /**
   * Breaks the input string into all possible sentences using the words in the dictionary.
   *
   * @param s The string to break into words.
   * @param wordDict The dictionary of words.
   * @return A list of all possible sentences formed by breaking the string into words from the
   *         dictionary.
   */
  public List<String> wordBreak(String s, List<String> wordDict) {
    this.words = new HashSet<>(wordDict);
    for (String word : wordDict) {
      this.sizes.add(word.length());
    }

    this.helper(s, 0, new ArrayList<>());
    return this.output;
  }
}
