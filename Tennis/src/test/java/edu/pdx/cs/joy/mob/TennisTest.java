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

  private void playerTwoScores( int scores) {
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
    tennis.playerTwoScores();
    assertThat(tennis.getScore(), equalTo("Love-Fifteen"));
  }

  @Test
  void bothPlayersAtDeuce() {
    playerOneScores(3);
    playerTwoScores(3);
    assertThat(tennis.getScore(), equalTo("Deuce"));
  }

  @Test
  void playerOneHadAdvantage() {
    playerOneScores(4);
    playerTwoScores( 3);
    assertThat(tennis.getScore(), equalTo("Advantage: Player One"));
}



  @Test
  void bothPlayersAtDeuceFourFour() {
    playerOneScores(4);
    playerTwoScores( 4);
    assertThat(tennis.getScore(), equalTo("Deuce"));

  }

}
