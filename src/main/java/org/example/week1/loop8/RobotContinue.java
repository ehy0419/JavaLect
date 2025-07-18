package org.example.week1.loop8;

public class RobotContinue {
    public static void main(String[] args) {

        int customers = 5;

        /// continue 문(건너뛰기 skip 버튼)
        // 활용: `for` 문 활용 + `continue`
        //
        //- `continue` 문은 건너뛰기(스킵) 버튼입니다.
        //- 특정 회차의 반복을 건너뛸때 사용됩니다.
        //- 2번째 손님에게 인사하고 싶지 않을때 `continue` 문을 활용할 수 있습니다.

        for (int i = 1; i <= customers; i++) {
            if (i == 4) {     // 4번째 손님에서 종료
                break;
            }
            if (i == 2) {
                continue; // (1) 반복을 건너 뜁니다.
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }
        System.out.println("반복문이 종료되었습니다.");
    }
}
