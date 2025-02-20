package edu.pdx.cs.joy.mob2;
import java.util.Stack;

import com.google.common.annotations.VisibleForTesting;

/*
 * Stack<DataType> stackName = new Stack<>();
   Stack<String> stringStack = new Stack<>();

 */

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
    Stack<Integer> numStack = new Stack<Integer>();
    int stackElement = 0;
    int operatorResult;
    String operator = "";
    for (int i = 0; i < args.length; i++) {
      try {
        stackElement = Integer.parseInt(args[i]);
        numStack.push(stackElement);
      } catch (NumberFormatException e) {
        operator = args[i];
        switch (operator) {
          case '+':
            stack.pop()
        }
      }
    }
  }
}