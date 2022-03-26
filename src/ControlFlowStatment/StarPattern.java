package ControlFlowStatment;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {


        /**
         *
         * *
         * * *
         * * * *
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        /**
         * * * *
         * * * *
         * * * *
         * * * *
         */
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        /**
         1
         2 3
         4 5 6
         7 8 9 10
         */
        System.out.println();

        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" " + count++);
            }
            System.out.println();
        }
        /**
         1 2 3 4
         5 6 7
         8 9
         10
         */
        System.out.println();

        count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("  " + count++);
            }
            System.out.println();
        }

        /**
         1
         2    3
         4   5    6
         7   8   9  10
         */
        System.out.println();

        count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("  " + count++);
            }
            System.out.println();
        }
        /**
         16 15 14 13
         12 11 10 9
         8  7  6  5
         4  3  2  1
         */

        System.out.println();

        count = 16;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (count < 10) {
                    System.out.print(" 0" + count--);
                } else
                    System.out.print(" " + count--);
            }
            System.out.println();
        }


        /**
         1
         1 2
         1 2 3
         1 2 3 4
         */
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /**
         16  15  14 13
         12          9
         8           5
         4   3   2   1
         */
        System.out.println();

        count = 16;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 2 && j == 2 || (i == 2 && j == 3) || (i == 3 && j == 2) || (i == 3 && j == 3)) {
                    System.out.print("   ");
                    count--;
                } else {
                    if (count < 10) {
                        System.out.print(" 0" + count--);
                    } else System.out.print(" " + count--);
                }
            }
            System.out.println();
        }

        /**
         1    2  3  4
         12         5
         11         6
         10   9  8  7
         */

        System.out.println();

       System.out.println("enter of n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][];
        int value = 1;
        int mincol = 0;
        int maxcol = n - 1;
        int minrow = 0;
        int maxrow = n - 1;

        while (value <= n * n) {
            for (int i = minrow + 1; i <= maxcol; i++) {
                arr[minrow][i] = value;
                value++;
            }
            for (int i = minrow + 1; i < maxrow; i++) {
                arr[maxcol][i] = value;
                value++;
            }
            for (int i = maxcol - 1; i >= mincol; i--) {
                arr[maxrow][i] = value;
                value++;

            }
            for (int i = maxrow - 1; i >= minrow + 1; i--) {
                arr[i][mincol] = value;
                value++;

            }
            mincol++;
            maxrow++;
            maxcol--;
            maxrow--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}










        /*count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 2 && j == 2|| i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 3) {
                    System.out.print("   ");
                    count++;
                } else {
                    if (count < 10) {
                        System.out.print(" 0" +count++);
                    } else System.out.print(" " +count++);
                }
            }
            System.out.println();
        }*/

        // string "aaabbccdeaa"
        // a3b2c2d1e1a2





