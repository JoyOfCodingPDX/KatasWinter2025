package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {
  private Stack<String> input;

  public RPNCalculator(Stack<String> s) {
    this.input = s;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int calculate() {
    int result = 0;

    int num1 = 0;
    int num2 = 0;

    while (input.size() > 0) {
      
      
    }

    return 0;
  }

  public int add(int x, int y) {
    return x + y;
  }
}