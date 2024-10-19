package com.csc;

public class TriangleNumberCalculator {
  
  /*
   * This function returns the nth triangular number
   * @param n, int, nth triangular number
   * @return, returns the value of the nth triangular number
   */
  public int value(int n) {
    if (n == 0) {
        return 0;
    }
    return n + value(n - 1);
}

  /*
   * This function adds two nth triangular numbers
   * @param n, first nth triangular number
   * @param m, second nth triangular number
   * @return, sum of triangular numbers
   */
  public int add(int n, int m) {
    return (value(n) + value(m));
  }

    /*
   * This function subtracts two nth triangular numbers
   * @param n, first nth triangular number
   * @param m, second nth triangular number
   * @return, difference of triangular numbers
   */
  public int subtract(int n, int m) {
    return (value(n) - value(m));
  }
}


