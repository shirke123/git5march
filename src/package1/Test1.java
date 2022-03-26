package package1;

public class Test1
{
    //instance  variable or Global variable
    protected int i=10;//member variable

    public void show() //member function
    {
        int j=8;//local variable
        System.out.println("in show");
    }

    public  static  void main (String[] args)
    {
        Test1 obj= new Test1();
        System.out.println(" obj.i");
    }
}
/**  access modifier and specifier:-

*  1.private :- it can be accessed within class only.

*  2. default :- it can be accessed within package. it can be more restrictive than protected.

*  3. protected :-it can be accessed within package. outside package through inheritance.

*  4. public :- it can br accessed Whole project.

 */

