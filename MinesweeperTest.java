import java.util.Scanner;

public class MinesweeperTest{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.println("How many rows would you like in your game? ");
    int r = kb.nextInt();
    System.out.println("How many columns would you like? ");
    int c = kb.nextint();
    Minesweeper arr = new Minesweeper(r,c);
    System.out.println("Pick a position: ");
  }
}