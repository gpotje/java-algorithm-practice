package org.example.java.n7.logica;

public class ex8 {
    public static void main(String[] args) {
        String t1 = "";
        String t2 = "";

        //System.out.println( t2.length());
        System.out.println(isRotation(t1,t2));
    }

    public static boolean isRotation(String t1, String t2){
        if(t1.length() != t2.length()){return false;}

        if(t1.equals(t2)){return true;}

        int size = t2.length();
        for(int i = 0; i < size; i++ ){
            String newString = t2.substring(1,size) + t2.charAt(0);
            System.out.println(newString); //debug para ver quantas vezes houve a troca
            if(t1.equals(newString)){
                return true;
            }
            t2 = newString;
        }
        return false;
    }
}
