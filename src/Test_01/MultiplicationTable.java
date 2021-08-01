package Test_01;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        get a number less than 10 from the user and craate a multiplication tale
        input 4  1 2 3 4
                 2 4 6 8
                 3 6 9 12
                 4 8 12 16
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");

        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print(i * j + " ");

            }
            System.out.println();


        }


    }
    }

