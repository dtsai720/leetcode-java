package com.lib;

/**
 * Interface for a cache that supports get and put operations.
 */
class DoubleLinkedListNode {
  int key;
  int value;
  DoubleLinkedListNode prev;
  DoubleLinkedListNode next;

  /**
   * Constructor for a DoubleLinkedListNode.
   *
   * @param key The key of the node.
   * @param value The value of the node.
   */
  public DoubleLinkedListNode(int key, int value) {
    this.key = key;
    this.value = value;
  }
}
