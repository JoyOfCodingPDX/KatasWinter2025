package edu.pdx.cs.joy.mob5;

import com.google.common.annotations.VisibleForTesting;

import java.util.*;

import org.checkerframework.checker.units.qual.Length;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

    
  @VisibleForTesting
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack();
    System.out.println("Answer: " + calculate(args));

    Stack<Integer> a_stack = new Stack<>();
    List<String> operands = new ArrayList<String>();
    operands.add("+");
    operands.add("-");
    operands.add("*");
    operands.add("/"); 
    operands.add("MAX");

    // for loop in the iterates from left to right
    for (int i = 0; i < args.length; i++) {
        // each integer encountered add to stack
        // check to see if integer
        if (args[i].matches("[0-9]*"))
        {
            // push i onto stack
            stack.push(Integer.parseInt(args[i]));
        } else {
            calculate(stack.pop(), stack.pop(), args[i]);
            //System.err.println("ERROR"); 
            //throw new Exception("ERROR");
        } // errors 
        // each operand encountered preform calculate function

    }
  }

  private static int calculate(Integer a, Integer b, String operand)
  {
    switch (operand) {
        case "+":
            return a + b;
            break;
        case "-":
            return a - b;
            break;
        case "+":
            break;
        case "/":
            return a / b;
            break;
        case "MAX":
            return max(a, b); 
            break;
        default:
    }
    return 0;
  }

}
