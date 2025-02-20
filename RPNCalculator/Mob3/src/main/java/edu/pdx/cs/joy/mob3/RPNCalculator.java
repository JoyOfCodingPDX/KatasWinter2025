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
  public static double evaluateRPN(String[] expression) {
    Stack<Double> stack = new Stack<>();
    for(int i = 0; i < expression.length; i++) {
      switch(expression[i]) {
        case "+":
          if(stack.isEmpty()) {
            throw new IllegalArgumentException("stack empty");
          }
          double val1 = stack.pop();
          if(stack.isEmpty()) {
            throw new IllegalArgumentException("stack empty");
          }
          double val2 = stack.pop();
          stack.push(val1 + val2);
        case "-":break;
        case "*":break;
        case "/":break;
        default:
          stack.push(Double.parseDouble(expression[i]));
      }
    }

    if (stack.size() != 1) {
      throw new IllegalArgumentException("stack empty");
    }
    return stack.pop();
  }

  @VisibleForTesting
  public static double parseOperators(String parse){
    String[] data = parse.split(" ");
    //String[] operators = {"+", "-", "*", "/"};
    return evaluateRPN(data);
  }
}