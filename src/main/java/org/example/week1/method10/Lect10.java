package org.example.week1.method10;

public class Lect10 {
    public static void main(String[] args) {

        /// 학습 키워드
        //- [ ]  메서드(method) - 함수, 기능
        //          메서드의 호출부와 선언부의 차이 학습
        //- [ ]  매개변수 - 호출부에서 선언부로 데이터를 넘겨줄때 활용
        //- [ ]  return - 반환데이터가 있을때 명시하는 키워드
        //- [ ]  void - 반환값이 없을때 활용하는 반환자료형

        ///  메서드(method): 작업단위를 표현하는 방법
        // 메서드 는 작업을 표현하는 방법
        //- 함수, 기능이라고도 합니다.
        //- 여러 개의 작은 명령문을 한곳에 모아 사용하는 단위를 `메서드` 라고 합니다.
        //- 생각해 보면 프로그램에게 커피를 마셔라! 라고 알려주는 것은 굉장히 어려운 일입니다.

        ///  예시 커피를 마시는 작업
        //커피마시기()
        //{
        //	1. 컵을 준비한다;
        //	2. 컵에 커피를 따른다;
        //	3. 컵에 담긴 커피를 마신다;
        //}

        ///  메서드가 필요한 이유
        // 메서드가 없다면
        //- 모든 일련의 작업들을 한 줄 한 줄로 표현해 줘야 합니다.
        //- 만약 기능 3을 수정해야한다면 해당 코드를 일일이 찾아 수정해야하는 문제가 발생합니다.
        //- 하지만 기능 3을 메서드로 분리하면 코드가 더 명확해지고 유지 보수가 쉬워집니다.

        // 기능 1: 더하기
        int a = 10;
        int b = 2;
        int result1 = a + b;
        System.out.println("더하기 결과: " + result1);

        // 기능 2: 빼기
        int c = 2;
        int d = 1;
        int result2 = c - d;
        System.out.println("빼기 결과: " + result2);

        // 기능 3: 구구단 기능
        // ...
        // ...
        // 기능 200


        /// 메서드 살펴보기
        /// 메서드 구조
        // 메서드는 항상 클래스 내부에 존재한다.
        //public class 클래스이름 {
        //
        //		[반환자료형] [메서드이름](매개변수..) {
        //				작업 명령문들...
        //		}
        //}

        ///  메서드의 흐름
        //- 메서드(함수, 기능)는 `호출부`, `선언부`로 나누어집니다.
        //- 호출부 - 메서드를 사용하는 곳
        //- 선언부 - 메서드가 정의되어 있는 곳
        //- 호출부 `매개변수`를 활용해 메서드 연산에 필요한 데이터를 전달할 수 있습니다.


        ///  지역변수의 개념
        //- 각 메서드는 자신만의 영역을 가지고 있습니다.
        //- 영역은 중괄호 `{}` 로 표현합니다.
        //- 중괄호 안에 선언된 변수는 중괄호 안에서만 생존할 수 있습니다.

        /// 선언부(메서드가 정의되어 있는곳) - Calculator.java
        /// 호출부(메서드를 호출하는 쪽) - Main.java

        ///  void
        // void 는 반환 값이 없을 때
        // 반환 데이터가 없는 메서드
        // - 메서드가 데이터를 꼭 반환해야하는 건 아닙니다.
        //- 반환 데이터가 없을때는 반환자료형 위치에 `void` 를 선언해 주면 됩니다.
        //- `void` 는 “비어있다” 의미를 가지고 있습니다.

        ///  void Calculator 클래스
//        public class Calculator {
//
//            // ✅ void 로 반환 데이터가 없다는 것을 표시
//            void sum(int value1, value2) {
//                int result = value1 + value2;
//                System.out.println("계산결과는 " + result + "입니다.");
//            }
//        }

        ///  void Main 클래스
//        public class Main {
//
//            public static void main(String[] args {
//                Calculator calculator = new Calculator();
//                calculator.sum(1, 2); // ✅ 반환데이터가 없기때문에 받아서 처리하지 않아도 됩니다.
//            }
//        }


        ///  return
        // return 은 반환 값이 있을 때
        // 반환 데이터가 있는 메서드
        //- `return` 키워드를 활용해 반환되는 데이터를 표현할 수 있습니다.
        //- 반환된 데이터는 호출부에서 받아서 활용할 수 있습니다.

        ///  return Calculator 클래스
//        public class Calculator {
//
//            int sum(int value1, value2) {
//                int result = value1 + value2;
//                return result; // ✅ result 가 반환됩니다.
//            }
//        }

        ///  return Main 클래스
//        public class Main {
//
//            public static void main(String[] args {
//                Calculator calculator = new Calculator();
//                int result = calculator.sum(1, 2); // ✅ 반환된 데이터를 result 변수에 담아 사용
//                System.out.println("계산결과는 " + result + "입니다.");
//            }
//        }

    }
}
