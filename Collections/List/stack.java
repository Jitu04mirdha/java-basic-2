package python.Collections.List;

public class stack {
    public static void main(String[] args) {

sta num=new sta();
sta.push(15);
sta.push(45);
sta.push(40);



        System.out.println(sta.pop());
        sta.show();
    }

}
class sta{

    static int[] sta =new int[5];
    static int top=0;
    public  static void push(int data) {
       sta[top]=data;
       top++;
    }

    public static int pop() {

        int data;
        top--;
        data=sta[top];
        sta[top]=0;
        return data;

    }

    public static void show() {for (int i:sta) System.out.print (i+" ");}

}