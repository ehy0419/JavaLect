package org.example.week1.operator6;

public class Q2_1 {
    public static void main(String[] args) {

        // Q2. 비교 연산자
        // 두 개의 정수 `x`와 `y`가 주어졌을 때,
        //- `x`가 `y`보다 큰지 (`>`)
        //- `x`가 `y`보다 작은지 (`<`)
        //- `x`와 `y`가 같은지 (`==`)
        //- `x`와 `y`가 다르면 (`!=`)각각의 결과를 변수에 저장하고 출력하는 프로그램을 작성하세요.

        int x = 10;
        x = 10;
        int y = 20;
        y = 15;

        boolean isGreater = x > y;
        boolean isLess = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x가 y보다 큰가? = " + isGreater); //false
        System.out.println("x가 y보다 작은가? = " + isLess); //true
        System.out.println("x와 y가 같은가? = " + isEqual); //false
        System.out.println("x와 y가 다른가? = " + isNotEqual); //true
    }
}
