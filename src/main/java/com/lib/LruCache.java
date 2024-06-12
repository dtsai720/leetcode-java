package com.lib;

import java.util.HashMap;

/**
 * Class to implement a Least Recently Used (LRU) cache.
 */
public class LruCache implements Cache {
  private int capacity;
  private HashMap<Integer, DoubleLinkedListNode> cache;
  DoubleLinkedListNode head;
  DoubleLinkedListNode tail;

  /**
   * Constructor for the LRUCache class.
   *
   * @param capacity The capacity of the cache.
   */
  public LruCache(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>();
    this.head = new DoubleLinkedListNode(-1, -1);
    this.tail = new DoubleLinkedListNode(-1, -1);
    this.head.next = this.tail;
    this.tail.prev = this.head;
  }

  /**
   * Removes the given node from the linked list.
   *
   * @param node The node to remove.
   */
  private void removeNode(DoubleLinkedListNode node) {
    DoubleLinkedListNode prev = node.prev;
    DoubleLinkedListNode next = node.next;
    prev.next = next;
    next.prev = prev;
  }

  /**
   * Adds the given node to the end of the linked list.
   *
   * @param node The node to add.
   */
  private void addNode(DoubleLinkedListNode node) {
    DoubleLinkedListNode prev = this.tail.prev;
    prev.next = node;
    node.prev = prev;
    node.next = this.tail;
    this.tail.prev = node;
  }

  @Override
  public int get(int key) {
    if (!this.cache.containsKey(key)) {
      return -1;
    }

    DoubleLinkedListNode node = this.cache.get(key);
    this.removeNode(node);
    this.addNode(node);
    return node.value;
  }

  @Override
  public void put(int key, int value) {
    if (this.cache.containsKey(key)) {
      DoubleLinkedListNode node = this.cache.get(key);
      this.removeNode(node);
    } else if (this.cache.size() == this.capacity) {
      DoubleLinkedListNode node = this.head.next;
      this.removeNode(node);
      this.cache.remove(node.key);
    }

    DoubleLinkedListNode node = new DoubleLinkedListNode(key, value);
    this.cache.put(key, node);
    this.addNode(node);
  }
}
