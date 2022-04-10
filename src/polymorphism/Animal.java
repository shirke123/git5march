package polymorphism;
  //method overriding
/**
   - two class have same method name and same parameter this called method overriding.
 */
public class Animal
{
    public void sound()
    {
        System.out.println(" Inheritance sound");
    }

}
class Dog extends  Animal
{
   public void  sound()
   {
       System.out.println(" dog is sound");
    }
    public static void main(String[]args)
    {
        Dog obj=new Dog();
        obj.sound();
    }
}
  class Cat extends  Dog{

    public  void sound()
    {
        System.out.println("cat is sound");
    }
    public  static  void main(String[]args)
    {
        Cat obj=new Cat();
        obj.sound();
    }
}
