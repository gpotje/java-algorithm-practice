package org.example.java.n7.logica;

public class ex4 {
    public static void main(String[] args) {
        String t1 = "z";

        System.out.println(firstUnique(t1));
    }

    public static char firstUnique(String t1){

        int size = t1.length() - 1;

        for(int i = 0; i <= size; i++){
            boolean exist = false;
            for(int j = size; j >= 0 ; j--){
                if(t1.charAt(i) == t1.charAt(j) && i != j){
                    exist = true;
                    break;
                }
            }
            if(exist == false){
                return t1.charAt(i);
            }
        }
        return '\0';
    }
}
