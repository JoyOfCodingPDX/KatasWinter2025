package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

public class Diamond {

<<<<<<< HEAD
  @VisibleForTesting
  public static void main(String[] args) {
    return;
  }

  public static String space(int b, int m, char last){

    StringBuilder output = new StringBuilder();
    output.append(" ".repeat(Math.max(0, b)));
    output.append(last);
    output.append(" ".repeat(Math.max(0, m)));
    if (m > 0){
      output.append(last);
    }
    return output.toString();
  }
  public static void print_dimond(char l) {
    int dist = l - 'A';
    int m = 0;

    for (char c = 'A'; c <= l; c++) {
      System.out.println(space(dist, m, c));
      m +=2;
      dist -= 1;
    }
    dist = 1;
    m -=4;
    for (char c = (char)(l - 1); c >= 'A'; c--) {
      System.out.println(space(dist, m, c));
      m -= 2;
      dist += 1;
    }
  }



}
=======
    @VisibleForTesting
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Missing command line arguments");
            return;
        }
        if (args.length > 1) {
            System.err.println("Too many arguments. Please provide a single letter.");
            return;
        }

        char inputChar = args[0].toUpperCase().charAt(0);

        if (!Character.isLetter(inputChar)) {
            System.err.println("Invalid input: Please enter a letter from A to Z");
            return;
        }

        printDiamond(inputChar);
    }

    public static void printDiamond(char letter) {
        int difference = letter - 'A';
        int currentChar = 'A';

        // Top half of the diamond
        for (int i = 0; i <= difference; i++) {
            String startPadding = " ".repeat(difference - i);
            String innerPadding = (i == 0) ? "" : " ".repeat(i * 2 - 1);
            String target = (i == 0) 
                ? startPadding + (char) currentChar 
                : startPadding + (char) currentChar + innerPadding + (char) currentChar;

            System.out.println(target);
            currentChar++;
        }

        // Bottom half of the diamond
        currentChar--;
        for (int i = difference - 1; i >= 0; i--) {
            currentChar--;
            String startPadding = " ".repeat(difference - i);
            String innerPadding = (i == 0) ? "" : " ".repeat(i * 2 - 1);
            String target = (i == 0) 
                ? startPadding + (char) currentChar 
                : startPadding + (char) currentChar + innerPadding + (char) currentChar;

            System.out.println(target);
        }
    }
}
>>>>>>> 0c844f3 (Implemented diamond)
