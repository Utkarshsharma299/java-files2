public class  Binary{
    public static int getIthBit(int n,int i){
        int bitMask=1>>i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int ClearIthBit(int n,int i){
        int bitMask=(-1)<<i;
        return n & bitMask;
    }
    public static int clearbits(int n,int i,int j){
        int a=((-1)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
    public static boolean isPowerOff(int n){
        return (n&(n-1))==0;

    }
    public static int bit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;

            }
            n=n>>1;
        }
return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;

            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
System.out.println(clearbits(10, 02,4));
System.out.println(isPowerOff(8));
System.out.println(bit(10));
System.out.println()
    }
}