package org.example.week2.interface6;

public class LuxuryCar implements Car {
    // 인터페이스 구현 방법
    // 알트 엔터

    @Override
    public void drive() { // ✅ 인터페이스 규칙 준수
        System.out.println("멋지게 이동합니다."); // 구현 내용은 자유롭습니다.
    }

    @Override
    public void stop() { // ✅ 인터페이스 규칙 준수
        System.out.println("멋지게 정지합니다."); // 구현 내용은 자유롭습니다.
    }

    void charge() { // 🎉 CarA 만의 기능을 확장 가능합니다.
        System.out.println("차량을 충전합니다");
    }

//    void move() {
//        System.out.println("멋지게 이동합니다.");
//    }
//
//    void stop() {
//        System.out.println("멋지게 정지합니다.");
//    }

}
