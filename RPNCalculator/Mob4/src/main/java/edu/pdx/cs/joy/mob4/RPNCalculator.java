package edu.pdx.cs.joy.mob4;

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
    Stack<String> stack = new Stack<>();

    for (String currArg : args) {
      if (currArg.equals("+")) {
        int var1 = Integer.parseInt(stack.pop());
        int var2 = Integer.parseInt(stack.pop());
        int result = var1 + var2;
        stack.push(Integer.toString(result));
      }
      else if (currArg.equals("-")) {

      }
      else {
        stack.push(currArg);
      }

    }

  }
}