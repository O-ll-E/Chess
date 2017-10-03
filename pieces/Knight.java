package chess.pieces;
import chess.utility.*;

public class Knight extends Pieces{

  /**
   * Constructor of the Knight class
   * @param pos     Position of the Knight
   * or
   * @param x     x-position of the Knight
   * @param y     y-position of the Knight
  */
  public Knight(Position pos){
    super(pos);
    setType(Type.KNIGHT);
    setScore(3);
  }
  public Knight(int x, int y){
    super(x, y);
    setType(Type.KNIGHT);
    setScore(3);
  }

  public boolean isValidMove(Position newPos){
    int xdif=Math.abs(newPos.getPosx()-getPos().getPosx());
    int ydif=Math.abs(newPos.getPosy()-getPos().getPosy());
    if (xdif==2||ydif==2) {
      return (xdif==1||ydif==1);
    }
    return false;
  }
}
