package Test_01;

import java.util.Scanner;

public class RepeattedLetterss {
    public static void main(String[] args) {
        /*
        ask user for a stringg and print a new string made of 3 copies of the string
        the string lenthth will be at least 2.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string ");

        String name = scanner.next();
        String str= name.substring(name.length()-2);
            for(int i=01 ; i<=3 ; i++){
                System.out.print(str+" ");
            }
        }


    }

