package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex29 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 2, 2, 3, 4, 4));

        System.out.println(reverseBlocks(numbers));
    }

    public static List<Integer> reverseBlocks(List<Integer> numbers) {
        List<Integer> listFinal = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            listFinal.add(numbers.get(i));
        }

        return listFinal;
    }

}