package com.lib;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class to solve the problem of replacing words in a sentence with the shortest root word from a
 * given dictionary.
 */
public class ReplaceWords {

  /**
   * Replaces the words in the given sentence with the shortest root word from the dictionary.
   *
   * @param dictionary The list of root words.
   * @param sentence The sentence to replace the words in.
   * @return The sentence with the words replaced with the shortest root word from the dictionary.
   */
  public String replaceWords(List<String> dictionary, String sentence) {
    Set<String> dict = new HashSet<>(dictionary);
    StringBuilder sb = new StringBuilder();
    Trie trie = new Trie();
    for (String word : dict) {
      trie.insert(word);
    }

    for (String word : sentence.split(" ")) {
      sb.append(trie.search(word)).append(" ");
    }

    return sb.toString().trim();
  }
}
