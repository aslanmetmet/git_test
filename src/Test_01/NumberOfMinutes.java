package Test_01;

import java.util.Scanner;

public class NumberOfMinutes {
    public static void main(String[] args) {
        /*
        ask user enter minutes
        write a java program to convert minutes into a number of years and days
        input number of minutes  3456789
        ouput 3456789 minutes is appreximatly 6year and210 day

         */

        Scanner scanner=new Scanner(System.in   ) ;
        System.err.printf("enter a minutes" );

        long min = scanner.nextInt();;

        long year = min/(60*24*360);
        long day =(min/60/24)%365;



        System.out.println(min + " minutes is approximately  "+year+" and " + day+" days");

    }
}
