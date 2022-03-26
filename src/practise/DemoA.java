package practise;

public class DemoA implements  DemoC,DemoB
{
    public  void add(int i,int j)
    {
        System.out.println(i+j);
    }
      public  void  show()
      {
          System.out.println("in show");
      }

      public  static  void main(String[]args){
          DemoA obj=new DemoA();
          obj.add(3,8);
      }
}
