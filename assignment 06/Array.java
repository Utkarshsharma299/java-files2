public class Array{
    public static void print(int matrix[][]){
        int countOf7=0;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    countOf7++;
                }
            }
        }
        System.out.print("count of 7 is :"+ countOf7);
    }
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        print(matrix);
    }
    }
