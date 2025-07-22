package org.example.week2.final5;

public final class CircleCapsule {
    // ✅ 클래스에 final 선언 (상속 방지)

    private static final double PI = 3.14159; // ✅ 상수는 private static final로 선언
    private final double radius; // ✅ 필드를 private final로 선언하여 완전한 불변성 유지

    public Circle(double radius) { // ✅ 생성자는 public으로 유지
        this.radius = radius;
    }

    public double getRadius() { // ✅ public 메서드로 변경
        return radius;
    }

    public double getArea() { // ✅ public 메서드로 변경
        return PI * radius * radius;
    }

    public double getPerimeter() { // ✅ public 메서드로 변경
        return 2 * PI * radius;
    }
}
