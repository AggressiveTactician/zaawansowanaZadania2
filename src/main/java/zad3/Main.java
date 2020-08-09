package zad3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> numbersSet = new HashSet<>();
        while (numbersSet.size() < 10) {
            numbersSet.add((int) (Math.random() * 20) + 1);
        }
        numbersSet.forEach(element -> {
            System.out.println(element);
        });
    }
}