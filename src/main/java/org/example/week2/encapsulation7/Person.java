package org.example.week2.encapsulation7;

public class Person {

    ///  속생기
    /// 접근 제어자 실습 환경 - 주석

    // 속성
///    private String name;
///    private String secret;

    private String name;
    private String secret;

    // 생성자
///    public Person() {}
// Person 으로 접근제어자 명시하지 않으면 default(같은 패키지 내부에 적용)
//    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    // 기능
///    public void methodA()
///    private void methodB() {}

    public void methodA() {}
    public void methodB() {}

    // 게터
    public String getName() {
        return name;
        // 객체의 name 속성 반환
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
}
