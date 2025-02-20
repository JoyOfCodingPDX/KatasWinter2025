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
    Double result = 0.0;
    Double var1 = 0.0;
    Double var2 = 0.0;
    for (String currArg : args) {
      if (currArg.equals("+")) {
        var1 = Double.parseDouble(stack.pop());
        var2 = Double.parseDouble(stack.pop());
        result = var1 + var2;
        stack.push(Double.toString(result));
      }
      else if (currArg.equals("-")) {
        var1 = Double.parseDouble(stack.pop());
        var2 = Double.parseDouble(stack.pop());
        result = var2 - var1;
        stack.push(Double.toString(result));
      }
      else if (currArg.equals("*")) {
        var1 = Double.parseDouble(stack.pop());
        var2 = Double.parseDouble(stack.pop());
        result = var2 * var1;
        stack.push(Double.toString(result));
      }
      else if (currArg.equals("/")) {
        var1 = Double.parseDouble(stack.pop());
        var2 = Double.parseDouble(stack.pop());
        result = var2 / var1;
        stack.push(Double.toString(result));
      } else if (currArg.equals("SQRT")) {
        var1 = Double.parseDouble(stack.pop());
        result = Math.sqrt(var1);
        stack.push(Double.toString(result));
      } else if(currArg.equals("MAX")){
        double maxValue = 0.0;
        for(int i=0;i< stack.size();i++){
          var1 = Double.parseDouble(stack.pop());
          if(var1 > maxValue){
            maxValue = var1;
          }
        }
        result = maxValue;
        stack.push(Double.toString(result));
      }
      else {
        stack.push(currArg);
      }
    }
    System.out.println(result);

  }
}