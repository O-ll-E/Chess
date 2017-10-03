package chess.pieces;
import chess.utility.*;

public class King extends Pieces{

  /**
   * Constructor of the King class
   * @param pos     Position of the King
   * or
   * @param x     x-position of the King
   * @param y     y-position of the King
  */
  public King(Position pos){
    super(pos);
    setType(Type.KING);
    setScore(300);
  }
  public King(int x, int y){
    super(x, y);
    setType(Type.KING);
    setScore(300);
  }
  public boolean isValidMove(Position newPos){
    int xdif=Math.abs(newPos.getPosx()-getPos().getPosx());
    int ydif=Math.abs(newPos.getPosy()-getPos().getPosy());
    return (xdif==1||ydif==1);
  }
}
