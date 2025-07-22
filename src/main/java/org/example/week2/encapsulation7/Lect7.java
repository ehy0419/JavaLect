package org.example.week2.encapsulation7;

public class Lect7 {
    public static void main(String[] args) {

        ///  학습 키워드
        //- [ ]  캡슐화 - 캡슐처럼 데이터를 보호하는 개념
        //- [ ]  정보은닉 - 객체 내부데이터를 숨기는 개념
        //- [ ]  접근제어자 - 클래스, 변수, 메서드의 접근 범위를 제어하는 기술
        //- [ ]  무분별한 세터 - 의미있게 세터를 활용하는 방법

        /// 캡슐화(Encapsulation)란?
        //- 객체의 정보를 외부에서 직접 접근하지 못하게 **보호하는 개념**입니다.
        //- 캡슐처럼 감싸서 내부를 보호하고 외부로부터 내용물을 숨기고 있는 모습에서 유래됐습니다.
        //- 클래스 혹은 객체의 캡슐화는 `접근제어자` 를 통해서 구현할 수 있습니다.

        ///  캡슐화가 필요한 이유
        // - 예를 들어, 누군가가 여러분의 이름이나 나이를 마음대로 변경할 수 있다면 어떨까요?
        //- 가문의 비밀처럼 외부에 노출하고 싶지 않은 정보가 있을 수도 있습니다.
        //- 캡슐화를 통해 이러한 정보를 보호하고 필요한 경우에만 안전하게 접근할 수 있도록 합니다.
        //- 캡슐화를 구현하기 위해서는 `접근제어자` 를 이해해야합니다.

        /// 접근제어자(Access Modifier)
        //- 접근제어자는 클래스, 변수, 메서드, 생성자의 접근 범위를 제한하는 키워드입니다.
        //- 캡슐화 구현을 위해 사용됩니다.

        /// 종류
        //접근제어자	    |클래스 내부	|패키지 내부	|상속한 클래스	|전체 공개
        //**public	    |✅	        |✅	        |✅	            |✅
        //protected	    |✅	        |✅	        |✅	            |❌
        //default	    |✅	        |✅	        |❌	            |❌
        //**private	    |✅	        |❌	        |❌	            |❌

        // public 어디서든 접근 가능
        // protected 상속한 클래스
        // default 같은 패키지 내부
        // private 같은 클래스 내부

        ///  접근제어자 활용 예시(public, private)

        // 인스턴스화
        Person person = new Person("훈영");  // 생성자 호출(public)
                                        // private 로 하면 호출 x

        // 인스턴스 변수 접근
//        person.name = "훈영";        // 어디서든 접근 가능
//        person.secret = "??";       // 같은 클래스 내부에서 접근 가능

        // 인스턴스 메서드 접근
        person.methodA();             // 접근가능 메서드가 public
//        person.methodB();             // 접근불가능 메서드가 private


        /// 데이터 접근 -  게터(Getter)와 세터(Setter)
        // 캡슐화가 된 데이터에 접근 방법
        //- 캡슐화가 잘 적용된 클래스는 내부 데이터를 `private` 으로 보호하고 있습니다.
        //- 데이터 조회나 변경이 필요한 경우 안전한 접근방법이 필요합니다.
        //- 그 역할을 수행하는 `메서드`가 바로 `게터(Getter)`와 `세터(Setter)` 입니다.

        /// 게터(Getter) 활용법
        // - 데이터를 안전하게 접근하기 위해 사용됩니다.
        String name = person.getName();
        System.out.println("name = " + name);
        
        /// 세터(Setter) 활용법
        // - 데이터를 안전하게 설정/변경하기 위해 사용됩니다.
        person.setName("hee");
        String name2 = person.getName();
        System.out.println("name = " + name2);
    }
}
