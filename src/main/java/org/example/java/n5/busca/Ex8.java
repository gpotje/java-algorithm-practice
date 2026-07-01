package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex8 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5}     ;

        System.out.println(findMinInSortedArray(numbers));

    }

    public static int  findMinInSortedArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(i + 1 < numbers.length){
                if (numbers[i] < numbers[i+1]) {
                    return numbers[i];
                }
            }
        }
        return  -1;
    }

}
