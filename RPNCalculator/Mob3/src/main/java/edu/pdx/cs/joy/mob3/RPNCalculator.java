package edu.pdx.cs.joy.mob3;

import java.util.Stack;

import com.google.common.annotations.VisibleForTesting;

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
    double val1 = 0, val2 = 0;
    for(int i = 0; i < expression.length; i++) {
      switch(expression[i]) {
        case "MAX":
          break;
        case "+":
          if(stack.isEmpty()) {
            throw new IllegalArgumentException("stack empty");
          }
          val1 = stack.pop();
          if(stack.isEmpty()) {
            throw new IllegalArgumentException("stack empty");
          }
          val2 = stack.pop();
          stack.push(val1 + val2);
          break;
        case "-":
          if(stack.isEmpty()) {
            throw new IllegalArgumentException("stack empty");
          }
         val1 = stack.pop();
          if(stack.isEmpty()) {
            throw new IllegalArgumentException("stack empty");
          }
          val2 = stack.pop();
          stack.push(val2 - val1);
          break;
        case "*":
          if(stack.isEmpty()){
            throw new IllegalArgumentException("stack empty");
          }
          val1=stack.pop();
          if(stack.isEmpty()){
            throw new IllegalArgumentException("stack empty");
          }
          val2=stack.pop();
          stack.push(val1 * val2);
          break;

        case "/":
          if(stack.isEmpty()){
            throw new IllegalArgumentException("stack empty");
          }
          val1=stack.pop();
          if(stack.isEmpty()){
            throw new IllegalArgumentException("stack empty");
          }
          val2=stack.pop();
          if (val1 == 0){
            throw new RuntimeException("Divide by zero exception");
          }
          stack.push(val2 / val1);
          break;
        default:
          stack.push(Double.parseDouble(expression[i]));
      }
    }

    if (stack.size() == 0) {
      throw new IllegalArgumentException("stack empty");
    }
    if (stack.size() > 1){
      throw new RuntimeException("Parse is runned with no operators");
    }
    return stack.pop();
  }

  @VisibleForTesting
  public static double parseOperators(String parse){
    if (parse.length() == 0){
      return 0;
    }

    String[] data = parse.split(" ");
    //String[] operators = {"+", "-", "*", "/"};
    return evaluateRPN(data);
  }
}