import java.util.Arrays;

public class Board{
  //Variables
  int width;
  char[][] board;
  //Constructors
  public Board(int width) {
        this.width = width;
        this.board = new char[width][width];
  }

  void fillBoard(){
    int a=0;
    for (char[] v:board){
      for (int i=0; i<width;i+=2){


        v[i+a%2]='O';
        v[i+1-a%2]='*';
      }
      a++;
    }
  }
  void printBoard(){
    for (char[] v : board){
      for (char c : v) {
        System.out.printf(Character.toString(c)+" ");
      }
      System.out.println("");
    }
  }
  //TODO: void draw();
  public static void main(String[] args) {
    Board x = new Board(8);
    x.fillBoard();
    x.printBoard();
  }
}
