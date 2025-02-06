package edu.pdx.cs.joy.pair16;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

   static class Companies {
    int start;
    int duration;
    int pay;

    public Companies(int start, int duration, int pay){
      this.start = start;
      this.duration = duration;
      this.pay = pay;
    }

    int getStart(){
      return start;
    }

    int getDuration(){
      return duration;
    }

    int getPay(){
      return pay;
    }

    int endTime(){
      return start + duration;
    }

  }

  @VisibleForTesting
  public static void main(String[] args) {
    //System.err.println("Missing command line arguments");
    int maxPay = 0;
    ArrayList<Companies> listOfCompanies= new ArrayList<Companies>();
    listOfCompanies.add(new Companies(0, 5, 10));
    listOfCompanies.add(new Companies(3, 7, 14));
    listOfCompanies.add(new Companies(5, 9, 7));
    listOfCompanies.add(new Companies(6, 9, 8));

    for (Companies companies : listOfCompanies) {

    }



  }
}