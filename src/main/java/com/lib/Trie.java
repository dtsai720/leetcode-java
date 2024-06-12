package com.lib;

/**
 * Class to solve the problem of replacing words in a sentence with the shortest root word from a
 * given dictionary.
 */
public class Trie {
  private Trie[] children;
  private boolean isWord;

  /**
   * Constructor for the Trie class.
   */
  public Trie() {
    children = new Trie[26];
    isWord = false;
  }

  /**
   * Inserts a word into the trie.
   *
   * @param word The word to insert.
   */
  public void insert(String word) {
    Trie node = this;
    for (char c : word.toCharArray()) {
      if (node.children[c - 'a'] == null) {
        node.children[c - 'a'] = new Trie();
      }
      node = node.children[c - 'a'];
    }
    node.isWord = true;
  }

  /**
   * Searches for the shortest root word in the trie for the given word.
   *
   * @param word The word to search for.
   * @return The shortest root word for the given word.
   */
  public String search(String word) {
    Trie node = this;
    StringBuilder sb = new StringBuilder();
    for (char c : word.toCharArray()) {
      if (node.children[c - 'a'] == null) {
        return word;
      }
      sb.append(c);
      node = node.children[c - 'a'];
      if (node.isWord) {
        return sb.toString();
      }
    }

    return word;
  }
}
