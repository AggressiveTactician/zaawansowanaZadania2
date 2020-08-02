package zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setLiczba1(scanner.nextInt());
        kalkulator.setLiczba2(scanner.nextInt());
        String sign = scanner.next();
        for (Dzialania value : Dzialania.values()) {
            if (value.getSign().equals(sign)) {
                kalkulator.setTyp(value);
            }
        }
        System.out.println(kalkulator.obliczenia());
    }
}
