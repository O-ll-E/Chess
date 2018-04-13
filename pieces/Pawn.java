package chess.pieces;
import chess.utility.*;

public class Pawn extends Pieces{

  /**
   * Constructor of the Pawn class
   * @param pos     Position of the Pawn
   * or
   * @param x     x-position of the Pawn
   * @param y     y-position of the Pawn
  */
  public Pawn(Position pos){
    super(pos);
    setType(Type.PAWN);
    setScore(1);
  }
  public Pawn(int x, int y){
    super(x, y);
    setType(Type.PAWN);
    setScore(1);
  }

  public boolean isValidMove(Position newPos){
    int ydif = newPos.getPosy()-getPos().getPosy();
    return ydif == -1 || (ydif == -2 && getMoveCount() == 0);
  }
}
