package python.Keywords;



    class A{
        public A() {
            System.out.println("hello man");
        }
        public A(int a){
            System.out.println("In A int");
        }
    }


    class B extends A{
        public B(){
            super(6);
            System.out.println("hello women");
        }
        public B(int a){
            super(a);
            System.out.println("In B int");

        }
    }

public class Super {
    public static void main(String[] args) {
         A obj=new B();

    }
}
//*NOTE
/*
1) when we create object of subclass with no arguments passed then it will call the
   constructor of parent class first and then the subclass constructor

2) when we create constructor of subclass with arguments them it will call the default
   constructor  of parent class first and then the parameterized constructor of
   class whose object is being created  .

3)every subclass constructor by default class the super method
  super() and since we don't mention the parameter in the super() it will call the
  default constructor of the super class .

4)for calling the parameterized constructor of both the class we need to specify the parameter
  of super keyword ex super(i)

5) true, false and null look like keywords, but in actual they are literals.
   However they still can’t be used as identifiers in a program.


 */

