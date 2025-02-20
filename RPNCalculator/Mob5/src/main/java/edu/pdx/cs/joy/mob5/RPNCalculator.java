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

    // for loop in the iterates from left to right
    for (int i = 0; i < args.length; i++) {
        // each integer encountered add to stack
        // check to see if integer
        if (args[i].matches("[0-9]*"))
        {
            // push i onto stack
            stack.push(Integer.parseInt(args[i]));
        }
        else if {} // if operand
        else {} // errors 
        // each operand encountered preform calculate function

    })
  }

  private static int calculate(Integer a, Integer b, String operand)
  {
    // result = a operand b 

    return 0;
  }

}