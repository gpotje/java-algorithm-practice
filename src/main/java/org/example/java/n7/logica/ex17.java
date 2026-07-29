package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex17 {
    public static void main(String[] args) {
        List<String> l1 = List.of("A", "B", "C");
        List<String> l2 = List.of("1", "2", "3");
        System.out.println(mergeAlternating(l1,l2));
    }

    public static List<String> mergeAlternating(List<String> l1, List<String> l2){

        if(l1.isEmpty() && !l2.isEmpty()){
            return l2;
        }
        if(l2.isEmpty() && !l1.isEmpty()){
            return l1;
        }

        if(l1.size() >= l2.size()){
            return ifL1BiggestOrIgualThanL2(l1,l2);
        }else{
            return ifL1SmallestThanL2(l1,l2);
        }

    }


    public static List<String> ifL1BiggestOrIgualThanL2(List<String> biggestList, List<String> smallestList){

        int count = 0;
        List<String> newList = new ArrayList<>();

        for (int i = 0; i <= biggestList.size() -1; i++ ){
            newList.add(biggestList.get(i));
            if(count < smallestList.size()){
                newList.add(smallestList.get(count));
                count++;
            }
        }
        return newList;
    }

    public static List<String> ifL1SmallestThanL2(List<String> l1, List<String> l2){

        int count = 0;
        List<String> newList = new ArrayList<>();

        for (int i = 0; i <= l2.size() -1; i++ ){
            if(count < l1.size()){
                newList.add(l1.get(count));
                count++;
            }
            newList.add(l2.get(i));
        }
        return newList;
    }

}
