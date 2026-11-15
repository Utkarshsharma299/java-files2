public class Sudoko {
    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        for(int i=0;i<=8;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }
        for(int j=0;j>=8;j++){
            if(sudoko[row][j]==digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }






    public static boolean sudokoSolver(int sudoko[][],int row,int col){
        if(row==9&&col==0){
            return true;
        }
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoko[row][col]!=0){
            return sudokoSolver(sudoko, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoko,row,col,digit)){
                    sudoko[row][col]=digit;
                if(sudokoSolver(sudoko, nextRow, nextCol)){
                    return true;

                }
                sudoko[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoko(int sudoko[][]){
        for(int i=0;i<9;i++){
          for(int j=0;j<9;j++){
            System.out.print(sudoko[i][j]+" ");
          }  
          System.out.println();
        }
    }
    public static void main(String args[]){
        int sudoko[][]={{}}

        if(sudokoSolver(sudoko,0,0)){
            System.out.print("solution is exist");
            printSudoko(sudoko);
        }else{
            System.out.println("sOLUTION DOES NOT EXIST");
        }
    }
}
