package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

    @VisibleForTesting
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("input length should be 1");
        }
        char l = args[0].charAt(0);
        l = Character.toUpperCase(l);
        printDiamond(l);
    }
    public static void printDiamond(char letter) {
        if(letter < 'A' || letter > 'Z') {
            System.err.println("No letter provided.");
        }

        int d = letter - 'A';

        for(int i = 0; i <= d; i++) {
            for(int j = i; j < d; j++) {
                System.out.print(" ");
            }
            System.out.print((char)('A' + i));
            if(i > 0) {
                for(int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }


    }

}