package edu.pdx.cs.joy.pair8;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {
  public static  List<Requests> requests = new ArrayList<>();

  @VisibleForTesting
  public static void main(String[] args) {
      Requests testReq = new Requests("Test1", 1, 2,3);
        Requests testReq2 = new Requests("Test2", 4, 3,5);
        requests.add(testReq);
        requests.add(testReq2)


  }


}