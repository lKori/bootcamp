package main.java;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요.");
        String str1 = scan.nextLine();
        System.out.println("사칙연산자를 입력하세요.");
        String op = scan.nextLine();
        System.out.println("두번째 숫자를 입력하세요.");
        String str2 = scan.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = 0;

        if(op.equals("+")) {
            result = num1 + num2;
        } else if(op.equals("-")) {
            result = num1 - num2;
        } else if(op.equals("*")) {
            result = num1 * num2;
        } else if(op.equals("/")) {
            result = num1 / num2;
        }

        System.out.println(str1 + op + str2 + "=" + result);
    }
}
