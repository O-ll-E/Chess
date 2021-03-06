package chess.pieces;
import chess.utility.*;

public class Bishop extends Pieces{

  /**
   * Constructor of the Bishop class
   * @param pos     Position of the Bishop
   * or
   * @param x     x-position of the Bishop
   * @param y     y-position of the Bishop
  */
  public Bishop(Position pos){
    super(pos);
    setType(Type.BISHOP);
    setScore(3);
  }
  public Bishop(int x, int y){
    super(x, y);
    setType(Type.BISHOP);
    setScore(3);
  }

  /**
   * Checks if the selected move is legal or not
   * @param newPos     new Position of the Piece
   * @return true/false     if true: the move is valid
   *                        if false: the move is not valid
  */
  public boolean isValidMove(Position newPos){
    int xdif=Math.abs(newPos.getPosx()-getPos().getPosx());
    int ydif=Math.abs(newPos.getPosy()-getPos().getPosy());
    return (xdif == ydif);
  }
}
