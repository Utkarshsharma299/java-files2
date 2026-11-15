import java.util.*;

public class LengthPairs {
    public static void main(String args[]){
        int A[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(A,Comparator.comparingDouble(o->o[1]));
    int chenLength=1;
    int lastEnd=A[0][1];
    for(int i=1;i<A.length;i++){
        if(A[i][0]>lastEnd){
            chenLength++;
            lastEnd=A[i][1];
        }
    }
    System.out.println("max Length of chain = "+chenLength);
    }
}
