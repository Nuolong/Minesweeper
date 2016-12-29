import java.util.Scanner;

public class MinesweeperTest{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.println("How many rows would you like in your game? ");
    int r = kb.nextInt();
    System.out.println("How many mines would you like? ");
    int m = kb.nextInt();
    
    if((r * r) <= m){
      System.out.println("You specified too many mines! You can't win!");
      //return SOMETHING I DON'T KNOW WHAT TO PUT HERE TO STOP EVERYTHING, I FORGOT. IS IT BREAK?
    }
    
    Minesweeper arr = new Minesweeper(r,m);
    System.out.println("Enter the row coordinate of the spot you would like to choose:");
    int q = kb.nextInt();
    System.out.println("Enter the column coordinate of the spot you would like to choose:");
    int w = kb.nextInt();
    
    if(arr.isMine(q,w) == true){
      System.out.println("Game over! You have selected a mine! ;w;");
      //return SOMETHING I DON'T KNOW WHAT TO PUT HERE TO STOP EVERYTHING, I FORGOT. IS IT BREAK?
    }
    else{
    }
    
  }
}
