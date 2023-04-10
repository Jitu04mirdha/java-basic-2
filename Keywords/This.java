package python.Keywords;

public class This {
public String name;      //this is an instance variable
private int age;          //this is an instance variable

    public String getName() {
        return name;
    }

    public void setName(String n) {     // the n variable is a local variable :
        name = n;
    }

    public int getAge() {
        return age;
    }

   // public void setAge(int age) {
   //     age = age;          // In this the compilor is confused whether the age variable
                              // is instance variable or a local variable .
   // }

   // public void setAge(int age) {  //try
   //     This l=new This();                //still not working because as we are creaating
                                            //a new object so the value is assigned to the new object not to the original one .
   //     l.age=age;
   // }


    //  public void setAge(int age,This p) {
    //    This age1=p;
    //  age1.age=age;         //INternally this is happening inside below setAge method
    //}
    public void setAge(int age) {
    this.age=age;          //this keyword basically represent the current object :
    }



        public static void main(String[] args) {




        This p=new This();
      //  p.setAge(30,p);
        p.setAge(30);
        p.setName("Reddy");
        System.out.println(p.getName()+"  "+p.getAge());


    }
}
