package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Программа решает квадратное уравнение ax^2 + bx + c = 0");

        System.out.println("Введите число a:");
        double a = scan.nextDouble();

        System.out.println("Введите число b:");
        double b = scan.nextDouble();

        System.out.println("Введите число c:");
        double c = scan.nextDouble();

        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("Корни уравнения: x1 = " + x1 + ",x2 = " + x2);

        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень x = " + x);
        } else {
            System.out.println("Уравнение не имеет решений");

        }
    }
}










