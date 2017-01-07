import java.util.Scanner;

public class MinesweeperTest{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to Minesweeper!\n In this game, you must select all spaces without a mine to win\nGood Luck!");
    System.out.println("How many rows would you like in your game? ");
    int r = kb.nextInt();
    System.out.println("How many mines would you like? ");
    int m = kb.nextInt();
    
    if((r * r) <= m){   //If there are more mines than the amount of spaces allowed, then the game stops
      System.out.println("You specified too many mines! You can't win!");
      return;
    }
    Minesweeper arr = new Minesweeper(r,m);
    while(true){  
      arr.printArray();
      System.out.println("Enter the row coordinate of the spot you would like to choose:");
      int q = kb.nextInt()-1;
      System.out.println("Enter the column coordinate of the spot you would like to choose:");
      int w = kb.nextInt()-1;
      System.out.println("What would you like to do?\n1 - Select\n2 - Flag\n3 - Unsure");
      int s = kb.nextInt();
      
      if(s == 1){
        if(arr.isMine(q,w) == true){     //If the player selects a mine, then the game ends.
          arr.printArray();
          System.out.println("Game over! You have selected a mine! ;w;");
          break;
        } 
      }
      else if(s == 2){       //sets a flag
        arr.setFlag(q,w);
      }
      else if(s == 3){
        arr.setUnsure(q,w);
      }
      if(arr.isFinished()){    //if the player manages to find all the white spaces(spaces with no mines) the the game ends.
        arr.printArray();
        System.out.println("Yay, you finished the game!!");
        break;
      }
    }
  }
}
