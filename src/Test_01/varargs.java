package Test_01;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(4 ,7));
        System.out.println();
    }
   // public static  int add(){
    //    return 3+5;

    //}
    public  static int add(int ...a){
        int sum=0;
        for(int w:a){
            sum=sum+w;

        }
        return sum;
    }
}
