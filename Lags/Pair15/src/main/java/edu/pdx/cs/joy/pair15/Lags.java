package edu.pdx.cs.joy.pair15;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.google.common.primitives.Ints.max;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length <1 ){
      System.err.println("Missing command line arguments");}

    class Bid{
      String name;
      Integer start;
      Integer end;
      Integer value;

      public Bid(String name, Integer start, Integer end, Integer value) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.value = value;
      }
    }

      class Result {
        Integer value;
        Integer end;

        public Result(Integer value, Integer end) {
          this.value = value;
          this.end = end;
        }
      }

    ArrayList<Bid> bids = new ArrayList<Bid>();

    Stack<Result> solutionQueue = new Stack<>();

    Integer end = 0;

    // name start end $$
    for (int i = 0; i < args.length; i += 4){
      bids.add(new Bid(
              args[i],
              Integer.valueOf(args[i]+1),
              Integer.valueOf(args[i]+2),
              Integer.valueOf(args[i]+3)
      ));
      end = max(Integer.valueOf(args[i+2]), end);
    }

    Integer time = 0;

    while (time < end) {
      for (Bid b : bids) {
        if (b.end == time) {
          if (solutionQueue.empty()) {
            solutionQueue.push(new Result(b.value, b.end));
            continue;
          }
          Result top = solutionQueue.peek();
          if (b.start >= top.end) {
            solutionQueue.push(new Result(b.value + top.value, b.end));
            continue;
          }

        }
      }

    }

  }
}

