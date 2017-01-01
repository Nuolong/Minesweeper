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
      return;
    }
    
    Minesweeper arr = new Minesweeper(r,m);
    System.out.println("Enter the row coordinate of the spot you would like to choose:");
    int q = kb.nextInt();
    System.out.println("Enter the column coordinate of the spot you would like to choose:");
    int w = kb.nextInt();
    System.out.println("What would you like to do?\n1 - Select\n2 - Flag\n3 - Unsure");
    int s = kb.nextInt();
    
    if(s == 1){
    if(arr.isMine(q,w) == true){
      System.out.println("Game over! You have selected a mine! ;w;");
      return;
      }
    if(){}  
    }
    else if(s == 2){
    //*******//
    }
    else if(s == 3){
    //*******//
    }
  }
}
