package python.Interface_java.Markar;

import java.io.*;


class A implements Serializable{
    int i;
    String s;

    // A class constructor
    public A(int i,String s){
        this.i=i;
        this.s=s;
    }

}


public class Serializable_interface {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        A a=new A(20,"Jitender");
        // Serializing 'a'
        File f=new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);


        //to get the data back


        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        A b=(A)ois.readObject();//down-casting object


        System.out.println(b.i+" "+b.s);

        oos.close();
        ois.close();


    }
}