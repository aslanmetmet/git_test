package Test_01;

import java.util.ArrayList;

public class $_08_01 {

    //Write a function to check whether a string is pangram or not assuming that the string passed in does not have any punctuation.
    // Pangrams are words or sentences containing every letter of the alphabet at least once.

    static boolean isPangram(String str) {
        str = str.replace(" ", "").toLowerCase();
        ArrayList<Character> a1 = new ArrayList<>();

        for (int i=0; i < str.length(); i++){
            char each=str.charAt(i);
           // if(!a1.contains(each)&& each>=65 &&each<=90){
          //  if(!a1.contains(each)&& each>='A' &&each<='Z'){
            if(!a1.contains(each)&&Character.isLetter(each)){


                a1.add(each);

            }
             return  a1.size()==26;
    }
 return false;
}
    public static void main(String[] args) {
        System.out.println(isPangram("the quick brown fox jumps over the lazy dog "));
    }

}
