import java.util.*;
public class add{
    public static void main(String[] args) {
        HashMap<String ,Integer>hm=new HashMap<>();
        hm.put("India",150);
        hm.put("China" ,160);
        hm.put("Usa",50);
        System.out.println(hm);
      int population=  hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Nepal"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("China"));
       System.out.println(hm); 
       System.out.println(hm.size());
       hm.clear();
       System.out.println(hm.isEmpty());
    }
}