package test_02;

import java.util.Scanner;

public class AbsoluteNumIfElse {
    /*
        type java code by using if else statement
        write a program to print absolute value of a number entered by user
         */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter a integer");

        int num= scanner.nextInt();

        if(num>=0){
            System.out.println(num+" is absolute ");
        }else{
            System.out.println(Math.abs(num) + " is non absolute");
        }

    }
}
