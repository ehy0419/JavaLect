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
        //- 참조형 변수는 데이터가 저장된 메모리 주소를 가리킵니다. → `Heap` 메모리 주소
        //- 객체 데이터는 `Heap` 영역에 저장되어 있기 때문입니다.
        //- `객체`, `배열`등이 참조형에 속합니다.
    }
}
