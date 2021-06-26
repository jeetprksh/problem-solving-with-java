package com.jeetprksh.problemsolving.allsubsets;

/**
 * Based on the solution provided on https://www.youtube.com/watch?v=bGC2fNALbNU
 */
public class AllSubsets {

  public void findSubsets(int[] actualArray) {
    int[] subset = initialArray(actualArray.length);
    helper(actualArray, subset, 0);
  }

  private void helper(int[] actualArray, int[] subset, int index) {
    if (index == actualArray.length) {
      printSet(subset);
    } else {
      subset[index] = -1;
      helper(actualArray, subset, index + 1);
      subset[index] = actualArray[index];
      helper(actualArray, subset, index + 1);
    }

  }

  private void printSet(int[] subset) {
    for (int elem : subset) {
      if (elem >= 0) {
        System.out.print(elem + " ");
      }
    }
    System.out.println();
  }

  private int[] initialArray(int size) {
    int[] array = new int[size];
    for (int i : array) {
      i = -1;
    }
    return array;
  }
}
