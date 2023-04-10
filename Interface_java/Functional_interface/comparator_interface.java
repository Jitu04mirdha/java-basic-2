package python.Interface_java.Functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollno;
    String name,address;

    public Student(int rollno,String name,String address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student>{

    public int compare(Student a,Student b){

        // return 1 to swap and -1 will no swap
        return a.rollno - b.rollno;

    }
}
class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {
      //  return a.toString().length()-b.toString().length();
        return a.name.compareTo(b.name);
    }
}
//comparator is an interface basically used to compare or sort elements based on are own made logic

public class comparator_interface {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));



//here collection is a class
        for (int i=0;i<ar.size();i++) {

            //here sort took two argument one is the array or anything that you need compare and the
            //another is the object of comparator
            Collections.sort(ar, new Sortbyroll());

            //alternative
           // ar.sort(new Sortbyroll());
            System.out.println(ar.get(i));
        }

        System.out.println(


        );

        for (int i=0;i<ar.size();i++) {
            Collections.sort(ar, new Sortbyname());

            //alternative
            // ar.sort(new Sortbyroll());
            System.out.println(ar.get(i));
        }

    }
}
