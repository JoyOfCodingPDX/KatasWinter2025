package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    String[] requests = {"AF514 0 5 10","CO5 3 7 14","AF515 5 9 7","BA01 6 9 8"};
    String[] bestCombo = lags(requests);
    System.out.println(bestCombo[0]);
  }

    public static String[] lags(String[] requests){
      String[] bestCombo = {};

      for (int i = 0; i < requests.length; i++){
        String[] data = requests[i].split(" ");
        System.out.println(data[0] + data[1] + data[2]);

      }

      return bestCombo;
    }
}