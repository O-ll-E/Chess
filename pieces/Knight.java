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
    this.type = Type.KNIGHT;
  }
  public Knight(int x, int y){
    super(x, y);
    this.type = Type.KNIGHT;
  }

  public boolean isValidMove(Position newPos){
    int xdif=Math.abs(newPos.getPosx()-position.getPosx());
    int ydif=Math.abs(newPos.getPosy()-position.getPosy());
    if (xdif==2||ydif==2) {
      return (xdif==1||ydif==1);
    }
    return false;
  }
}
