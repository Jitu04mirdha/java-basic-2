package python.Collections.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<Collection> h=new HashSet<>();
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);
        a2.add(1);
        a2.add(2);
        a2.add(3);

        //HashSet does not store duplicate items,  if you give two Objects that
        // are equal then it stores only the first one, here it is list1.
        System.out.println(a2);
        System.out.println(h);
        h.add(a1);
        h.add(a2);
        System.out.println(h);
        //operations on Hashset
        //1) add()
        //2) remove()
        //3) iterator()
        //4)
        Iterator<Collection> i=h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }

}
