package python.threads.basic;

 class Hi extends Thread{
     public void run(){
         for(int i=1;i<=5;i++){
             System.out.println("Hi");
             try{Thread.sleep(1002); }
             catch (Exception e){ }
         }
     }


 }
class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000); }
            catch (Exception e){ }
        }
    }
}


public class base1 {
    public static void main(String[] args) {

        Hi hi=new Hi();
        Hello obj=new Hello();
       hi.start();
       obj.start();

    }
}
