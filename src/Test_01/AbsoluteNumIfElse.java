package Test_01;

import java.util.Scanner;

public class AbsoluteNumIfElse {
    public static void main(String[] args) {
        /*
        type java code by using if else statement
        write a program to print absolute value of a number entered by user
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a integer");

        int num= scanner.nextInt();

        if(num>=0){
            System.out.println("this num absolute ");


            System.out.println(num);
        }else{
          int result=  Math.abs(num);
            System.out.println( " this number non absolute "+result);
        }

    }
}
