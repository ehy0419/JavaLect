package org.example.week2.wrapperClass3;

public class Lect3 {
    public static void main(String[] args) {

        /// 학습 키워드
        //- [ ]  래퍼클래스
        //- [ ]  기본형 변수 - 실제 값을 저장하는 변수
        //- [ ]  참조형 변수 - 객체의 메모리 주소를 저장하는 변수
        //- [ ]  오토박싱 언박싱 - 래퍼형을 기본형으로 자동으로 변환해주는 기능


        ///  래퍼클래스(Wrapper Class)란?
        // 기본자료형을 객체로 감싸는 클래스
        //기본 자료형 (Primitive Type)   |	래퍼 클래스 (Wrapper Class)
        //byte                         |	Byte
        //short                        |	Short
        //int                          | 	Integer
        //long                         |	Long
        //float                        |	Float
        //double                       |	Double
        //char                         |	Character
        //boolean                      |	Boolean

        ///  기본형(Primitive Type)의 종류
        // 자료형	| 종류	|범위	                        |바이트	|비트
        // boolean	|논리형	|true/false	                    |1	    |8
        // char	    |문자형	|0 ~ 65535 유니코드 값	        |2	    |16
        // byte	    |정수형	|-128 ~ 127	                    |1	    |8
        // short	|정수형	|-32,768 ~ 32,767	            |2	    |16
        // int	    |정수형	|-2,147,483,648 ~ 2,147,483,647	|4	    |32
        // long	    |정수형	|-9,233,372,036,854,775,808 ~
        //                      9,233,372,036,854,775,807	|8	    |64
        // float	|실수형	|약 소수점 6~7자리까지	            |4	    |32
        // double	|실수형	|약 소수점 15~17자리까지	        |8	    |64

        ///  참조형(Reference Type)
        //- 변수에 객체가 담기면 해당 변수를 `참조형변수`라고 말합니다.
        //////- 참조형 변수는 데이터가 저장된 메모리 주소를 가리킵니다. → `Heap` 메모리 주소
        //- 객체 데이터는 `Heap` 영역에 저장되어 있기 때문입니다.
        //- `객체`, `배열`등이 참조형에 속합니다.

        // 기본형 변수
//        int a = 1;
//        System.out.println("a = " + a);

        // 참조형 변수
        Person personA = new Person();
        // Person 을 객체화(인스턴스화)하고, personA 라는 변수에 담아서.
        System.out.println("personA = " + personA);
        // personA = org.example.week2.wrapperClass3.Person@1be6f5c3 -> 메모리의 주소값 , heap에 저장된 데이터
        int[] arr = {1, 2, 3};
        System.out.println("arr = " + arr);
        // arr = [I@38af3868 -> 메모리의 주소값,

        // 래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        // 래퍼클래스도 객체
        // 래퍼클래스가 담겨 있는 변수도 참조형 변수
        // 하지만 출력시 메모리 주소값이 나오지 않는다.
//        Integer num = 100;
//        System.out.println("num = " + num);   // 출력 100
        //- 내부적으로`toString()`이 오버라이딩되어 있기 때문입니다.
        //- 오버라이딩 수업은 상속 수업에서 다룰 예정입니다.
        ///- 지금은 내부적으로 어떤 처리가 되어 있기 때문에 데이터가 직접 출력되는구나 정도로 이해하고 넘어가셔도 좋습니다.

        /// 래퍼클래스를 사용하는 이유
        //- 기본형은 객체처럼 속성, 기능을 가질 수 없습니다.
        //- 하지만 객체는 기능을 제공할 수 있습니다.
        //- 기본형을 감싼 객체를 만들어 기능을 제공하면 편리하게 데이터처리를 할 수 있습니다.

        Integer num = 123; // 래퍼클래스
        System.out.println("num = " + num);
        String str = num.toString(); // ✅ 편리한 기능
        // toString 정수형 데이터를 문자열 데이터로 변경해주는 기능

        int a = 100; // 그냥 데이터 100
//        String str = a.toString(); // ❌ 변환 불가

        // 직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(100);
        String myStrInteger = myInteger.toString();


        ///  오토박싱, 언박싱
        // 필요성
        //- 래퍼클래스 ↔ 기본형으로 형변환은 굉장히 자주 일어납니다.
        //- Java에서는 이 형변환 과정을 자동으로 지원해 줍니다.
        //Integer num3 = 10; // 오토박싱 (기본형을 자동으로 래퍼 클래스 객체로 변환)
        //int num = num3;   // 오토 언박싱(참조형을 자동으로 기본형으로 변환)

        ///  오토박싱(Auto-boxing)
        //**기본형 → 래퍼형으로 변환하는 과정을 오토박싱**
        //- `Integer`는 참조형(객체)이지만 기본형 `int` 값을 직접 대입할 수 있습니다.
        //- 내부적으로 컴파일러가 자동으로 `Integer.valueOf(10)`을 호출하여 객체를 생성하기 때문입니다.

//        Integer num3 = 10; // ✅ 오토박싱
        // ✅ 내부적 자동 처리(래퍼형 <- 기본형)
//        Integer num3 = Integer.valueOf(10);

        ///  오토 언박싱
        //**래퍼형 → 기본형으로 변환하는 과정으로 오토언박싱**
        //
        //- `num`은 `Integer` 객체(참조형변수)지만 기본형 `int` 변수에 대입할 수 있습니다.
        //- 내부적으로 컴파일러가 자동으로 `num.intValue()`를 호출하여 기본형으로 변환하기 때문입니다.

        Integer num3 = 10;
        int num4 = num3;   // ✅ 오토 언박싱
        // ✅ 내부적 자동처리(기본형 <- 래퍼형)
        int anum4 = num.intValue();


        ///  기본형과 래퍼형 성능 비교
        //**기본형 연산과 래퍼형 연산의 재밌는 성능 차이**
        //
        //- 래퍼형은 내부적으로 데이터를 감싸고 있기때문에 연산시 불리합니다.
        //- 객체에서 기본형 값을 꺼내서 연산하는 추가작업이 발생하기 때문입니다.
        //- 이런 추가 작업때문에 기본형보다 래퍼클래스는 연산 속도가 느립니다.
        //- 빠른 작업이 필요한 경우 기본형을 직접 활용하는 것이 좋은 선택입니다.
    }
}
