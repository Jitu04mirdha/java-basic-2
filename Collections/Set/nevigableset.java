package python.Collections.Set;

import java.util.NavigableSet;

import java.util.TreeSet;

public class nevigableset {
    public static void main(String[] args) {
        NavigableSet<Integer> ns=new TreeSet<>();

        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        //get a reverse view of navigable set

        NavigableSet<Integer> reverse = ns.descendingSet();
        System.out.println( reverse);
        System.out.println(ns);

        NavigableSet<Integer> threeormore=ns.tailSet(3,true);
        System.out.println(threeormore);
        System.out.println("lower(3): " + ns.lower(3));     //this is used to print the greatest element lower then the provided one
        System.out.println("floor(3): " + ns.floor(3));     //this is used to print the greatest element in this set less than or equal to given
        System.out.println("higher(3): " + ns.higher(3));   // return the least element in the given set less then or equal to the given element
        System.out.println("ceiling(3): " + ns.ceiling(3)); //return the least element greater then or equal to the given element

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);
        //pool first is used to remove first element one by one

        System.out.println(ns.pollLast());
        System.out.println(ns);
        // this will remove the last element from the set one by one

        System.out.println("removing element" +ns.remove(3));
        System.out.println(ns);

      //  contains()
      //  first()
      //  last()
      //  remove()
      //  pollFirst()
      //  pollLast()

    }
}
