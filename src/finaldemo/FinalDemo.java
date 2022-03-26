package finaldemo;
/**
 final keyword->
     1. final variable :- you cannot reassign value to variable.
     2. final class :-  you can not inherit the class.
     3. final methods :- you can not override the method in a child class.
 */
public final class FinalDemo
{
    final int i; //constant

    final  String direction1 ="SHOW";
    final  float pi=3.432f;

    public  FinalDemo()
    {
        i=9;
    }
    public  void  show()
    {
        System.out.println(i);
    }
    public  static  void main(String[] args){
        FinalDemo obj= new FinalDemo();
        obj.show();

        //StaticDemo.show();
    }
}

