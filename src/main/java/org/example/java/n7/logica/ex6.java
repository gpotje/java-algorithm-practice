package org.example.java.n7.logica;

public class ex6 {
    public static void main(String[] args) {
        String t1 = "aabbbccddddde";

        System.out.println(longestSequence(t1));
    }

    public static int   longestSequence(String t1){

        if(t1.isEmpty()){
            return 0;
        }

       int count = 0 ;
       int longestSequence = 0;

       for(int i = 0; i < t1.length()-1 ;i++){
           if(t1.charAt(i) == t1.charAt(i+1)){
               count ++;
           }else{
               count ++;
               if(longestSequence < count){
                   longestSequence = count;
               }
               count = 0 ;
           }
       }
        return longestSequence  == 0 ? count + 1 : longestSequence;
    }
}
