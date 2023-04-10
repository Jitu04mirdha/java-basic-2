package python.Keywords;

class C{
     final int a=0;
    // If we declare this as final we can't make changes in it :
    // for Final or Constant we basically use Capital letters
    final int DAY;

     public C(){
     // a=20;    // when declared final it won't allow as to make changes
     DAY=40;
    }
}

final class D{
    // If we don't won't Inheritance we create are class final
    final void show(){
        //if we declare are method as final overriding is not possible
    }
}



public class Final {
    public static void main(String[] args) {
        C obj =new C();
        System.out.println(obj.a);
    }
}
