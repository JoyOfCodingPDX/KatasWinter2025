package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;

import java.util.List;

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

    public boolean checkForConflict(Lags other) {
        //True if no conflict
        return ((this.startTime + this.duration) < other.startTime);
    }

    public Lags compareLags(List<Lags> lagsList) {
        Integer highestPrice = null;
        for (Lags lags : lagsList) {
            for (Lags otherLags : lagsList) {
                if (lags != otherLags) {
                    if (lags.checkForConflict(otherLags)) {
                        
                    }
                }
            }
        }
    }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}