package com.lib;

/**
 * Interface for a cache that supports get and put operations.
 */
public interface Cache {

  /**
   * Gets the value of the key if the key exists in the cache, otherwise returns -1.
   *
   * @param key The key to get the value for.
   * @return The value of the key if it exists in the cache, otherwise -1.
   */
  public int get(int key);

  /**
   * Puts the key and value into the cache. If the cache is at capacity, it should evict the least
   * recently used item before inserting a new item.
   *
   * @param key The key to insert into the cache.
   * @param value The value to insert into the cache.
   */
  public void put(int key, int value);
}
