package org.example.week1.basic1_3; // 클래스 파일이 포함된 패키지

import org.example.MyNewClassTest;
import org.example.week1.MyNewClass;

public class Lect3 {
    public static void main(String[] args) {

        //// 학습 키워드
        //- [ ]  카멜케이스(camelCase)
        //- [ ]  스네이크케이스(snake_case)
        //- [ ]  패키지(폴더)
        //- [ ]  클래스(파일)

        /// 이름 규칙 종류
        // 카멜케이스(camelCase) - 대문자가 혹처럼 튀어나옵니다
        // firstName, lastName, fullName
        // 스네이크케이스(snake_case)
        // first_name, last_name, full_name

        /// 패키지
        // 패키지는 파일들의 묶음, 관련된 자바 클래스들을 그룹으로 묶는 기능
        // 폴더처럼 파일(클래스)을 정리해서 관리할 수 있도록 도와주는 역할

        /// 패키지 이름 규칙
        // 자바에서 패키지명은 소문자 만을 권장
        // 규칙	            |  나쁜 예시	                |  좋은 예시
        // 소문자만 활용(권장)	|  ⚠️chapTer1	            |  ✅chapter1
        // 숫자로 시작 금지	|  ❌1chapter	            |  ✅chapter1
        // 특수문자 사용 금지	|  ❌chapter#1 	            |  ✅chapter1
        // 예약어 사용 금지	|  ❌class, ❌public, ❌static

        // 패키지는 소문자로 작성

        // 패키지의 계층구조
        // 점을 이용해서 표현해준다.
        // 첫번째 줄 package org.example.week1 와 같이 . 점을 이용해서 표현.

        /// 클래스
        // 자바 프로젝트에서는 클래스 이름이 곧 파일명이 된다.
        // Main.java 파일 안에는 Main 이라는 클래스가 존재한다.

        new MyNewClass(); // 같은 패키지에 있어서 import 없음
        new MyNewClassTest(); // 다른 패키지에 있어서 import 생성

        // import는 위 상단에 표시
        // 임포트(`import`)
        //`MyNewClassTest` 클래스를 프로그램 시작 지점(Lect3 클래스)에서 활용할 때 사용되는 클래스가 어느 패키지에 속한 클래스인지 명시해 줍니다.
        // 이 작업이 필요한 이유는 하나의 프로젝트 안에서 동일한 이름을 가진 클래스가 존재할 수 있기 때문입니다.

        ///  클래스 이름 규칙
        // 클래스 작성 할 때는 첫 글자는 대문자로 하고, 카멜 케이스 조합으로 작성해줍니다 이를 파스칼 케이스라고 합니다.
        // 규칙	            |   나쁜 예시	                |   좋은 예시
        // 대문자로 시작	    |❌ myNewClass	                |   ✅MyNewClass
        // 카멜케이스	        |❌ My_new_class	            |   ✅MyNewClass
        // 숫자로 시작 금지	|❌ 1MyNewClass	                |   ✅MyNewClass
        // 특수문자 사용 금지	|❌ My#New#Class	            |   ✅MyNewClass
        // 예약어 사용 금지	|❌ Class, ❌ Public, ❌ Static


    }
}
