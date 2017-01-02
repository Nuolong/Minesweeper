public class Minesweeper{
//-------------------------------------------------------//
  private int[][] arrans; //array with answers
  private String[][] arrresult; //array with input
//-------------------------------------------------------//  
  public Minesweeper(int s; int m){
    arrans = new int[s][s];
    arrresult = new String[s][s];
    int a = 0;
    while(a < m){ //WHILE LOOP FOR MINES ADDED TO FIELD
      for(int r = 0; r < arrans.length; r++){
        for(int c = 0; c < arr.length[r]; c++){
          if((int)Math.random() + 1 == 1 ){
            arrans[r][c] = -1;  //-1 is a mine
            a++; //INCREMENT TO END THE WHILE LOOP WHEN MINE QUANTITY IS FULFILLED
          }
          else{
            arrans[r][c] = 0; // means there is no mine
          }
        }
      }
    }
//-------------------------------------------------------//    
    for(int k = 0; k < arrans.length; k++){
      for(int j = 0; j < arrans.length[k]; j++){
        if(arrans[k][j] == -1){
          if(k == 0){
            if(j == 0){ //top left corner of the field
              bottomMiddle(k,j);
              bottomRight(k,j);
              middleRight(k,j);
            }
            else if(j != 0 && j != arrans.length - 1){ //the top edge of the field excluding the corners
              middleLeft(k,j);
              middleRight(k,j);
              bottomLeft(k,j);
              bottomMiddle(k,j);
              bottomRight(k,j);
            }
            else if(j == arrans.length - 1){ //top right corner of the field
              middleLeft(k,j);
              bottomLeft(k,j);
              bottomMiddle(k,j);
            }
          }
          else if(j == 0){ 
            if(k == arrans.length - 1){ //bottom left corner of the field
              topMiddle(k,j);
              topRight(k,j);
              middleRight(k,j);
            }
            if(k != 0 && k != arrans.length - 1){ //the left edge of the field excluding the corners
              topMiddle(k,j);
              topRight(k,j);
              middleRight(k,j);
              bottomMiddle(k,j);
              bottomRight(k,j);
            }
          }
          else if(j == arrans.length - 1){
            if(k != 0 && k != arrans.length - 1){ //the right edge of the field excluding the corners
              topMiddle(k,j);
              topLeft(k,j);
              middleLeft(k,j);
              bottomLeft(k,j);
              bottomMiddle(k,j);
            }
            else if(k == arrans.length - 1){ //the bottom right corner of the field
              topMiddle(k,j);
              topLeft(k,j);
              middleLeft(k,j);
            }
          }
          else if(k == arrans.length - 1){
            if(j != 0 && j != arrans.length - 1){ //the bottom edge of the field exclusing the corner
              middleLeft(k,j);
              middleRight(k,j);
              topLeft(k,j);
              topMiddle(k,j);
              topRight(k,j);
            }
          }
          else if(k != 0 && k != arrans.length - 1){
            if(j != 0 && j != arrans.length - 1){
              topLeft(k,j);
              topMiddle(k,j);
              topRight(k,j);
              middleLeft(k,j);
              middleRight(k,j);
              bottomLeft(k,j);
              bottomMiddle(k,j);
              bottomRight(k,j);
            }
          }
        }
      }
    }
    for(int a=0; a<arrresult.length; a++){
      for(int b=0; b<arrresult.length;b++){
        arrresult[a][b]="?";
      }
    }
  }     
//-------------------------------------------------------//        
  public boolean isMine(int q, int w){
    if (arrans[q][w] == -1){
      return true;
    }
    arrresult[q][w] = Interger.toString(arrans[q][w]);
    return false;
  }
//-------------------------------------------------------//
  public void topLeft(int q, int w){
    if(arrans[q - 1][w - 1] != -1){
      arrans[q - 1][w - 1] += 1;
    }
  }
//-------------------------------------------------------//       
  public void topMiddle(int q, int w){
    if(arrans[q - 1][w] != -1){
      arrans[q - 1][w] += 1;
    }
  }
//-------------------------------------------------------//
  public void topRight(int q, int w){
  if(arrans[q - 1][w + 1] != -1){
      arrans[q - 1][w + 1] += 1;
    }
  }
//-------------------------------------------------------//
  public void middleLeft(int q, int w){
  if(arrans[q][w - 1] != -1){
      arrans[q][w - 1] += 1;
    }
  }
//-------------------------------------------------------//
  public void middleRight(int q, int w){
  if(arrans[q][w + 1] != -1){
      arrans[q][w + 1] += 1;
    }
  }
//-------------------------------------------------------//
  public void bottomLeft(int q, int w){
  if(arrans[q + 1][w - 1] != -1){
      arrans[q + 1][w - 1] += 1;
    }
  }
//-------------------------------------------------------//
  public void bottomMiddle(int q, int w){
  if(arrans[q + 1][w] != -1){
      arrans[q + 1][w] += 1;
    }
  }
//-------------------------------------------------------//
  public void bottomRight(int q, int w){
  if(arrans[q + 1][w + 1] != -1){
      arrans[q + 1][w + 1] += 1;
    }
  }
//-------------------------------------------------------//

  
  public String toString(){         
    for(int k=0; k< arrresult.length; k++){
      System.out.println("");
      for(int j=0; j< arrresult.length; j++){
          System.out.print(" " + arrresult[k][j]+ " ")
      }
    }
  }
  
}
