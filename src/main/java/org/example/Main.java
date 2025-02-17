package org.example;

public class Main {
    public static void main(String[] args) {
            int a = 10;
            int b = 20;
            double c = 30;
            int g = -2147483648;
            int l = 2147483647;



            int summ = a + b;
            int diff = a - b;
            int mul = a * b;
            double summ1 = a + c;
            double diff1 = c - b;
            System.out.println(summ);
            System.out.println(diff);
            System.out.println(mul);
            System.out.println(summ1);
            System.out.println(diff1);

            if (a > b) {
                System.out.println("Победа!");
            }

            if (a < b) {
                System.out.println("Еще одна победа!");
            }

            if (a == b) {
                System.out.println("Ничья!");
            }else {
                System.out.println("Судья!");
            }

            System.out.println(g*1);

            System.out.println(l*1);
    }
}