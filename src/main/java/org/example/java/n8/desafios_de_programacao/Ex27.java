package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

class Number{
    private Integer value;
    private Integer count;

    public Number(Integer value, Integer count) {
        this.value = value;
        this.count = count;
    }

    public Number() {
    }

    @Override
    public String toString() {
        return value+"x"+count;
    }
}

public class Ex27 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 2, 1, 1);

        System.out.println(compress(numbers));
    }

    public static List<String> compress(List<Integer> numbers){

        List<Number> numbersList = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                count++;
            } else {
                numbersList.add(new Number(numbers.get(i), count));
                count = 1;
            }
        }
        numbersList.add(
                new Number(numbers.get(numbers.size() - 1), count)
        );

        return  numbersToList(numbersList);
    }

    public static List<String> numbersToList(List<Number> numbers){
        List<String> s = new ArrayList<>();
        for (Number i : numbers){
            s.add(i.toString());
        }
        return s;
    }
}
