package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

    private int startTime;
    private int duration;
    private int price;

    public Lags() {
        this.startTime = 0;
        this.duration = 0;
        this.price = 0;
    }

    public Lags(int startTime, int duration, int price) {
        this.startTime = startTime;
        this.duration = duration;
        this.price = price;
    }

    public boolean compareLags(Lags other) {
        return ((this.startTime + this.duration) < other.startTime);
    }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}