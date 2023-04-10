package python.Collections;

import java.util.Hashtable;
import java.util.Vector;

public class collection_in_java {

    public static void main(String[] args) {

        int arr[] =new int[]{1,2,3,4};
        Vector<Integer> v=new Vector<>();
        Hashtable<Integer,String> h=new Hashtable<>();

        //adding the elements into the
        //vector
        v.addElement(1);
        v.addElement(2);

        //adding the elements into the
        //hashtable
        h.put(1,"jitu");
        h.put(2,"Mirdha");

        //Accessing the first element of the
        //Array, vector and hashtable
        /*
        System.out.println(arr[0]);

        System.out.println(v.elementAt(0)); //same
        System.out.println(v.firstElement());    // same
        System.out.println(v.get(0));            //same

        System.out.println(h.get(1));

         */
        System.out.println(h.values());

    }

}
