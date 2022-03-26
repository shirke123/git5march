package operator;

public class Operator {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 3;

       //unary operator
       System.out.println(a++); //post increment
       System.out.println(++a); //pre increment
       System.out.println(--a); //post decrement
       System.out.println(a--); //pre decrement

        System.out.println();

       //Arithmetic operator
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a/b);
       System.out.println(a*b);
       System.out.println(a%b);

        System.out.println();

       //relational operator
       System.out.println(a>b);//true
       System.out.println(a<b);//false
        System.out.println(a<=b);//false
        System.out.println(a>=b);//true

        System.out.println();

        //bitwise operator
        System.out.println(a&b);
        System.out.println(a|b);

        System.out.println();

        System.out.println(a==b);
         if(a>b && a>c){
             System.out.println("a is greater");
         }else if(b>c){
             System.out.println("b is greater");
         }else
         {
             System.out.println("c is greater");
         }

        System.out.println();

        //shift operator
        System.out.println(a<<b); //left shift
        System.out.println(a>>b); // right shift


    }
}
