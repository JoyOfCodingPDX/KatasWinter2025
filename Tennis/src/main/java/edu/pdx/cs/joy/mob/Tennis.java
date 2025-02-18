package edu.pdx.cs.joy.mob;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Tennis {
  int player1Score = 0;
  int player2Score = 0;
  String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty", "Advantage: "};

  public String getScore() {
    //If players have both scored 3 and are equal
    if (player1Score >= 3 && player2Score >= 3) {
      if (player1Score == player2Score) {
        return "Deuce";
      }
    }

    if (player1Score == 4 && player2Score == 3) {
      return scoreNames[player1Score] + "Player One";
    }

    return scoreNames[player1Score] + "-" + scoreNames[player2Score];
  }

  public void playerOneScores() {

    this.player1Score++;
  }
  public void playerTwoScores() {
    this.player2Score++;
  }

}