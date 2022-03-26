package ControlFlowStatment;

public class StringDemo {

   /* public static void main(String[] args) {
        String[] array = new String[20];
        System.out.println("enter the string");
        Scanner s1 = new Scanner(System. in);

        for(int i=1;i<=4;i++)
        {
          //  array[i]= s1.nextLine();
        }
    }*/

   public static void main(String[] args) {
       String s="aaabbccdeaa";
       String s1="a3b2c2d1e1a2";

       //int k=0,c=1;
       for(int i=1;i<s.length();i++){
           if(i==s.length()-1)
           {
               System.out.print(" "+s);

               System.out.println();
           }

           if(i== s.length()-1)
               System.out.print(" "+s1);

           System.out.println();

       }

   }
}