package abstractdemo;

public class Football extends  AbsSports
{
   public void play()
   {
       System.out.println("playing football");
   }
   public  void exercise()
   {
       System.out.println("for a playing exercise");
   }
   public static void  main(String[]args)
   {
       Football obj=new Football();
       obj.play();
       obj.exercise();
   }
}