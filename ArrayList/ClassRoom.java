import java.util.*;
public class ClassRoom{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.add(1,9);
        System.out.println(list);
        //get element
        int element=
        list.get(2);
        System.out.println(element);
        //Delete
        // list.remove(2);
        // System.out.println(list);
        ///set
        list.set(2,10);
        System.out.println(list);
        System.out.println(list.contains(1));
    }
}