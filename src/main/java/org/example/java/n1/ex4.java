package org.example.java.n1;

public class ex4 {
    public static void main(String[] args) {

        int numbers[] = {5, 8, 2, 10, 15, 3};
        int number = 99;
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] == number){
                System.out.println("Number found");
                System.out.println("Position: "+i);
                return;
            }
        }
        System.out.println("Number not found");
    }
}
