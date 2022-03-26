package practise;

public class Pattern {
    public static void main(String[] args) {
        /** 1)
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        /** 2)
             *
             * *
             * * *
             * * * *
             * * * * *
         */
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        /** 3)
         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5
         */
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
        /** 4)
         1
         2 1
         3 2 1
         4 3 2 1
         5 4 3 2 1
         */
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j =i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /** 5)
          1
          2 3
          4 5 6
          7 8 9 10
          11 12 13 14 15
         */
        System.out.println();
       int count=1;
        for(int i=0;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" "+count);
            }
        }

        /** 6)
             1 2
             1 2 3
             1 2 3
             1 2 3 4
             1 2 3 4 5
             */

            System.out.println();

            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j >= 5; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

            /** 7)
             1 0 1 0 1
             0 1 0 1 0
             1 0 1 0 1
             0 1 0 1 0
             */
            System.out.println();
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print(" 1 0");
                }
                System.out.println();
            }
        /** 8)
          1
          0 1
          1 0 1
          0 1 0 1
          1 0 1 0 1
         */
        System.out.println();

        /** 9)
         *
         ***
         *****
         *******
         *********
         *******
         ******
         *****
         ****
         ***
         *
         */
            System.out.println();
            for (int i = 0; i <= 7 - 1; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println("");
            }
            for (int i = 7 - 1; i >= 0; i--) {
                for (int j = 0; j <= i - 1; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println("");
            }
            System.out.print("*");
        }
    }

