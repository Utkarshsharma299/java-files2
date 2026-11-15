import java.util.ArrayList;
import java.util.Collections;
public class Sosrting {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(1);

        Collections.sort(list);//ascending
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
