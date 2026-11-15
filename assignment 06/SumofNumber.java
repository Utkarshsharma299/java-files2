public class SumofNumber {
    public static void print(int matrix[][]){
         int sum=0;
        for(int i=1;i<matrix.length-1;i++){
            for(int j=0;j<matrix[1].length;j++){
                        sum+=matrix[i][j];
            }
        }
        System.out.print("Sum is :"+ sum);

    }
    public static void main(String args[]){
        int matrix[][]={{1,4,9},
                        {11,4,3},
                    {2,2,3}};
                    print(matrix);
    }
    
}
