package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest
{

  private Tennis tennis;

   @BeforeEach
  void setUp() {
    tennis = new Tennis();
  }

  private void playerOneScores(int scores) {
    for (int i = 0; i < scores; i++) {
      tennis.playerOneScores();
    }
  }

  private static void playerTwoScores(Tennis tennis, int scores) {
    for (int i = 0; i < scores; i++) {
      tennis.playerTwoScores();
    }
  }



  @Test
  void initiallyScoreIsLoveLove() {
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

  @Test
  void bothPlayersAtDeuce() {
    Tennis tennis = new Tennis();
    playerOneScores(3);
    playerTwoScores(tennis, 3);
    assertThat(tennis.getScore(), equalTo("Deuce"));
  }

  @Test
  void playerOneHadAdvantage() {
    Tennis tennis = new Tennis();
    playerOneScores(4);
    playerTwoScores(tennis, 3);
    assertThat(tennis.getScore(), equalTo("Advantage: Player One"));
}



  @Test
  void bothPlayersAtDeuceFourFour() {
    Tennis tennis = new Tennis();
    playerOneScores(4);
    playerTwoScores(tennis, 4);
    assertThat(tennis.getScore(), equalTo("Deuce"));

  }

}
