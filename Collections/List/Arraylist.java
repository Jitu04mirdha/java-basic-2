package python.Collections.List;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();

        //appending element at the end of list
        for(int i=1;i<=5;i++){
            al.add(i);
        }
        //printing the element
        System.out.println(al);

        //removing the element at index 3
        al.remove(3);

        //displaying the ArrayList after removing the elements
        System.out.println(al);

        //printing the element one by one
        for(int i=0;i<al.size();i++)
            System.out.print(al.get(i)+" ");
    }
}
