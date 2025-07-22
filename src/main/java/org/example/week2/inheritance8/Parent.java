package org.example.week2.inheritance8;

public class Parent {

    // 속성
    // 인스턴스 변수
    public String familyName = "스파르탄";
    public int honor = 10;

    public Parent() {}  // ✅ 부모 생성자

    // 기능
    // 인스턴스 메서드
    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + " 가문은 대대로 명성을 이어온...");
    }
}
