package edu.pdx.cs.joy.mob2;
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Stack.*;
import java.util.*;
import java.lang.Math;
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
    int val1;
    int val2;
    double sqrtResult;
    //int max = 0;
    
    for (int i = 0; i < args.length; i++) {

      try {
        stackElement = Integer.parseInt(args[i]);
        numStack.push(stackElement);
      } catch (NumberFormatException e) {
        operator = args[i];
        switch (operator) {
          case "+":
            val1 = numStack.pop();
            val2 = numStack.pop();
            numStack.push(val1+val2);
            break;

          case "-":
            val1 = numStack.pop();
            val2 = numStack.pop();
            numStack.push(val1-val2);
            break;

          case "*":
            val1 = numStack.pop();
            val2 = numStack.pop();
            numStack.push(val1*val2);
            break;

          case "/":
            val1 = numStack.pop();
            val2 = numStack.pop();
            numStack.push(val2/val1);
            break;

          case "SQRT":
            val1 = numStack.pop();
            sqrtResult = Math.sqrt(val1);
            int result = (int)sqrtResult;
            numStack.push(result);

            /*
          case "MAX":
            int[] nums = {};
            while (max!=0){

            }
             */
        }
      }
    } 
    System.out.println("final resutl: " + numStack.pop());
  }
}