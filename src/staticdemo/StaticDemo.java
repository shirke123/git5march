package staticdemo;
 /**
  static- memory management
  */
public class StaticDemo
{
    int id;
    String name;
    static String company="abc";//static variable

    public void show()
    {
        System.out.println(" in show");
    }
    public StaticDemo(int id,String name,String company){
        this.id=id;
        this.name=name;
        this.company=company;

        System.out.println("id=>"+id+"name=>"+name+"Company=>"+company);
    }
    public  static  void main(String[] args)
    {
        StaticDemo obj1=new StaticDemo(1,"raj","abc");
        StaticDemo obj2=new StaticDemo(2,"raj","abc");
        StaticDemo obj3=new StaticDemo(3,"raj","abc");
        // StaticDemo.show();
    }

}
