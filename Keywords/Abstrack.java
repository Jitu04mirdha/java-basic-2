package python.Keywords;

 abstract class car{
     //declaration of a abstract method
     public abstract void drive();


   // public void drive(){
        // we create method which is needed for the car
        //but by the time we don't know the implementation
        //so we keep it empty :
        //At this stage we need abstract keyword:
   // }

    // NOTE abstract class can only have the abstract method :
    // we can't make a object of Abstract class
    // It will be compulsory for the extending class to have th abstract method of that abstract class

    public void playMusic(){
        System.out.println("play music");
    }
}

 class Maruti extends car{
    @Override
    public void drive() {
        System.out.println("driving");
    }

    @Override
    public void playMusic() {
        System.out.println("music");
    }
}




public class Abstrack {
    public static void main(String[] args) {

        car c=new Maruti();
        car v=new car() {
            @Override        //Anonymous inner class
            public void drive() {
                System.out.println("playing");
            }
        };


    }
}
