package org.example.week2.jvm_memory2;

public class Person {

        // 1. 속성
        String name;
        int age;
        String address;

        // 2. 생성자
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 3-1. 소개 기능(이름 나이 출력 기능)
        void introduce() {
            System.out.println("나의 이름은");
            System.out.println(this.name + "입니다.");
            System.out.println("나의 나이는");
            System.out.println(this.age + "입니다.");
        }

        // 3-2. 더하기 기능(소개를 하고 더하기 연산 수행)
        int sum(int value1, int value2) {
            introduce();
            int result = value1 + value2;
            return result;
        }

}
