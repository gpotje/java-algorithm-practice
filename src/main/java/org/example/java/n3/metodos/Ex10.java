package org.example.java.n3.metodos;

// Count how many times a value appears in an array.
public class Ex10 {
    public static void main(String[] args) {

       int numbers [] = {5,5,5,5} ;

        System.out.println(countOccurrences(numbers,7));

    }

    public static int countOccurrences(int[] numbers, int value){

        if(numbers.length <= 0){
            throw  new IllegalArgumentException("Array can't be empty");
        }

       int countOccurrences = 0;

      for(int i = 0; i <= numbers.length - 1 ; i ++){
          if(numbers[i] == value){
              countOccurrences++;
          }
      }

        return countOccurrences;
    }
}
