package chess.pieces;
import chess.utility.*;

public abstract class Pieces{
//-------------Variables----------------
  int score;
  //  TODO: add score for all Pieces
  int moveCount = 0;
  Position position;
  Type type;
  //Type,Player,...

  /**
   * Constructor of the Piece class
   * @param pos     Position of the Piece
   * or
   * @param x     x-position of the Piece
   * @param y     y-position of the Piece
  */
  public Pieces(Position pos){
    position = pos;
  }
  public Pieces(int x, int y){
    position = new Position(x,y);
  }


//--------------Getters&Setters---------------

  /**
   * Sets the Position of a Piece to input value
   * @param x     new x-position of the Piece
   * @param y     new y-position of the Piece
  */
  public void setPos(int x, int y){
    position.setPosx(x);
    position.setPosy(y);
  }

  /**
   * Gets the Position of a Piece
   * @return position  Position of the Piece is returned
  */
  public Position getPos(){
    return position;
  }

  /**
   * Gets the Position of a Piece
   * @return position  Position of the Piece is returned
  */
  public Type getType(){
    return type;
  }

  /**
   * Gets the moveCount of a Piece
   * @return moveCount  moveCount of a Piece is returned
  */
  public int getMoveCount(){
    return moveCount;
  }
//--------------------Methods------------------------

  /**
   * Checks if the selected move is legal or not
   * @param newPos     new Position of the Piece
   * @return true/false     if true: the move is valid
   *                        if false: the move is not valid
  */
  abstract public boolean isValidMove(Position newPos);

  /**
   * If the new Position can be reached through a valid move this move is performed
   * @param new     new Position of the Piece
  */
  public void move(Position newPos){
    if(isValidMove(newPos)){
      this.position = newPos;
    }
    else{
      System.out.println("Invalid Move");
    }
    moveCount++;
  }
  //Movement,Capturing,...

}
