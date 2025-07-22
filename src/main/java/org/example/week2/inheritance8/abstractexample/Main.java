package org.example.week2.inheritance8.abstractexample;

public class Main {
    public static void main(String[] args) {

        // Animal 은 추상 클래스는 인스턴스화 할 수 없다
        //        new Animal() {};


        Cat cat = new Cat();

        cat.name = "cat";
        cat.sleep();

        // 자식 cat에서 강제 구현된 메서드
        cat.eat();

    }
}
