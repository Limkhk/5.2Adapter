package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация
        System.out.println(calc.sum(10,6));
        System.out.println(calc.mult(10,6));
        System.out.println(calc.pow(10,6));
    }
}