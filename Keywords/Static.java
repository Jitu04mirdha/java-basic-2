package python.Keywords;

class Emp{
    int id;
    int salary;
    static String ceo="mayank";

    // After static the code will not be specific for a particular  object it is common for all object of class
    //static stay at class loader memory not in the heap memeory ;

    public Emp(){  //this constructor will run when you create object.
        id=45;
        salary=20;
       // ceo="om";  // NOTE : It is advice to declare static items in static block .
        System.out.println("in constructor");
    }

    static {   //when you load a class : and class loads only once
      //  ceo="monali";
        System.out.println("in static block");
    }

   public void show(){
       System.out.println(id+" : "+salary+" : " +ceo+"  ");
   }
}



public class Static {
    public static void main(String[] args) {

        Emp navin=new Emp();
        navin.id=8;
        navin.salary=4000;


        Emp rahul=new Emp();
        rahul.id=4;
        rahul.salary=2000;
        Emp.ceo="nitin";

        navin.show();
        rahul.show();


        //simple means the very last updated data of a static will
        // going to be the final for every object;
        // if we do not mention ceo name then it will use what there in the constructor
        // but if we put mention ceo name for at least one of the object that data will circulate for all.

    }
}


//                                     DOUBT
// why the ceo name in not executed when we declare ceo name in constructor
//why it is giving more preference  to the constructor rather than the static block