public class Minesweeper{
//-------------------------------------------------------//
  private int[][] arrans; //array with answers
  private String[][] arrresult; //array with input
  private int mines;
//-------------------------------------------------------//  
  public Minesweeper(int s, int m){
    mines = m;
    arrans = new int[s][s];
    arrresult = new String[s][s];
    int a = 0;
    while(a < m){ //WHILE LOOP FOR MINES ADDED TO FIELD
      int x = (int) (Math.random() * s);
      int y = (int) (Math.random() * s);
          if (arrans[x][y] != -1) 
            {arrans[x][y] = -1;}
          if (x > 0 && y > 0){arrans[x-1][y-1] += 1;}
          if (x > 0){arrans[x-1][y] += 1;}
          if (x > 0 && y < arrans[0].length - 1){arrans[x-1][y+1] += 1;}
          if (y > 0){arrans[x][y-1] += 1;}
          if (y < arrans[0].length - 1){arrans[x][y+1] += 1;}
          if (x < arrans.length - 1 && y > 0){arrans[x+1][y-1] += 1;}
          if (x < arrans.length - 1){arrans[x+1][y] += 1;}
          if (x < arrans.length - 1 && y < arrans.length - 1){arrans[x+1][y+1] += 1;}
          a++;
      }
    }
    for(int z=0; z<arrresult.length; z++){
      for(int b=0; b<arrresult.length;b++){
        arrresult[z][b]="-";
      }
    }
  }     
//-------------------------------------------------------//        
  public boolean isMine(int q, int w){
    if (arrans[q][w] == -1){
      return true;
    }
    else{
      clearSpot(q, w);
      return false;
    }
  }
public void clearSpot(int x, int y) {
  if (arrans[x][y] != 0) {
    arrresult[x][y] = Integer.toString(arrans[x][y]);
  } 
  else if (arrresult[x][y].equals("-")) {
     arrresult[x][y] = Integer.toString(arrans[x][y]);
     if (x > 0 && y > 0){clearSpot(x-1, y-1);}
     if (x > 0){clearSpot(x-1, y);}
     if (x > 0 && y < arrans[0].length - 1){clearSpot(x-1, y+1);}
     if (y > 0){clearSpot(x, y-1);}
     if (y < arrans[0].length - 1){clearSpot(x, y+1);}
     if (x < arrans.length - 1 && y > 0){clearSpot(x+1, y-1);}
     if (x < arrans.length - 1){clearSpot(x+1, y);}
     if (x < arrans.length - 1 && y < arrans.length - 1){clearSpot(x+1, y+1);}
     }
   }  
  
  public void printArray(){         
    for(int k=0; k< arrresult.length; k++){
      System.out.println("");
      for(int j=0; j< arrresult.length; j++){
          System.out.print(" " + arrresult[k][j]+ " ");
      }
    }
  }
  
  public void setFlag(int q, int w){
    arrresult[q][w] = "!";
  }
  
  public void setUnsure(int q, int w){
    arrresult[q][w]= "?";
  }
  
  public boolean isFinished(){
    int check = 0;
    for(int k = 0; k < arrresult.length; k++){
      for(int j = 0; j < arrresult.length; j++){
        if(arrresult[k][j] == "!" && arrans[k][j] == -1){
          check++;
        }else if(arrresult[k][j] == "-" && arrans[k][j] == -1){
          check++;
        }else{
          return false;
        }
      }
    }
    return check == mines;
  }
}
