package Test_01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class gradeCalsulate {
    public static void main(String[] args) {
        /*
        write a program and calculate darde of three exams with the given value
        a==> 90-100 B==>80-89 c==>70-79 d==>60-69 f==>0-59

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a lesson");
        String Lesson =scan.next();
        System.out.println("enter a value of mark ");


        int exam=scan.nextInt();
        int exam1= scan.nextInt();

//1 way
        if(exam <=100 && exam>=90){
            System.out.printf(Lesson+" A ");

      }else if(exam>=80 && exam<=89){
          System.out.println(Lesson+" B");
      }else if (exam>=70&& exam<=79){
          System.out.printf(Lesson+" C");
      }else if(exam >=60&& exam<=69){
          System.out.printf(Lesson+" D");
      }else if(exam >=0&& exam<=59) {
          System.out.printf(Lesson + " F");
      }else {
          System.out.printf("please check a mark ");
      }
        System.out.printf("");

        //2 way
        System.out.println(exam1>=90 && exam1<=100 ?Lesson+" = A":exam1>=80 && exam1<=89 ?Lesson+ " = B":exam1>=70 && exam1<=79?Lesson+" = C":
                        exam1>=60 && exam1<=69?Lesson+" = D":exam1>=0 && exam1<=59 ?Lesson +" = F":"Wrong Mark");


      }
    }

