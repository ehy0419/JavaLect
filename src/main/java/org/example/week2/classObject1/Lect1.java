package org.example.week2.classObject1;

public class Lect1 {
    public static void main(String[] args) {

        /// 학습 키워드
        //- [ ]  클래스(class) - 객체의 설계도
        //- [ ]  객체(object) - 클래스를 통해 만들어진 실제 존재
        //- [ ]  인스턴스화(instantiate) - 객체를 만드는 과정
        //- [ ]  속성(property, field) - 객체의 속성
        //- [ ]  생성자(constructor) -  조립설명서
        //- [ ]  기능(method) - 기능

        /// 클래스(class)란? - 객체를 만들 때 필요한 청사진
        // 지금까지 클래스를 파일처럼 활용해 왔다
        // 하지만 java 에서 클래스는 객체를 만들 때 필요한 청사진 설계도 입니다.
        // 클래스의 첫 글자는 대문자

        /// 객체(object)란?
        // 객체란 실제로 존재하는 것
        // 예를 들어 컴퓨터, 계산기, 자동차 같은 사물
        // 또한 어떤 개념이나 논리 도 객체가 될 수 있다.
        // 클래스(설계도)가 있다면 클래스를 기준으로 여러 객체들을 만들어 낼 수 있다.

        /// Person.class - 사람이라는 객체를 만들면서 살펴보면,
        //- 클래스는 객체를 만들기 위한 설계도입니다.
        //- `Person` 클래스는 사람 객체를 만들기 위한 설계도입니다.
        //- 객체를 만들때 `new` 라는 키워드를 사용합니다.
        //- 객체를 만드는 과정을 `인스턴스화, 객체화` 라고 표현합니다.
        //- 인스턴스화가 되면 Java 메모리 상에 객체가 만들어집니다.

//        Person personA = new Person(); // ✅ 첫번째 객체 생성
//        Person personB = new Person(); // ✅ 두번째 객체 생성

        ///  클래스의 구조 속성, 생성자, 기능 (속생기)
        //  class 클래스 {
        //  1. 속성
        //  2. 생성자
        //  3. 기능
        //  }

        ///  1. 속성(property, field)
        //- 객체는 속성(특징)을 작성하는 곳입니다.
        //- 객체를 생성해야 속성에 접근할 수 있습니다.
        //- 이 속성들은 변수로 표현합니다.
        //- 프로퍼티(property), 필드(field)라고도 합니다.
        //- 사람의 속성을 예로 들면 나이, 이름, 주소 등이 해당합니다.

        /// 속성에 접근해보기
        //- 객체를 통해 속성에 접근할 때 `객체가담긴변수.속성`  으로 접근합니다.
        //- 객체마다 속성 값이 다를 수 있습니다.

        // 1. 객체 생성
        Person personA = new Person(); // ✅ 첫번째 객체 생성
        Person personB = new Person(); // ✅ 두번째 객체 생성

        // 2. ✅ 객체를 통해 접근 personA 의 name
        System.out.println(personA.name);

        // 3. ✅ 객체를 통해 접근 personB 의 name
        System.out.println(personB.name);


        ///  2. 생성자(constructor) - 조립설명서
    }

}
