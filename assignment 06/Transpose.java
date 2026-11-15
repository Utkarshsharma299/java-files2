public class Transpose {
    public static void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int row=2,column=3;
        int matrix[][]={{1,2,3},
                        {4,5,6}};
                        print(matrix);
                int [][] transpose=new int[column][row];
                for(int i=0;i<row;i++){
                    for(int j=0;j<column;j++){
                        transpose[j][i]=matrix[i][j];
                    }
                }
                 print(transpose); 
    }
    
}
