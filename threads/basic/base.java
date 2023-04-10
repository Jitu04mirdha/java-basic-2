package python.threads.basic;
// small unit of a process is known as Thread :
// 1)Every thread need run method to execute :
// 3)To use Thread in your class you need to extend Thread class :
// 4)Since we can't implement multiple inheritance in java so to achieve that instead of using
//   Thread extends we can use Runnable to achieve the same :
public class base extends Thread {
    public  void run(int[] arr){
        int[] value ={3,4,5,6,2,8};
        for(int i:value){
           value[i]=value[i]*2;
        }
    }
    public static void main(String[] args) {
        Thread obj=new base();


        obj.run();
    }

}



