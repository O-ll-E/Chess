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
    this.type = Type.PAWN;
  }
  public Pawn(int x, int y){
    super(x, y);
    this.type = Type.PAWN;
  }
  // TODO: add isValidMove()
}
