package practise;

public class Number1To100PEO {
    public static void main(String[] args) {
        int num = 5, count;
        System.out.println("display 1 to 100 prime number");
        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (i = 2; i <= 100 / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
                if (count == 0 && num != 1) {
                    System.out.println(num + "");
                }
        }
        /**
          even number or odd number 1 to 100  display
         */
        int n=100;
        System.out.println("display 1 to 100 even number");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+"");

            }
        }




        }
    }

