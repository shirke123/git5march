package staticdemo;

public class Outer {
    int i = 90;


    public void show() {
        System.out.println("in show");

    }

    private static class Inner {
        public Inner() {
        }

        int i = 70;
    }
    public  static void main(String[] args){
        Outer outer =new Outer();
        System.out.println(outer.i);

        //Outer.Inner inner= Outer.new Inner(); // non -static inner class
       // System.out.println(inner.i);


        Outer.Inner inner=new Outer.Inner(); //for static inner class
        System.out.println(inner.i);

    }
}