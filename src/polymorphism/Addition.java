package polymorphism;

public class Addition
{
    //method overloading

    /**
     -  same class we have same method name with different number of arguments.

  // advantages:-
     -   it increases readability of the program.
     */
    public int add(int a, int b) {
        return a + b;
    }

    public float  add(float a, int b )
    {
        return a + b;
    }

    public static void main(String[] arg)
    {
        Addition obj= new Addition();
        System.out.println(obj.add(5,7));
        System. out.println(obj.add(3f,5));
    }
}