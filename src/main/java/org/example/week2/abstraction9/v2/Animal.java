package org.example.week2.abstraction9.v2;

public class Animal extends LifeForm {

    ///  클래스 상속을 활용한 추상 계층 표현 - 2

    public void makeSound() {
        System.out.println("동물은 소리를 냅니다");
        // ✅ 공통: 모든 생명체는 성장한다.
    }
}
