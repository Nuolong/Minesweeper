public class Minesweeper{
  private int[][] arrans; //array with answers
  private int[][] arrresult //array with input
  
  public Minsweeper(int s; int m){
    arrans = new int[s][s];
    int a = 0;
    while(a < m){ //WHILE LOOP FOR MINES ADDED TO FIELD
      for(int r = 0; r < arrans.length; r++){
        for(int c = 0; c < arr.length[r]; c++){
          if((int)Math.random() + 1 == 1 ){
            arrans[r][c] = -1;  //x is a mine
            a++; //INCREMENT TO END THE WHILE LOOP WHEN MINE QUANTITY IS FULFILLED
          }
          else{
            arrans[r][c] = 0; // means there is no mine
          }
        }
      }
    }
    for(int k = 0; k < arrans.length; k++){
      for(int j = 0; j < arrans.length; j++){
        if (arrans[k][j] == -1){
          if(arrans[k][j + 1] == 0){
            arrans[k][j + 1] += 1;
          }
          if(arrans[k][j- 1] == 0){
            arrans[k][j - 1] += 1;
          }
          if(arrans[k - 1][j] == 0){
            arrans[k - 1][j] += 1;
          }
          if(arrans[k + 1][j] == 0){
            arrans[k + 1][j] += 1;
          }
          if(arrans[k + 1][j + 1] == 0){
            arrans[k + 1][j + 1] += 1;
          }
          if(arrans[k - 1][ j+1 ] == 0){
            arrans[k - 1][ j+1 ] += 1;
          }
          if(arrans[k - 1][j - 1] == 0){
            arrans[k - 1][j - 1] += 1;
          }
          if(arrans[k + 1][j - 1] == 0){
            arrans[k + 1][j - 1] += 1;
          }
        }
      }
    }
  }
  public boolean isMine(int q, int w){
    if (arrans[q][w] == 1){
      arrresult[q][w] == 1;
      return true;
    }
    arrresult = arrans;
    return false;
  }
  
  public String toString(){}
  
}
