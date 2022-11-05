package main.java;

public class StaticTest {
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println("인스턴스 변수: " + staticExample.num1); // 인스턴스 생성 후 인스턴스명.변수명 으로 사용 가능
        System.out.println("클래스 변수: " + StaticExample.num2); // 인스턴스 생성 없이 클래스명.변수명 으로 사용가능
    }
}

class StaticExample {
    int num1 = 10;
    static int num2 = -10;
}
