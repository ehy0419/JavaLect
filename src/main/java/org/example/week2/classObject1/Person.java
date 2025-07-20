package org.example.week2.classObject1;

public class Person {
    //         클래스

    /// 1. 속성 - 변수 선언으로 표현할 수 있습니다
    // 이름
    String name;
    // 나이
    int age;
    // 주소
    String address;

    /// 2. 생성자
    // 기본 생성자 Person() {}
    // 기본 생성자는 자동추가, 하지만 보이지 않는다
    // 새로운 생성자를 만들면 기본 생성자는 사라진다.

    ///  생성자 특징
    // 반환 자료형이 없다
    // 클래스명과 이름이 같다
    // 여러 개가 존재할 수 있다.

    Person(String name, int age) {
        // Person 이름
        this.name = name;
        this.age = age;

        // 여기에서 다루는 변수의 개수는 총 5개
        // 1. 속성에 있는 이름, 나이, 주소 - 3개
        // 2. 생성자 특징에 있는 String name, int age - 2개

        // 그리고 1. 속성에 있는 String name 은 생성자 특징에 있는 this.name
        // 1. 속성에 있는 int age 은 생성자 특징에 있는 this.age 와 연결되며,
        // 생성자 특징에 있는 Person(String name, int age) 에서 String name은 바로 아래 name;
        // 또한 int age는 바로 아래 age;와 연결

        ///  this 키워드
        // this 는 객체 자신을 가리키는 키워드
        // 현재 실행 중인 객체를 의미한다

    }

    /// 3. 기능(메서드)
    // 객체의 기능을 나열하는 곳
    //- 기능은 `메서드` 로 표현합니다.
    //- 상상하는 모든 기능을 구현할 수 있습니다.
    //→ 자기소개, 더하기, 걷기 기능 등
    //- 하지만 클래스와 관련된 기능을 작성하는 것이 좋습니다.
    //- 메서드를 활용하는 것이 객체의 기능을 활용하는 것입니다.

    // ✅ 사람의 소개 기능
    void introduce() {
        System.out.println("안녕하세요.");
        System.out.println("나의 이름은 " + this.name + "입니다.");
        System.out.println("나이는 " + this.age + "입니다.");
    }

    // person의 더하기 기능(1)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // person의 더하기 기능(2)
//    int sum(int a, int b) {
//        int result = a + b;
//        return result;
//    }

    /// 게터(gettter) - 속성을 가져오는 기능
    // 게터(getter) 란 클래스의 속성을 가져올 때 사용되는 기능을 의미합니다.

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getAddress() {
        return this.address;
    }

    /// 세터(setter) - 속성을 설정해주는 기능
    // 세터(Settter) 란 객체의 속성을 외부에서 설정할 수 있게 해주는 기능입니다.

    void getName(String name) {
        this.name = name;
    }

    void getAge(int age) {
        this.age = age;
    }

    void setAddress(String address) {
        this.address = address;
    }

}
