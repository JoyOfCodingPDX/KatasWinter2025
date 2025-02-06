package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void canInstantiateNonEmptyKataClass() {
    new Lags(1, 2, 3);
  }

  @Test
  void canMakeArrayOfLags() {
    List<Lags> lagsList = new ArrayList<>();
    lagsList.add(new Lags(1, 2, 3));
  }

  @Test
  void canCheckForConflictingLags() {

    Lags lag1 = new Lags(1, 2, 3);
    Lags lag2 = new Lags(4, 5, 2);

    //True for no overlap
    assertEquals(true, lag1.checkForConflict(lag2));
  }

  @Test
  void canCheckForConflictingLags2() {

    Lags lag1 = new Lags(0, 5, 10);
    Lags lag2 = new Lags(3, 7, 14);
    Lags lag3 = new Lags(5, 9, 7);
    Lags lag4 = new Lags(6, 9, 8);
    //True for no overlap
    assertEquals(false, lag1.checkForConflict(lag2));
    assertEquals(false, lag1.checkForConflict(lag3));
    assertEquals(true, lag1.checkForConflict(lag4));
  }


}
