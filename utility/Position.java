package chess.utility;

public class Position{
  //Variables
  private int x;
  private int y;
  //Constructors
  public Position(int x, int y){
    this.x = x;
    this.y = y;
  }
  public static Position add(Position pos1, Position pos2){
    return new Position(pos1.getPosx()+pos2.getPosy(), pos2.getPosy()+pos1.getPosy());
  }
  public static Position substract(Position pos1, Position pos2){
    return new Position(pos1.getPosx()-pos2.getPosy(), pos1.getPosy()-pos2.getPosy());
  }
  public int combine(){
    return x+y;
  }
  //Getters&Setters
  public int getPosx(){
    return this.x;
  }
  public int getPosy(){
    return this.y;
  }
  public void setPosx(int newx){
    this.x = newx;
  }
  public void setPosy(int newy){
    this.y = newy;
  }
  //Methods
}
