package main.java;

class Person {
    String name;
    int age;

    void learn() {
        System.out.println("공부를 합니다.");
    };

    void walk() {
        System.out.println("걷습니다.");
    };

    void eat() {
        System.out.println("밥을 먹습니다.");
    };
}

class Programmer extends Person { // Person 클래스로부터 상속
    String companyName;

    void coding() {
        System.out.println("코딩을 합니다.");
    }
}

class Dancer extends Person { // Person 클래스로부터 상속
    String groupName;

    void dancing() {
        System.out.println("춤을 춥니다.");
    }
}

class Singer extends Person {
    String bandName;

    void singing() {
        System.out.println("노래합니다.");
    }

    void playGuitar() {
        System.out.println("기타를 칩니다.");
    }
}

public class HelloJava {
    public static void main(String[] args) {

        // Person 객체 생성
        Person p = new Person();
        p.name = "김코딩";
        p.age = 24;
        p.learn();
        p.eat();
        p.walk();
        System.out.println(p.name);

        // Programmer 객체 생성
        Programmer pg = new Programmer();
        pg.name = "박해커";
        pg.age = 26;
        pg.learn(); // Person 클래스에서 상속 받아 사용가
        pg.coding(); // Programmer의 개별 기능
        System.out.println(pg.name);
    }
}
