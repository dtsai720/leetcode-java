package com.lib_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import com.lib.ReplaceWords;

public class ReplaceWordsTest {

  private ReplaceWords solution;

  @BeforeEach
  public void setUp() {
    this.solution = new ReplaceWords();
  }

  @Test
  public void testExample1() {
    List<String> dictionary = Arrays.asList("cat", "bat", "rat");
    String sentence = "the cattle was rattled by the battery";
    String expected = "the cat was rat by the bat";
    String result = this.solution.replaceWords(dictionary, sentence);
    assertEquals(expected, result);
  }

  @Test
  public void testExample2() {
    List<String> dictionary = Arrays.asList("a", "b", "c");
    String sentence = "aadsfasf absbs bbab cadsfafs";
    String expected = "a a b c";
    String result = this.solution.replaceWords(dictionary, sentence);
    assertEquals(expected, result);
  }
}
