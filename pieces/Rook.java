package chess.pieces;
import chess.utility.*;

public class Rook extends Pieces{

  /**
   * Constructor of the Rook class
   * @param pos     Position of the Rook
   * or
   * @param x     x-position of the Rook
   * @param y     y-position of the Rook
  */
  public Rook(Position pos){
    super(pos);
    setType(Type.ROOK);
    setScore(5);
  }
  public Rook(int x, int y){
    super(x, y);
    setType(Type.ROOK);
    setScore(5);
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
    if (xdif==0||ydif==0) {
      return (xdif!=0||ydif!=0);
    }
    return false;
  }
}
