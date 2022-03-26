package practise;

/**
 * display 1 t0 10 by implementing different loops.
 */
public class Loop1To10 {
    public static void main(String[] args) {

      //for loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println();


        //while loop
        int num=1;
        while (num<=10){
            System.out.println(num);
            num++;

        }
        System.out.println();


        //do-while loop
        int num1=1;
        do {
            System.out.println(num1);
            num1++;
        }while (num1<=10);

        System.out.println();


        // for-each loop
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int number:numbers){
            System.out.println(number);

        }
    }
}
