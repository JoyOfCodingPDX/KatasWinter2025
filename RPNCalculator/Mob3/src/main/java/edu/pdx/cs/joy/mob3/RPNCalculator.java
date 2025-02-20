package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  @VisibleForTesting
  public static double evaluateRPN(String expression) {
    Stack<Double> stack = new Stack<>();
    String[] tokens = expression.split(" ");


    if (stack.size() != 1) {

    }
    return stack.pop();
  }

  @VisibleForTesting
  public static int parseOperators(String parse){
    String[] data = parse.split(" ");
    String[] operators = {"+", "-", "*", "/"};

    int cur = 0;
    for (; cur < data.length; cur++){

    }

    return 0;
  }
}