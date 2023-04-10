package python.Collections.Map_C;

import java.util.*;

public class map {
    public static void main(String[] args) {

        Map<Integer,String> m=new Hashtable<>();
        m.put(1,"mayank");
        m.put(2,"Nitin");
        m.put(3,"arpit");
        System.out.println(m);

        Set<Integer> keys=m.keySet();
        for(Integer key:keys){
            System.out.println( key +"  "+m.get(key));
        }


        //Map entry
        Set<Map.Entry<Integer,String>> values=m.entrySet();
        // Entry method in
        for (Map.Entry<Integer,String> e:values){
            System.out.println(e.getKey()+"  "+e.getValue());

        }


    }
}
