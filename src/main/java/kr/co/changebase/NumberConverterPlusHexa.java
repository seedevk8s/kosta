package kr.co.changebase;

import java.util.Scanner;

public class NumberConverterPlusHexa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int number = scanner.nextInt();

        System.out.println("10진수: " + number);
        System.out.println("8진수: " + convertToBase(number, 8));
        System.out.println("2진수: " + convertToBase(number, 2));
        System.out.println("16진수: " + convertToBase(number, 16));

        scanner.close();
    }

    /*
     이 코드는 주어진 숫자를 특정 진법의 문자열로 변환하는 작업을 수행합니다.

1. `StringBuilder result = new StringBuilder();`: `StringBuilder` 객체를 생성하여 변환된 문자열을 저장합니다. `StringBuilder`는 문자열을 효율적으로 조작할 수 있는 클래스입니다.

2. `while (number > 0) { ... }`: 주어진 숫자가 0보다 클 동안 반복문을 실행합니다. 이 반복문은 주어진 숫자를 주어진 진법으로 나누는 과정을 반복하여 숫자를 해당 진법의 문자열로 변환합니다.

3. `result.insert(0, chars.charAt(number % base));`: 주어진 숫자를 주어진 진법으로 나눈 나머지를 구하고, 이를 `chars` 문자열의 인덱스로 사용하여 해당하는 문자를 가져옵니다. 이 문자는 `result`의 맨 앞에 삽입됩니다.

4. `number /= base;`: 주어진 숫자를 주어진 진법으로 나눕니다. 이 연산은 주어진 숫자를 다음 반복에서 처리할 수 있도록 줄입니다.

따라서, 이 코드는 주어진 숫자를 주어진 진법의 문자열로 변환하는 작업을 수행합니다. 예를 들어, 숫자 255와 진법 16이 주어지면 이 코드는 "FF"라는 결과를 생성합니다.* 
     */
    public static String convertToBase(int number, int base) {
        String chars = "0123456789ABCDEF";
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.insert(0, chars.charAt(number % base));
            number /= base;
        }

        return result.toString();
    }
}
