/**
 * This class represents a Connect4 object
 *
 * @author Ivy Tang
 */

import java.util.Scanner;

public class Connect4
{
  /** This is an array of Player objects which represents the players */
  private Player[] players;

  /** Initializes the Player array */
  public Connect4()
  {
    players = new Player[2];
  }

  /**
   * The general logic for this program:
   * This welcomes the player and prints the game board.
   *
   * Then it goes back and forth between the two players while asking
   * them to choose a column to drop their piece.
   *
   * After each move, the board is checked for winning combinations
   * and whether or not the board is full. If it is full, the corresponding
   * tie message is printed.
   */
  public void run()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to not 2, not 3, but 4! Tis Connect4!");
    players[0] = new Player("O");
    players[1] = new Player("@");
    System.out.println("Player 1: " + players[0].getPiece()
            + " Player 2: " + players[1].getPiece());
    System.out.println();
    Board board = new Board(7, 7);
    board.printBoard();
    boolean running = true;
    while (running)
    {
      System.out.print("\nPlayer 1, please choose a column: ");
      int column = scan.nextInt();
      scan.nextLine();
      board.dropPiece(column, players[0]);
      System.out.println();
      board.printBoard();
      if (board.horizontalWin() || board.verticalWin() || board.diagonalWin1() || board.diagonalWin2())
      {
        break;
      }
      if (board.boardFull())
      {
        System.out.println("\nIt's a TIE!");
        break;
      }
      System.out.print("\nPlayer 2, please choose a column: ");
      column = scan.nextInt();
      scan.nextLine();
      board.dropPiece(column, players[1]);
      System.out.println();
      board.printBoard();
      if (board.horizontalWin() || board.verticalWin() || board.diagonalWin1() || board.diagonalWin2())
      {
        break;
      }
      if (board.boardFull())
      {
        System.out.println("It's a TIE!");
        break;
      }
    }
  }
}