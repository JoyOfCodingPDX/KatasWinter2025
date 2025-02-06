package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    Lags lag2 = new Lags(3, 5, 2);

  }

}
