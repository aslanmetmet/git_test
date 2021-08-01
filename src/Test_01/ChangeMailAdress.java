package Test_01;

import java.util.Scanner;

public class ChangeMailAdress {
    public static void main(String[] args) {
        /*
        ask user uo enter an e mail adress
        then if it cantains  "hotmail " replave it with "gmail "

         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a email adress ");

        String mail = scanner.nextLine();
        //1 way
        System.out.println(  mail.replace("hotmail","gmail"));

        if (mail.contains("hotmail")){
            System.out.println(mail.replace("hotmail","gmail"));

        }else{
            System.out.println("enter correct hotmail adress");
        }

    }
}
