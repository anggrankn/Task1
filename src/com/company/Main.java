package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double side = readSide();
        displayArea(side);
    }

    static double readSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение длины стороны квадрата: ");
        return scanner.nextDouble();
    }

    static void displayArea(double side) {
        System.out.printf("Площадь заштрихованной части фигуры равна: %.3f", getPictureArea(side));
    }

    static double getPictureArea(double side) {
        return (getSquireArea(side) - getCircleArea(side)) / 4 + getSquireArea(side / 2);
    }

    static double getSquireArea(double side) {
        return side * side;
    }

    static double getCircleArea(double side) {
        return Math.PI * side / 2 * side / 2;
    }
}