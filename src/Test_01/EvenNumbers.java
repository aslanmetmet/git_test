package Test_01;

public class EvenNumbers {
    public static void main(String[] args) {
        /* print even numbers from 100 to 0 but don`t use decrement (i--)

         */

        for(int i=100; i>=0;i-=2){

                System.out.print(i+" ");


        }
        System.out.println();
        int i=102;
        while(i>=2){
            i-=2;
            System.out.print(i+" ");
        }


    }
}
