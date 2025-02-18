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
  String[] scoreNames = {"Love","Fifteen"};

  public String getScore() {
    return scoreNames[player1Score] + "-" + scoreNames[player2Score];
  }

  public void playerOneScores() {
    this.player1Score++;
  }
  public void playerTwoScores() {
    this.player2Score++;
  }

}