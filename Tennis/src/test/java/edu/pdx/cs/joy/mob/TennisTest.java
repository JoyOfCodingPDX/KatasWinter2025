package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest
{

  @Test
  void initiallyScoreIsLoveLove() {
    Tennis tennis = new Tennis();
    assertThat(tennis.getScore(), equalTo("Love-Love"));
  }

  @Test
  void playerOneScoresOnce() {
    Tennis tennis = new Tennis();
    tennis.playerOneScores();
    assertThat(tennis.getScore(), equalTo("Fifteen-Love"));
  }

  @Test
  void playerTwoScoresOnce() {
    Tennis tennis = new Tennis();
    tennis.playerTwoScores();
    assertThat(tennis.getScore(), equalTo("Love-Fifteen"));
  }

}
