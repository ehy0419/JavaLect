package org.example.week2.abstraction9.v2;

public class Cat extends Animal {

    ///  클래스 상속을 활용한 추상 계층 표현 - 3

    @Override
    public void makeSound() {
        System.out.println("야옹2");
    }

    // 고양이의 고유 기능
    public void scratch() {
        System.out.println("스크래치!");
    }
}
