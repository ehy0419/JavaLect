package org.example.week2.abstraction9.v1;

public class Cat implements Animal {

    /// 인터페이스 상속를 활용한 추상 계층 표현  - 3

    // lifeform 인터페이스
    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다.");
    }

    // animal 인터페이스
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    // 고양이의 고유 기능
    public void scratch() {
        System.out.println("스크래치");
    }


}
