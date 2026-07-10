package org.example.java.n7.logica;

public class ex5 {
    public static void main(String[] args) {
        String t1 = "a";

        System.out.println(isPalindrome(t1));
    }

    public static boolean  isPalindrome(String t1){
        int left = t1.length() - 1;
        int right = 0 ;

          while (right < left){
              if(t1.charAt(left) != t1.charAt(right) ){
                    return false;
              }
              right ++;
              left --;
          }

        return true;
    }
}
