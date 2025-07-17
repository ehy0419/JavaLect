package org.example.week1.variable4;

public class Main {
    public static void main(String[] args) { // 프로그램의 시작점

        /// 변수 구조 : [자료형] 한 칸 띄어쓰기 [변수이름] [세미콜론];

        /// 정수형
        byte byteBox = 1;
        byteBox = 2;
        System.out.println("byteBox = " + byteBox);  // byteBox = 2

        short shortBox = 1;
        shortBox = 2;
        System.out.println("shortBox = " + shortBox); // shortBox = 2

        int intBox = 1;
        intBox = 2;
        System.out.println("intBox = " + intBox); // intBox = 2
        // soutv 을 하면 값을 자동으로 출력

//        int a = 1;
//        a = 1;
//        a = 2;
//        System.out.println("a = " + a); // a = 2

        // 큰 정수형
        long longBox = 1234567890;
        longBox = 12345678;
        System.out.println("longBox = " + longBox);

        /// 논리형
        boolean booleanBox = true;   // 변수이름을 box라고 표현을 하니 Box
        booleanBox = false;             // 재할당, 여기를 없애면 값은 참
        System.out.println("booleanBox = " + booleanBox);
        // soutv 을 하면 값을 자동으로 출력

        /// 문자형
        // 문자 데이터는 '' 작은따옴표로 표시
        char charBox = 'a';     // charBox 에 a 값을 할당
        charBox = 'b';          // charBox 에 b 값을 재할당
        System.out.println("charBox = " + charBox);


        /// 실수형 * 꼭 뒤에 f 를 붙여줘야합니다.
        // float 자료형을 double 자료형으로 인식시키지 않기 위해서.
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f;
        System.out.println("floatBox = " + floatBox);

        double doubleBox = 0.12345678901234567;
        doubleBox = 0.123456789012345678;
        System.out.println("doubleBox = " + doubleBox);


        ///  형변환(casting)
        // 형변환 : 변수의 자료형을 다른 자료형으로 변경하는 것.
        // 종류 : 다운캐스티, 업캐스팅

        // 형 변환 종류	            |형변환 방식	        |자동 형 변환 여부	    |설명
        // 다운캐스팅(DownCasting)	|명시적(Explicit)	|❌	                |큰상자 → 작은상자
        // 업캐스팅(UpCasting)	    |묵시적(Implicit)	|✅	                |작은상자 → 큰상자

        /// 다운캐스팅
        // 다운캐스팅 : 큰 데이터를 -> 작은 상자
        double bigBox = 10.123;
        int smallBox = (int) bigBox;  // ✅ int <- double 명시적 변환 ()
        System.out.println("smallBox = " + smallBox); // ✅ 출력: 10 !데이터손실발생!

        /// 업캐스팅
        // 업캐스팅 : 작은 데이터 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2;   // ✅ double <- int 자동형 변환
        System.out.println("bigBox2 = " + bigBox2); // ✅ 출력: 10.0

        /// 문자열 데이터 - 실무에서 활용되는 변수 종류
//        String stringBox = "문자열을 표현할 수 있습니다.";
//        문자열의 자료형의 첫글자는 대문자입니다.
//        쌍따옴표(””) 문자열 데이터를 나타낼 수 있습니다.

        /// 문자 vs 문자열
        // char a1 = 'a';              // 문자 데이터에서 '' 작은 따옴표
        // String str = "안녕하세요!";  // 문자열에서는 "" 작은 따옴표, 문자열 자료형의 첫 글자는 대문자.

        // 정수형
        // int intBox = 1;
        // long longBox = 1;

        // 논리형
        // boolean booleanBox = false;

        ///  주의할 것 {}
        // 같은 이름을 가진 변수를 같은 중괄호{} 안에 생성할 수 없다.
//        ❌ 같은 중괄호{} 안에서 불가능
//        {
//            int number = 10;
//            int number = 20;  // 오류! 같은 블록에서 같은 이름의 변수 선언 불가
//        }
//
//        ✅ 해결 방법: 변수명을 다르게 하거나, 값을 바꿀 때는 =를 사용!
//                {
//        int number = 10;
//        number = 20; // 올바른 코드 (값만 변경)

        ///  주의할 것
//        String name = 'Steve';
//                String 문자열 자료형 변수에는 쌍따옴표 "" 를 값에 사용해야합니다.
//                답> String name = "Steve";
//
//        boolean isAvailable = "true";
//                boolean 은 “true” 문자열 데이터를 저장할 수 없습니다.(쌍따옴표는 문자열)
//                답> boolean isAvailable = true;
//
//        char grade = 'AB';
//                char 캐릭터 자료형 변수에는 문자 하나만 저장할 수 있습니다.
//                답> char grade = 'A'
    }
}

