package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 30;
        int x = Integer.MAX_VALUE;
        int y = x + 1;

        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        //1) применить несколько арифметических операций над int и double в одном выражении
        int summa = a + b;
        int diff = a - b;
        int mul = a * b;
        double summ1 = a + c;
        double diff1 = c - b;
        System.out.println(summa);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(summ1);
        System.out.println(diff1);

        //2) применить несколько логических операций ( < , >, >=, <= )
        if (a > b) {
            System.out.println("Победа!");
        }

        if (a < b) {
            System.out.println("Еще одна победа!");
        }

        if (a == b) {
            System.out.println("Ничья!");
        } else {
            System.out.println("Судья!");
        }

        //Переполнение
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}