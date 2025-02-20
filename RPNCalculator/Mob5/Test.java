import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Test {
    public Test() {

    }

    public static void main(String[] args) {
        List<String> expression = Arrays.asList(args);
        for (String arg: expression)
            System.out.println(arg);
    
        String[] operands = new String[]{"+", "-", "*", "/", "MAX"};
    }
}
