package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.hamcrest.Matchers.*;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;


public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();

  }

  @Test
  void canGetInstanceOfLegClass() {
    Leg l = new Leg("CS510", 0,5,10);
    assertThat(l.getStartTime(), equalTo(0));
  }
  @Test
  void canCreateListOfLegs() {
    Leg l = new Leg("CS510", 0,5,10);
    Leg l2 = new Leg("CANT100", 5,45,110);
    ArrayList<Leg> legs = new ArrayList<Leg>();
    legs.add(l);
    legs.add(l2);
    assertThat(legs.get(1).getStartTime(), equalTo(5));
  }

  @Test
  void canFindAValidCombination() {
    Leg l = new Leg("CS510", 0,5,10);
    Leg l2 = new Leg("CANT100", 5,45,110);
    Leg l3 = new Leg("PDX3", 7,3,15);
    Leg l4 = new Leg("DS10", 10,9,68);
    ArrayList<Leg> legs = new ArrayList<Leg>();
    legs.add(l);
    legs.add(l2);
    legs.add(l3);
    legs.add(l4);
    ArrayList<String> answer = new ArrayList<>();
    answer = Leg.getMaxProfit(legs);
    System.out.println(answer);
  }
  /*
  Steps to complete program:
  We have a list of legs!
  1. Check if a leg is possible to add (use a "tracking" temp leg)
  2. Add two legs and check using the end_time
  3. compare pricing to find best route
   */

}
