public class Minesweeper{
  private int[][] arrans; //array with answers
  private int[][] arrresult //array with input
  
  public Minsweeper(int s; int m){
    arrans=new int[s][m];
    for(int i = 0; i<m; i++){ //for loop for while the number of total mines is less than the number of mines needed
      for(int r=0; r<arr.length; r++){
        for(int c= 0; c< arr.length[r]; c++){
          if((int)Math.random()+1 == 1 ){
            arr[r][c] = 1;  //x is a mine
          }
          else{
            arr[r][c] = 0; // means there is no mine
          }
        }
      }
    }
  }
  public boolean isMine(int q, int w){
    if (arrans[q][w]==1){
      arrresult[q][w]==1;
      return true;
    }
    arrresult=arrans;
    return false;
  }
  
  public String toString(){}
  
}
