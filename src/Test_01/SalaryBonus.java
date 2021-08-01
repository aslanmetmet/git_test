package Test_01;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        /*
        A company decided to give bonus of %5 to employes  if his /her year of service is more than or 10
        ask user  for ther salary and year  of service and print net nonus amount
        Example input = 4 year service
        Salary 4000
         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter a year ");
        int year = scanner.nextInt();

        System.out.println("please enter a amount of salsry");
        int sl= scanner.nextInt();

        if(year>=5){
            System.out.println("Oooo! I won  %5 bonus: "+sl*5/100);
        }else {
            System.out.println("noooo! i need  "+(10-year));
        }



    }
}
