package python.Interface_java.Markar;

//coping are if three type notes are down the code


class AB implements Cloneable{
    int i;
    String j;

    // A class constructor

    public AB(int i,String j) {
        this.i=i;
        this.j=j;
    }

    @Override
    public String toString() {
        return "AB{" + "i=" + i + ", j='" + j + '\'' + '}';
    }

    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
   }

    //Overriding clone() method
    //by simply calling Object class
    // clone() method

}



public class Cloneable_interface {
    public static void main(String[] args)  throws CloneNotSupportedException{
     AB l=new AB(20,"mayank");
     AB p=(AB)l.Clone();

        System.out.println(l);
        System.out.println(p);
    }
}


/*
suppose we have a class
class A{
int i;
int j;
}

and now when we create object of class A
A obj =new A();
obj.i=5;
obj.j=9;

creating a new object (obj1) and default value of its variable is by default is zero
A obj1=new A();
so if we want to copy the value of object obj we can do this
A obj1=obj;

({THIS IS KNOWN AS SHALLOW COPY })
 */

//({NEXT COME THE DEEP COPY BY TYPING VALUE FOR INDIVIDUAL OBJECT LIKE WE USUALLY DO})

/*
//({ THIRD CLONING )}//

A obj =new A();
obj.i=4;
obj.j=7;

A.obj1=obj.clone();
this is combination of shallow and deep

 */