public class Main{
    public static void allOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOccurence(arr, key, i+1);
    }
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int num){
        if(num==0){
            return;

        }
        int lastDigit=num%10;
        printDigits(num/10);
        System.out.print(digits[lastDigit]+" ");

    }
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
    public static void main(String args[]){
String str="abode";
System.out.println(length(str));
    }
}