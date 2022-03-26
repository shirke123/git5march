package ControlFlowStatment;

public class IfElseDemo {
    public static void main(String[] args) {
        int age = 19;
        String nationality ="pak";

        //nested if
        if (age > 18) {
            if (nationality=="indian");
            System.out.println(("you can vote"));
           }else {
            System.out.println("not Indian");
//        }else {
//            System.out.println(" you can vote");
//        }
        }
    //ladder if
     int  a=3331,b=203, c=0, d=896;
     if(a>b && a>c && a>d){
        // System.out.println(("A is grater");
    }else if(b>c & b>d){
        System.out.println("B is greater");
     }else if(c>d){
         System.out.println("c is greater");
     }else{
         System.out.println("d is greater");
    }
     int i=0;
//     if(i>=100)
//
//    {
//        System.out.println("i is greater than 100");
//    }else{
//         System.out.println("i is greater than 100");
//    }
     String str=i>=100?"i is greater than 100":"i less than 100";
     System.out.println(str);
}

}

