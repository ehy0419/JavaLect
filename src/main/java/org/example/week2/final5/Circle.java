package org.example.week2.final5;

public class Circle {

    // 속성
    final static double PI = 3.14159;

    /// 잘못된 불변객체 사용
    //- `final` 은 참조 변경을 막지만 내부상태 변경은 막지 않습니다.
//    double radius; // ⚠️ final 로 선언되어 있지 않기 때문에 외부에서 변경 가능

    /// 올바른 불변 객체 활용
    // - 속성을 `final` 로 선언해 줍니다.
    final double radius; // ✅ final 로 선언해서 값이 변경되지 않도록 합니다.

    // 생성자
    Circle(double radius)  {
        this.radius = radius;
    }

    // 기능
    Circle changeRadius(double newRadius) {
        return new Circle(newRadius);
    }
}
