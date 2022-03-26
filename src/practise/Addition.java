package practise;

public class Addition
{
    //method overloading //compile time polymorphism
    public int add(int a,int b)
    {
        return  a+b;
    }
    public float sub(float a,int b,int c){
        return  a+b+c;
    }
    public static  void main(String[]args){
        Addition obj=new Addition();
        System.out.println(obj.add(2,4));
        System.out.println(obj.sub(4,6,2));
    }
}
