package Test_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class heatyProblem {
    public static void main(String[] args) {
        /* write a java program that accept name surname weight height
        calculator BMI (body mass index )and print the user status like that
        fohn catpenter is 25 years old  his heigeht is 170,5 cm and his is weight is 80.25 kg he is heatly

         */
        Scanner scanner = new Scanner(System.in);

try{
        System.out.printf("enter a name");
        String name = scanner.nextLine();
        System.out.printf("enter a lastname");
        String last = scanner.nextLine();
        System.out.printf("enter a age");
        int age = scanner.nextInt();
        System.out.printf("enter a hight");
        double height = scanner.nextDouble();
        System.out.printf("enter a weight");
        double weight = scanner.nextDouble();

        double BMI = weight / (height * height / 10000);
        String status;
        if (BMI <= 20) {
            System.out.println(  status = "weak");
        } else if (BMI <= 25) {
            System.out.println( status = "healty");
        } else if (BMI <= 30) {
            status = "fat";
        } else {

            status = "obaze";



        }

        System.out.println(name + " " + last + " is " + age + " years old " + " his is height " + height + " cm" + " his is weight is " +
                weight + " kg " + " he is "+status+"because his bmi " +BMI);
    }catch (InputMismatchException e){
    System.out.printf("please check to value"+e.getMessage());
    }
    }

}
