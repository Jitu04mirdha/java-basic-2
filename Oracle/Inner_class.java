package python.Oracle;

public  class  Inner_class {
    static class Inner{
        public  static void show(){
            System.out.println("hello is Inner Class");
        }
    }


    public static void main(String[] args) {
        Inner_class.Inner.show();
    }
}
