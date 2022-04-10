package anonymousnnerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

//        Add add = (a,b)->a+b; {

        Add  add=new Add(){

            public int addition(int a, int b) {
                return a + b;
            }
        };
        System.out.println(add.addition(1,6));
    }
}
  interface Add {
    int addition(int a,int b);

 }