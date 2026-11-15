public class OOPS{

public static void main(String args[]){
    // pen p1=new pen();
    // p1.setColor("Blue");
    // System.out.println(p1.getColor());
    // p1.setTip(5);
    // System.out.println(p1.getTip());
    Student s1= new Student();
    Student s2=new Student("utkarsh");
    Student s3=new Student("123");


    Student S1=new Student();
    S1.name="Utkarsh";
    S1.roll=456;
    S1.password="abcd";



    Student S2=new Student(S1);

S2.password="xyz";

    
}
}

// class pen{
//    private String color;
//    private int tip;
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//    void setColor(String newColor){
//         this.color=newColor;
//     }
//     void setTip(int Tip){
//         this.tip=Tip;
//     }
// }
class Student{
    String name;
    int roll;
    String password;



    
    Student(){
        System.out.println("constructor is called");

    }
    
    Student (String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    Student(Student S1){
        this.name=S1.name;
        this.roll=S1.roll;
    }
}
