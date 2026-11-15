public class oops2{
    public static void main(String args[]){
  Dog shark=new Dog();
shark.eat();
shark.legs=4;
System.out.println(shark.legs);
    }

}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");

    }
    void Brethe(){
        System.out.println("breathes");

    }

}
//dervied class
// class Fish extends Animal{
//     int fins;
//     void swim() {
//         System.out.println("swim");
//     }
// }
class Mammels extends Animal{
void walks(){
    System.out.print("walks");
}
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");

    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }

}
