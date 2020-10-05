package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double side = enterSide();
        conclusionArea(side);
    }

    static double enterSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение длины стороны квадрата: ");
        return scanner.nextDouble();
    }

    static void conclusionArea(double side) {
        System.out.printf("Площадь заштрихованной части фигуры равна: %.3f", pictureArea(side));
    }

    static double pictureArea(double side) {
        return (squireArea(side) - circleArea(side)) / 4 + squireArea(side / 2);
    }

    static double squireArea(double side) {
        return side * side;
    }

    static double circleArea(double side) {
        return Math.PI * side / 2 * side / 2;
    }
}