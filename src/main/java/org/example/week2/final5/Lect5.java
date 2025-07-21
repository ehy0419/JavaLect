package org.example.week2.final5;

public class Lect5 {

    public static void main(String[] args) {

        ///  학습 키워드
        //- [ ]  final - 값 변경 불가 또는 참조 변경 불가를 의미
        //- [ ]  상수 - 변하지 않는 값, `static final`로 선언하여 재사용
        //- [ ]  불변객체 - 내부 상태가 절대 변경되지 않는 객체

        ///  final 의 용도
        // - 변수에서 final
        // 1. 변수는 변경이 불가능하게 만듭니다.
        //변수에 final 을 붙이면 변수를 한 번만 설정할 수 있다

        // 표준적인 변수 사용법
//        int a = 1;
//        a = 2;
//        System.out.println("a = " + a);
//
         // final 활용 방법
//        final int b = 100;
//        b = 200; // ❌ 오류 발생!

        // - 클래스에서 final
        // 2. 클래스는 상속할 수 없게 만듭니다.
        //final 로 선언된 클래스는 상속할 수 없습니다.(상속은 추후에 학습합니다.)

//        final class Animal {
//            void sound() {
//                System.out.println("Animal sound!");
//            }
//        }
//        // class Dog extends Animal {} // ❌ 오류! final 클래스는 상속할 수 없음

        // - 메서드에서 final
        // 3. 메서드는 수정할 수 없게 만듭니다.(오버라이딩 불가)
        //final 로 선언된 메서드는 오버라이딩 할 수 없습니다. (오버라이딩은 추후에 학습합니다.)

//        class Parent {
//            final void show() {
//                System.out.println("Hello from Parent");
//            }
//        }
//
//        class Child extends Parent {
//
//            @Override
//            void show() { // ❌ 오류! final 메서드를 재정의할 수 없음
//                System.out.println("Hello from Child");
//            }
//        }


        ///  상수(Constant)
        //- `상수`는 변하지 않고 항상 일정한 값을 갖는 수 입니다.
        //- Java에서 상수는 **대문자로 표현하는 것이 관례**입니다.
        //- 프로그램 실행중에 절대 변경되서는 안되기 때문에 `static final` 키워드를 사용해 선언합니다.
        //- `static` 으로 선언된 변수는 프로그램 시작시 한 번만 초기화되고 모든 인스턴스에서 같은 값을 공유합니다.

        // 대표적인 상수 : PI(원주율)
        //원의 넓이, 둘레를 구할 때 공통으로 사용되는 값입니다.(변경되면 안 됨)

//        public class Circle {
//
//            final static double PI = 3.14159; // ✅ 상수 선언
//        }
//        // 클래스 변수는 클래스 레벨에서 인스턴스 생성 없이 바로 접근해서 활용할 수 있다
//        System.out.println("상수활용: " + Circle.PI);

        ///  static 으로 선언하는 이유
        //- 보통 상수는 여러 곳에서 값을 공유해 쓰일 목적으로 활용됩니다.
        //- 인스턴스 변수를 `static` 없이 선언할 경우 인스턴스마다 `PI` 값이 중복 저장됩니다.
        //final double PI = 3.14159;         - X
        //final static double PI = 3.14159;  - O


        // 상수 활용 방법
        System.out.println("상수 활용: " + Circle.PI);
    }
}
