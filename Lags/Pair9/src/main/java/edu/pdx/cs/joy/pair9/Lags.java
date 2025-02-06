package edu.pdx.cs.joy.pair9;

import java.util.Comparator;
import java.util.List;

import com.google.common.annotations.VisibleForTesting;


class FlightRequest {
  String id;
  int start;
  int end;
  int price;

  public FlightRequest(String id, int start, int duration, int price) {
      this.id = id;
      this.start = start;
      this.end = start + duration;
      this.price = price;
  }
}

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int findMaxProfit(List<FlightRequest> requests) {
    // Step 1: Sort requests based on end time
    requests.sort(Comparator.comparingInt(f -> f.end));
    
    int n = requests.size();
    int[] dp = new int[n]; // dp[i] stores max profit up to i-th request
    
    dp[0] = requests.get(0).price;
    
    for (int i = 1; i < n; i++) {
        // Include current request
        int includeProfit = requests.get(i).price;
        int latestNonConflicting = binarySearch(requests, i);
        if (latestNonConflicting != -1) {
            includeProfit += dp[latestNonConflicting];
        }
        
        // Exclude current request (profit remains same as previous)
        int excludeProfit = dp[i - 1];
        
        // Store max profit at this step
        dp[i] = Math.max(includeProfit, excludeProfit);
    }
    
    return dp[n - 1]; // Max profit is stored in the last index
}

  private int binarySearch(List<FlightRequest> requests, int index) {
      int low = 0, high = index - 1;
      while (low <= high) {
          int mid = (low + high) / 2;
          if (requests.get(mid).end <= requests.get(index).start) {
              if (requests.get(mid + 1).end <= requests.get(index).start) {
                  low = mid + 1;
              } else {
                  return mid;
              }
          } else {
              high = mid - 1;
          }
      }
      return -1;
  }
}