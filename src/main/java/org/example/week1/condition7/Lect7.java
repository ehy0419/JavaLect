package org.example.week1.condition7;

public class Lect7 {
    public static void main(String[] args) {

        /// 학습 키워드
        //- [ ]  if - 조건 수식이 참일 때 실행
        //- [ ]  if-else - 조건 수식이 거짓일 때 실행
        //- [ ]  else-if - 여러 개의 조건수식을 제어할 때 활용
        //- [ ]  switch - 특정 값에 따라 여러 동작을 실행

        // 조건문
        // 컴퓨터가 마주할 조건들을 미리 정의해 놓는다면 프로그램을 조건에 맞게 동작시킬 수 있다.

        // 신호등
        // 초록불 - 출발 / 노란불 - 주의 / 빨간불 - 정지

        // 조건문의 구조
        // 조건 수식 부분이 참(true) 혹은 거짓(false) 에 따라 명령문이 실행될지 결정됩니다.

        ///  if 문 구조
        //  if (조건수식) {
        //	    명령문; // 실행할까? 말까 ?
        //  }

        // 참일 경우 명령문 실행
        //  if (1 < 2) { // true
        //	    명령문; // ✅
        //  }

        // 거짓일 경우 명령문 실행하지 않음
        //  if (2 < 1) { // false
        //	    명령문; // ❌
        //  }

        /// if, else if, else 조건문
        /// if 문
        // if 문 = 조건이 참일 때만 실행된다.
        // if 문을 만나면 조건을 먼저 확인하고 결과에 따라 실행할 코드가 결정된다.

        // if 문 구조
        //  if (조건수식,조건문) {
        //      명령문; // 실행할까? 말까 ?
        //  }

//        if (true) {
//            System.out.println("실행됩니다1.");
//        }
//        System.out.println("if 문 작동 후");
//
//        if ( 1 < 2 ) {
//            System.out.println("실행됩니다2.");
//        }
//        System.out.println("1 < 2 비교 후");
//
//        if ( 2< 1 ) {
//            System.out.println("실행됩니다3.");
//        }
//        System.out.println("2< 1 비교 후");


        ///  if 문 실행 순서
//        String light1 = "초록불"; // (1)
//
//        // (2) 만약 light 가 "초록불" 문자열과 같다면?
//        if (light1.equals("초록불")) {

        //if (light1 == "초록불") {} - 문자열 데이터에는 == 사용 X 대신에
        //if (light1.equals("초록불")  문자열 데이터에는 .equals()

//            System.out.println("건너세요!"); // (3) 실행
//        }
//        // (4) 무조건 실행
//        System.out.println(".....");

        /// 조건이 참일때 if(true) 실행 순서
        //(1) light 변수 저장
        //(2)조건 확인
        //(3) true 면 실행
        //(4) 다음 코드 진행

        /// 조건이 거짓일때 if(false) 실행 순서
        // (1) light 변수 저장
        // (2)조건 확인
        // (4) 다음 코드 진행


        /// 상황. 초록불이 아닐때는 어떻게 제어해야 할까요?
        //- `if` 문 밖에서 제어를 하려고 하면 “초록불” 일 경우에도 “멈추세요!” 문자열이 출력됩니다.
        //- 아닌 조건을 제어할 때는 `if-else` 문을 활용합니다.



        /// if - else 문 - 조건이 거짓일 때 처리
        // 예시에서 초록불이 아닐 때 멈춰야 한다.

        String lightG = "초록불"; // (1)

        // (2) 만약 light 가 "초록불" 문자열과 같다면?
        if (lightG.equals("초록불")) {
            System.out.println("건너세요!"); // (3) 실행(초록불일때)
        } else {
            System.out.println("멈추세요!"); // (4) 실행(초록불이 아닐 때)
        }
        // (5) 다음 코드 실행(무조건 실행)

        ///  조건이 참일 때 if(true) 실행 순서
        //(1) light 변수 저장
        //(2)조건 확인
        //(3) true 면 실행
        //(5) 다음 코드 진행


        String lightY = "노란불"; // (1)

        // (2) 만약 light 가 "초록불" 문자열과 같다면?
        if (lightY.equals("초록불")) {
            System.out.println("건너세요!"); // (3) 실행(초록불일때)
        } else {
            System.out.println("멈추세요!"); // (4) 실행(초록불이 아닐 때)
        }
        // (5) 다음 코드 실행(무조건 실행)

        /// 조건이 거짓 일때 if(false) 실행 순서
        //(1) light 변수 저장
        //(2)조건 확인
        //(4) false 면 진행
        //(5) 다음 코드 진행

        /// else if 문  의 필요성 제기
        //하지만 현재 코드는 노란불일때도 **“멈추세요!”** 문자열이 출력됩니다.
        //여러가지 상태(조건) 에 따라 명령문을 실행해야 한다면 `else if` 문을 활용

        /// else if 문
        // 여러 개의 조건을 처리해야 할 때 사용하는 문법

        String light2 = "초록불";               // (1)

        if (light2.equals("초록불")) {          // (2)
            System.out.println("건너세요!");    // (3)

        } else if (light2.equals("노란불")) {   // (4)          // else 문에는 조건문 없음
            System.out.println("주의하세요!");   // (5)

        } else {
            System.out.println("멈추세요!");    // (6)
        }

        // (7) 다음코드 진행

        /// 상황별
        //🟢 light 가 “초록불” 일때 실행 흐름
        //(1) light 변수 저장
        //(2) 조건 확인
        //(3) "건너세요!" 출력
        //(7) 다음코드 진행

        //🟡 light 가 “노란불” 일때 실행 흐름
        //String light = "노란불";               // (1)
        //(1) light 변수 저장
        //(2) 조건 확인
        //(4) 조건 확인
        //(5) "주의하세요!" 출력
        //(7) 다음 코드 진행

        //🔴light 가 “빨간불” 일때 실행 흐름
        //String light = "빨간불";               // (1)
        //(1) light 변수 저장
        //(2) 조건 확인
        //(4) 조건 확인
        //(6) "멈추세요!" 출력
        //(7) 다음 코드 진행

        //"파란불" 일 때는 else 문으로 진행



        /// switch 문
        // switch 문은 값에 따라 여러 동작을 실행

        /// switch 문 구조
        // 괄호안에 단일값만 들어갈 수 있습니다
        // 조건식은 사용할 수 없습니다.
        // break 는 탈출 버튼!
//        switch (단일값) {
//            case 값1:
//                // 값1일 때 실행할 코드
//                break;
//            case 값2:
//                // 값2일 때 실행할 코드
//                break;
//            default:
//                // 위의 값들과 일치하지 않을 때 실행할 코드
//        }


        int number = 2;
        // switch 문에서는 먼저 단일값을 정해줘야 한다.

        switch (number) {
            case 1:
                System.out.println("1 입니다.");
                break;
                // fall-thrugh 현상 주의 : break 문을 스위치에서 사용하지 않으면 다음 case 가 실행됩니다.
                // int number = 2; 이라면 case 1; 은 스킵
            case 2:
                System.out.println("2 입니다.");
                break;
            default:
                System.out.println("1 도 아니고 2도 아닙니다.");

        }
    }
}
