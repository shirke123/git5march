package interfacedemo;

public class Calculator implements  Operation1,Operation2
{
    public void add(int i, int j)
    {
        System.out.println(i+j);
}


     public  static  void main(String[]args)
{
        Calculator cal=new Calculator();
        cal.add(3,7);
        cal.add(8,4);

}
public  void  add(int i,int j,int k)
{

}

}
