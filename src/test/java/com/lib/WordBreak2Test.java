package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.lib.WordBreak2;

public class WordBreak2Test {

  private WordBreak2 solution;

  @BeforeEach
  public void setUp() {
    this.solution = new WordBreak2();
  }

  @Test
  public void testExampleI() {
    List<String> wordDict = new ArrayList<>(List.of("cat", "cats", "and", "sand", "dog"));
    List<String> expected = new ArrayList<>(List.of("cat sand dog", "cats and dog"));
    List<String> actual = this.solution.wordBreak("catsanddog", wordDict);
    Collections.sort(expected);
    Collections.sort(actual);
    assertEquals(expected, actual);
  }

  @Test
  public void testExampleII() {
    List<String> wordDict =
        new ArrayList<>(List.of("apple", "pen", "applepen", "pine", "pineapple"));
    List<String> expected = new ArrayList<>(
        List.of("pine apple pen apple", "pineapple pen apple", "pine applepen apple"));
    List<String> actual = this.solution.wordBreak("pineapplepenapple", wordDict);
    Collections.sort(expected);
    Collections.sort(actual);
    assertEquals(expected, actual);
  }

  @Test
  public void testExampleIII() {
    List<String> wordDict = new ArrayList<>(List.of("cats", "dog", "sand", "and", "cat"));
    List<String> expected = new ArrayList<>();
    List<String> actual = this.solution.wordBreak("catsandog", wordDict);
    Collections.sort(expected);
    Collections.sort(actual);
    assertEquals(expected, actual);
  }
}
