package Test_01;

import java.util.Locale;
import java.util.Scanner;

public class chooseLetter {
    public static void main(String[] args) {
        /*
        ask user to choose of letter :A;B;C;
        if they chose A, print :java is easy
        if they choose B, print :java is fun
        if they choose C, print :Ineed study

         */
        Scanner scanner= new Scanner(System.in);
        System.out.printf("enter a char ");

        char letter =scanner.next().toUpperCase().charAt(0);

        switch (letter){
            case 'A':
                System.out.printf("java is easy ");
                break;
            case 'B':
                System.out.printf("java is fun ");
                break;
            case 'C':
                System.out.printf("I need study ");
                break;
            default:
                System.out.printf("");


        }

    }
}
