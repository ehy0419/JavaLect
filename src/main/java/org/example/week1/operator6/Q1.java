package org.example.week1.operator6;

public class Q1 {
    public static void main(String[] args) {

        // Q1. 산술 연산자 문제
        // 두 개의 정수 a 와 b 가  주어졌을 때 두 수의 합, 차, 곱, 나누기 그리고 나머지(%모듈러) 연산 결과를 변수에 저장한 후 출력하는 프로그램을 작성하세요.
        int a; // 값 할당 필요
        a = 15;
        int b; // 값 할당 필요
        b = 4;

        int sum = a + b;// 더하기
        System.out.println("sum = " + sum);// 더하기 결과 출력
        int difference = a - b;// 빼기
        System.out.println("difference = " + difference);// 빼기 결과 출력
        int product = a * b;// 곱셈
        System.out.println("product = " + product);// 곱셈 결과 출력
        int quotient = a / b;// 나눗셈
        System.out.println("quotient = " + quotient);// 나눗셈 결과 출력
        int remainder = a % b;//나머지 모듈러
        System.out.println("remainder = " + remainder);//나머지 모듈러 결과 출력

    }
}
