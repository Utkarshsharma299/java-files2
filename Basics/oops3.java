public class oops3 {
    public static void main(String args[]){
        calc c=new calc();
        System.out.println(c.Sum(10,2));
        System.out.println(c.Sum((float)2.4,(float)3.5));
        System.out.println(c.Sum(1,2,3));
Deer d1=new Deer();
d1.eats();
    }
}
class calc{
    int Sum(int a,int b){
        return a+b;
    }
    float Sum(float a,float b){
        return (float) a+b;
    }
    int Sum(int a,int b,int c){
        return a+b+c;
    }
}
            //method overriding
      class Animal{
        void eats(){
            System.out.println("eats anything");
        }

      } 
      class Deer extends Animal{
        void eats(){
            System.out.println("eats grass");
        }
      }     
