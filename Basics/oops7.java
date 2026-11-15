public class oops7 {
  public static void main(String args[]){
Horse h=new Horse();
  }  
}
class Animal{
    Animal(){
        System.out.println("construtor is called");

    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor is csllled");
    }
}
