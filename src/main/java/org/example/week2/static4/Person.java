package org.example.week2.static4;

public class Person {

    // 인스턴스 변수
    String name;

    // ✅ static 변수
    static int population = 0; // 클래스 변수 (모든 객체가 공유)

    Person() {
        population++;   // 생성자 호출시 static 변수에서 populataion 1 증가
    }

    // 인스턴스 메서드
    void printName() { // ✅ 인스턴스 메서드
        System.out.println("나의 이름은 " + this.name + "입니다.");
    }

    // ✅ static 메서드
    static void printPopulation() {  // 클래스 메서드
        System.out.println("현재 인구 수: " + population);
    }
}
