package Test_01;

import java.util.Scanner;

public class DivsibleFiveNumber {
    public static void main(String[] args) {

        /*
        WRITE A PROGRAM TO PRINT A NUMBER  ENTERED BY USER
        which are not by 5 or divisible by 5

         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        //1 way
    String s= num%5==0? "num is divisible by 5 ":"num is not divisble by 5";
        System.out.println(s);
        System.out.println();
        //2 way
        if(num%5==0){
            System.out.println(num+" divisble by ");
        }else {
            System.out.println(num+ " not divisble by ");
        }
// 3 way
        System.out.println(num%5==0? "num is divisible by 5 ":"num is not divisble by 5");

    }



}
