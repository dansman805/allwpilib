package com.dansman805.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class CollectionUtil {
  private CollectionUtil() {

  }

  /**
   * Returns a set made from its parameters.
   */
  public static <T> Set<T> setOf(T... items) {
    HashSet<T> result = new HashSet<T>();

    for (T item : items) {
      result.add(item);
    }

    return result;
  }

  /**
   * Returns a set made from its parameters.
   */
  public static <T> List<T> listOf(T... items) {
    ArrayList<T> result = new ArrayList<T>();

    for (T item : items) {
      result.add(item);
    }

    return result;
  }
}
