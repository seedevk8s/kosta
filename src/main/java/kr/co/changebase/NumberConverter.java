package kr.co.changebase;

import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int number = scanner.nextInt();

        System.out.println("10진수: " + number);
        System.out.println("8진수: " + convertToBase(number, 8));
        System.out.println("2진수: " + convertToBase(number, 2));

        scanner.close();
    }

    public static String convertToBase(int number, int base) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.insert(0, number % base);
            number /= base;
        }

        return result.toString();
    }
}
