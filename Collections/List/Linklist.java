package python.Collections.List;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        //Appending new elements in the linklist
        for(int i=0;i<5;i++) ll.add(i);

        // Printing elements
        System.out.println(ll);

        // Remove element at index 3
        ll.remove(3);

        // Displaying the List
        // after deletion
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
