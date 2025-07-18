package org.example.week1.method10;

public class Main {
    public static void main(String[] args) {

        /// 호출부 - Main.java
        // 메서드를 호출하는 쪽

        // 호출부 란 메서드를 활용하고 있는 곳

        // 1. 객체를 객체화 (소환, 인스턴스화)
        // new Calculator 에서 new는 메서드 Calculator를 객체화 시킨다.
        // 그리고 앞 항에서 Calculator 라는 클래스(자료형)를 사용하기 위해서 calculator라는 변수에 담아준다.

        // ✅ Calculator 객체 소환
        Calculator calculator = new Calculator();
        // [정수형] 상자 = 정수
        // int      a   = 1;

        // 2. 메서드(함수)를 호출
//        calculator.sum()
//        calculator.sum(); // 세미콜론
//        calculator.sum(1,2); // 메서드의 매개변수 개수, 정수형 데이터

        // 3. 메서드의 값을 받는 방법
        int a = calculator.sum(1,2);

        int result = calculator.sum(1, 2); // ✅ 호출부
        System.out.println("결과: " + result);

    }
}
