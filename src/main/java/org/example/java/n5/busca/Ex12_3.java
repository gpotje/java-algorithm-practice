package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
class BinarySearchResult {
    private boolean exist;
    private int steps;

    public BinarySearchResult(int steps, boolean exist) {
        this.steps = steps;
        this.exist = exist;
    }

    public boolean isExist() {
        return exist;
    }

    public int getSteps() {
        return steps;
    }
}

public class Ex12_3 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 10, 15, 21, 30, 42};

        BinarySearchResult rs = binarySearch(numbers, 9);

        System.out.println("was it finding ? "+rs.isExist());
        System.out.println("how much steps it was needing ? "+rs.getSteps());

    }

    public static BinarySearchResult binarySearch(int[] numbers,int target) {
        int left = 0;
        int right = numbers.length - 1;
        int steps = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            steps ++;
            if (target < numbers[mid]) {
                right = mid - 1;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                return new BinarySearchResult(steps,true);
            }
        }

        return new BinarySearchResult(steps,false);
    }
}
