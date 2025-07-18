package org.example.week1.operator6;

public class Lect6 {
    public static void main(String[] args) {

        /// 학습 키워드
        //- [ ]  산술연산자(`+`, `-`, `*`, `/`, `%`)
        //- [ ]  대입연산자(`=`)
        //    - [ ]  복합대입연산자(`+=`, `-=`, `*=`, `/=` , `%=`)
        //- [ ]  증감연산자(`++`, `--`)
        //    - [ ]  전위 연산 - 사용 전 연산
        //    - [ ]  후위 연산 - 사용 후 연산
        //- [ ]  비교연산자(`==`, `!=`, `<`, `>`, `<=`, `>=`)
        //- [ ]  논리연산자(`!`, `&&`, `||`)
        //- [ ]  연산자우선순위
        //- [ ]  문자열비교(`equals()`)


        // a, b 변수 선언
        int a = 10;
        int b = 3;

        /// 기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum); // soutv

        int sub = a - b;
        System.out.println("sub = " + sub); // soutv

        int mul = a * b;
        System.out.println("mul = " + mul); // soutv

        /// 나눗셈
        // 정수끼리의 나눗셈은 소수점은 버림
        // 소수점을 유지하려면 소수점과 연산을 시켜야 한다.
        int div1 = a / b;
        System.out.println("div1 = " + div1); // ⚠️ 3 (소수점 버려짐)

        double div2 = a / 3.0;
        System.out.println("div2 = " + div2); // ✅ 3.333... (소수점 유지)

        /// 모듈러 연산자(나머지 연산) - %
        // 모듈러 연산자는 나머지를 구할 때 사용
        int mod1 = 10 % 3;
        System.out.println("mod1 = " + mod1); // 나머지 1

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2); // 나머지 3

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3); // 나머지 6

        /// 모듈러 연산자 활용 - 시간 연산
        // Q. 현재 시간이 10시 인데 5시간 후면 몇 시 일까?
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);  // (10 + 5) % 12 = 3

        /// 모듈러 연산자 활용 - 짝수 홀수 판별
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5); // 6 % 2 = 0; // 짝수
        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6); // 7 % 2 = 1; // 홀수


        /// 대입 연산자
        // 대입 연산자에는 대입 연산자와 복합 대입 연산자
        // 대입 연산자 = 는 변수에 값을 할당하는 데 사용
        // 연산자 중 제일 마지막에 수행된다.
        int num = 5;
        System.out.println("변수 num의 값: " + num); // 5

        /// 복합 대입 연산자(+= ,-= , *= , /= , %= )
        // += 은 항상 붙여쓰기
        // 복합 대입 연산자는 누적 값을 구할 때 활용

        // num 이 5 일 때, num +=3; 의 의미는 num = num + 3;
        // 오른쪽 부분 num + 3 이 먼저 연산되고 대입된다.
        // 대입 연산자는 제일 마지막에 수행

        // int num = 5;
        num += 3;  // num = num + 3;
        System.out.println("+= 결과: " + num); // 8

        num -= 2;  // num = num - 2;
        System.out.println("-= 결과: " + num); // 6

        num *= 2;  // num = num * 2;
        System.out.println("*= 결과: " + num); // 12

        num /= 3;  // num = num / 3;
        System.out.println("/= 결과: " + num); // 4

        num %= 3;  // num = num % 3;
        System.out.println("%= 결과: " + num); // 1

        /// 증감 연산자
        // 증감 연산자는 변수를 1 증가 (++) 또는 1 감소 (--) 시킬 때 사용되며 실무에서도 자주 활용

        num = 1;
        System.out.println("num = " + num); // 1

        num = 1;
        num++; // + 1 = 2
        num++; // + 1 = 3
        num--; // - 1 = 2
        num--; // - 1 = 1
        System.out.println("num: " + num);  // 1

        num++;  // 값을 1 증가 시킴 num = num + 1;
        System.out.println("num++ 실행 후: " + num);  // 2

        num--;  // 값을 1감소시킴 num = num - 1;
        System.out.println("num-- 실행 후: " + num);  // 1



        /// 전위 연산(++i) VS 후위 연산(i++)
        // 증감 연산자는 변수 앞(++i)에 위치하는지 뒤(i++)에 위치하는 지에 따라 실행 순서가 달라집니다.

        /// 전위 연산 (++!) - 연산 후 값이 활용됩니다.
        int intBox1 = 5;
        System.out.println("++intBox1: " + (++intBox1));  // 6 (먼저 증가 후 출력)
        System.out.println("현재 intBox1 값: " + intBox1);  // 6

        /// 후위 연산 (!++) - 값이 사용된 후 연산됩니다.
        int intBox2 = 5;
        System.out.println("intBox2++: " + (intBox2++));  // 5 (출력 후 증가)
        System.out.println("현재 intBox2 값: " + intBox2);  // 6


        /// 비교연산자
        // 두 값이 같은지 다른지 크거나 작은지 비교할 때 사용

        /// 같음연산자(==)
        // 두 값이 같으면 true , 다르면 false를 반환
        System.out.println("10 == 10: " + (10 == 10));  // true

        /// 다름연산자(!=)
        // 두 값이 다르면 true , 같으면 false를 반환
        System.out.println("10 != 10: " + (10 != 10));  // false
        System.out.println("10 != 5: " + (10 != 5)); // true

        /// 크기 비교 연산자(>, < ,<=,>=)
        //- 양쪽의 값을 비교했을때 논리에 맞으면 `true`를 반환
        //- 논리에 어긋나면 `false`를 반환합니다.
        System.out.println("10 < 5: " + (10 < 5)); // false
        System.out.println("10 >= 10: " + (10 >= 10)); // true
        System.out.println("10 <= 5: " + (10 <= 5)); // false

        // 비교 연산자 정리
        // 연산자	|설명	                    |예제	    |결과
        // ==	    |두 값이 같으면 true 	        |10 == 10	|true
        // != 	    |두 값이 다르면 true 	        |10 != 5	|true
        // > 	    |왼쪽 값이 크면 true 	        |10 > 5	    |true
        // < 	    |왼쪽 값이 작으면 true 	    |10 < 5	    |false
        // >=	    |왼쪽 값이 크거나 같으면 true 	|10 >= 10	|true
        // <= 	    |왼쪽 값이 작거나 같으면 true 	|10 <= 5	|false

        /// 논리연산자
        /// AND 연산자(&&)
        // AND 연산자(&&) 는 두 조건이 모두 참일 때 true 를 반환
        System.out.println("true && true: " + (true && true));  // true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false && false: " + (false && false)); // false

        int age1 = 20;
        boolean isStudent1 = true;
        System.out.println(age1 > 18 && isStudent1); // true

        /// OR 연산자(||)
        // OR 연산자(||) 둘 중 하나라도 참이면 true 를 반환
        // - OR연산자는 일반적인 키보드에서 `Enter` 키 위에 위치해있습니다.
        //- `Shift` + `\`를 누르면 `|`을 입력할 수 있습니다.
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || false: " + (false || false)); // false
        System.out.println("true || true: " + (true || true)); // true

        int age2 = 20;
        boolean isStudent2 = true;
        System.out.println(age2 > 18 || isStudent2); // true

        /// NOT 연산자(!)
        // NOT 연산자(! ) true 일때 false로,  false 일때  true 로 변경합니다.
        //`true` → `false`
        //`false` → `true`
        System.out.println("!true: " + (!true));  // false
        System.out.println("!false: " + (!false)); // true

        int age3 = 20;
        boolean isStudent3 = true;
        System.out.println(age3 > 18 && isStudent3); // true

        // 연산자 우선순위 - 우선순위가 헷갈리신다면 프로그래밍에서는 괄호 ()를 적극적으로 사용하는 것이 좋습니다.
        // 산술 연산자 우선순위
        System.out.println(10 - 3 * 2);
        // 실행 순서: 10 - (3 * 2)
        // → 10 - 6
        // → 4

        //기본 연산자 우선순위
        boolean flag = 10 + 5 > 12 && true;
        // boolean flag = ((10 + 5) > 12) && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        //비교 연산자와 산술 연산자의 우선순위
        System.out.println(10 - 3 > 5 + 1);
        // 실행 순서: (10 - 3) > (5 + 1) : 산술
        // → 7 > 6 : 비교
        // → true

        //논리 연산자 우선순위 (not > and > or) ( !  → && → || )
        boolean result1 = true || false && false;
        System.out.println("result1 = " + result1);

        boolean result2 = true || false && !false;
        System.out.println("result2 = " + result2);
        // 실행 순서: true || (false && false)
        // → true || false
        // → true

        System.out.println(10 / 2 + 3 * 2 > 10 || false);
        // 실행 순서: ((10 / 2) + (3 * 2)) > 10 || false
        // → (5 + 6) > 10 || false
        // → 11 > 10 || false
        // → true || false
        // → true

        System.out.println(5 + 3 > 2 * 4 && 10 % 3 == 1);
        // 실행 순서: (5 + 3) > (2 * 4) && (10 % 3) == 1
        // → 8 > 8 && 1 == 1
        // → false && true
        // → false

        // 문자열 비교에서는 항상 .equals() 활용할 것
        String text1 = "hello";
        String text2 = "Hello";
        // 나쁜예 : (text1 == text2)
        boolean isEqual1 = text1.equals(text2);
        System.out.println("text1과 text2가 같은가? " + isEqual1);

        String text3 = "Hello";
        String text4 = "Hello";
        // 나쁜예 : (text1 == text2)
        boolean isEqual2 = text3.equals(text4);
        System.out.println("text3과 text4가 같은가? " + isEqual2);

    }
}
