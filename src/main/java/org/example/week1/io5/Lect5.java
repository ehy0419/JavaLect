package org.example.week1.io5;

import java.util.Scanner;

public class Lect5 {
    public static void main(String[] args) {

        /// 학습 키워드
        //- [ ]  입력 - 입력하는 방법
        //    - [ ]  Scanner 객체
        //- [ ]  출력 - 출력하는 방법
        //    - [ ]  System.out.println();
        //    - [ ]  System.out.print();
        //- [ ]  개행문자(\n) - 줄바꿈을 의미하는 문자
        
        /// 출력 (output)
        // 출력이란 컴퓨터가 결과를 콘솔(화면)에 보여주는 것을 말한다.
        // 아래 코드를 실행하면 컴퓨터가 “안녕하세요!” 라고 우리에게 말해주는 것처럼 생각하면 됩니다.
        // System.out.println("안녕하세요!");

        /// print vs println
        /// println
        // println 출력 후 자동으로 줄 바꿈
        System.out.println("Hello");    // System 은 출력을 도와주는 객체
        System.out.println("Java");
        // 출력결과
        // Hello
        // Java

        /// print
        // print 줄바꿈 없이 출력 :
        System.out.print("안녕");
        System.out.print("자바");
        // 출력결과
        // 안녕자바

        /// 개행문자 \n
        // 개행문자는 줄바꿈을 의미하는 문자
        // 개행문자를 출력하면 줄바꿈 기능을 수행한다.
        // 개행문자의 \ 는 enter 키 원화표시 키
        System.out.println("Hello\nWorld!");
        // 출력결과
        // Hello
        // World!

        /// 출력 방법 정리
        // 출력 방법	            |설명
        // System.out.print()	|줄 바꿈 없이 출력
        // System.out.println()	|출력 후 줄 바꿈

        // 참고
        // System.out.println("Hello Java!"); // ‼️ System 도 객체

        /// 입력 (input)
        Scanner scanner = new Scanner(System.in);   //System.in 문법 외우면 좋아요
        // Scanner(자료형) scanner(변수 이름) = new Scanner(System.in); (새로운 객체 소환)
        // 스캐너 객체를 스캐너형 박스(scanner)에 넣었다

        // 정수형 데이터를 정수형 박스(a)에 넣었다
        // int a = 1;

        // 문자열 입력 받기
        System.out.print("좋아하는 문장을 입력하세요:" );
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence); // soutv 입력하면 System.out.println("sentence = " + sentence);

        // 정수형(int, long) 입력 받기
        System.out.print("정수(int)를 입력하세요:" );
        int intbox = scanner.nextInt();
        System.out.println("intbox = " + intbox); // soutv 입력하면 System.out.println("intbox = " + intbox);

        System.out.print("정수(long)를 입력하세요:" );
        long longbox = scanner.nextLong();
        System.out.println("longbox = " + longbox); // soutv 입력하면 System.out.println("longbox = " + longbox);

        // 소수점 (double 써서 float은 생략)
        System.out.print("소수(double)를 입력하세요:" );
        double doublebox = scanner.nextDouble();
        System.out.println("doublebox = " + doublebox);


        System.out.println("입력한 정수: " + intbox);
        System.out.println("입력한 큰 정수: " + longbox);
        System.out.println("입력한 실수: " + doublebox);  // 소수점

    }
}
