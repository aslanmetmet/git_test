package Test_01;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        /*
        ask user to enter two number show them menu of oparaion sign and ask them
        to choose one "Addition : 1 ,Subraction :2 Multiplication :3 division :4 print the result on the console
        example input num1 23 nm255 output result 78
         */
        Scanner scanner= new Scanner(System.in);
        System.out.printf("enter num1");
        int num1= scanner.nextInt();
        System.out.printf("enter num2");
        int num2 =scanner.nextInt();
        System.out.printf("Please choose the operation \n1 Adiition \n2 subraction \n3 Multiplication \n4 Division");
        int ope= scanner.nextInt();

        if(ope==1){
            System.out.printf("Result " +(num1+num2));
        }else if(ope==2){
            System.out.printf("Result " +(num1-num2));
        }else if(ope==3){
            System.out.printf("Result " +(num1*num2));
        }else{
            System.out.printf("Result " +(num1/num2));
        }
        System.out.printf("");
        switch (ope){
            case 1:
                System.out.printf("Result " +(num1+num2));
                break;
            case 2:
                System.out.printf("Result " +(num1-num2));
                break;
            case 3:
                System.out.printf("Result " +(num1*num2));
                break;
            case 4:
                System.out.printf("Result " +(num1/num2));
                break;
            default:
                break;

        }
    }
}
