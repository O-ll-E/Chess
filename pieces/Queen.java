package chess.pieces;
import chess.utility.*;

public class Queen extends Pieces{

  /**
   * Constructor of the Queen class
   * @param pos     Position of the Queen
   * or
   * @param x     x-position of the Queen
   * @param y     y-position of the Queen
  */
  public Queen(Position pos){
    super(pos);
    this.type = Type.QUEEN;
    this.score = 9;
  }
  public Queen(int x, int y){
    super(x, y);
    this.type = Type.QUEEN;
    this.score = 9;
  }

  /**
   * Checks if the selected move is legal or not
   * @param newPos     new Position of the Piece
   * @return true/false     if true: the move is valid
   *                        if false: the move is not valid
  */
  public boolean isValidMove(Position newPos){
    Bishop tempB = new Bishop(position);
    Rook tempR = new Rook(position);
    return (tempR.isValidMove(newPos) || tempB.isValidMove(newPos));
  }
}
