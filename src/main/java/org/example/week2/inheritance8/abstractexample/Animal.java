package org.example.week2.inheritance8.abstractexample;

// 추상 클래스 선언
abstract class Animal {

    public String name; // ✅ 변수선언가능

    abstract void eat(); // ⚠️ 추상메서드: 상속 받은 자식은 강제 구현해야합니다.

    public void sleep() { // ✅ 자식클래스에서 재사용가능합니다.
        System.out.println("쿨쿨");
    }
}
