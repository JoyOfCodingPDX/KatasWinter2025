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
  void canCompareLags(){

    Lags lag1 = new Lags(1, 2, 3);
    Lags lag2 = new Lags(4, 5, 2);

    //True for no overlap
    assertEquals(true, lag1.compareLags(lag2));
  }

}
