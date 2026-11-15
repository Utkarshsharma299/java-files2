import java.util.*;
public class DiffercePairs{
    public static void main(String args[]){
        int A[]={2,1,3};
        int B[]={3,1,2};
        Arrays.sort(A);
        Arrays.sort(B);
      int   minDifference=0;

        for(int i=0;i<A.length;i++){
            minDifference+=Math.abs(A[i]-B[i]);

        }
        System.out.println("minDifference= " + minDifference);
    }
}