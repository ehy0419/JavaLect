package org.example.week2.inheritance8;

public class Child extends Parent {

    public String familyName = "Lee";

    public Child() {
        super(); // ✅ (1)부모클래스 생성자를 먼저 호출
        // 추가로직은 여기에 작성, super 아래에
    }

    public void superTest() {
        System.out.println("우리 " + this.familyName + " 가문은 ...");
        System.out.println("원래 가문의 이름은 " + super.familyName);
    }

    // ✅ 부모에는 없지만 자식에만 있는 기능
    public void showSocialMedia() {
        System.out.println("우리 가문은 이제 SNS도 합니다. 팔로우 부탁드려요!");
    }

    @Override
    public void introduceFamily() { // ✅ 자식클래스에서 재정의
        System.out.println("오버라이드");
    }

}
