package org.example.java.n3.metodos;

// Return true if a string is a palindrome.
public class Ex8 {
    public static void main(String[] args) {

       String text = "ana";

        System.out.println(isPalindrome(text));

    }

    public static boolean isPalindrome(String text){
       int left = 0;
       int right = text.length() - 1;

       while(left < right){
           char right1 = text.charAt(right);
           char left2 =text.charAt(left);
           if(text.charAt(right) != text.charAt(left) ){
               return false;
           }
           left++;
           right--;
       }

        return true;
    }



}
