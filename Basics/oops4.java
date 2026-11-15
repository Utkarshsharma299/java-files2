public class oops4{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c=new Chicken();
        c.eat();
        c.walk();

    }
}
abstract class Animal{
    String color;
    Animal(){
color="brown";
    }
    void eat(){
        System.out.println("eats");

    }
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.print("walks on four days");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color="darkblack";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}