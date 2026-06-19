package org.example.java.n3.metodos;

// Return true if a string is a palindrome.
public class Ex9 {
    public static void main(String[] args) {

       int numbers [] = {} ;

        System.out.println(findSmallest(numbers));

    }

    public static int findSmallest(int[] numbers){

        if(numbers.length <= 0){
            throw  new IllegalArgumentException("Array can't be empty");
        }

       int SmallestNumber = numbers[0];

      for(int i = 0; i <= numbers.length - 1 ; i ++){
          if(SmallestNumber > numbers[i]  ){
              SmallestNumber  = numbers[i];
          }
      }

        return SmallestNumber;
    }
}
