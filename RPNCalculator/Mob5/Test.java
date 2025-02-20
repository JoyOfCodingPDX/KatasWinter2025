import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test {
    public Test() {

    }


    public static void main(String[] args) {
        List<String> expression = Arrays.asList(args);
        for (String arg: expression)
            System.out.println(arg);

        Stack<Integer> a_stack = new Stack<>();
        List<String> operands = new ArrayList<String>();
        operands.add("+");
        operands.add("-");
        operands.add("*");
        operands.add("/"); 
        operands.add("MAX");

        for (String arg: args) {
            //if (operands.contains(arg)) {
                switch (arg) {
                    case "*":
                        
                        break;
                    case "/":
                        break;
                    case "+":
                        break;
                    case "-":
                        break;
                    case "MAX":
                        break;
                    default:
                }
            //}
        }
    
    }
}
