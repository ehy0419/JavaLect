package org.example.week1.loop8;

public class RobotBreak {
    public static void main(String[] args) {

        // for 문 활용
        // 로봇 클래스를 통해 인사를 손님들에게 자동으로 시키기
        int customers = 5;

//        for (int i = 1; i <= customers; i++) {
//            System.out.println(i + "번째 손님, 안녕하세요!");
//        }

        /// break 문 (탈출 버튼)과 함께 사용
        // 활용: `for` 문 활용 + `break`
        //
        //- `break` 문은 탈출 버튼이라고 생각하시면 됩니다.
        //- 반복을 벗어나야할때 사용합니다.
        //- 손님이 아무리 많이 오더라도 3명의 손님까지만 환대할 예정입니다.
        //- 이런 경우 `break` 문을 활용해 반복을 벗어날 수 있습니다.

        for (int i = 1; i <= customers; i++) {
            if (i == 4) {
                break; // (1) 반복을 벗어납니다.
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }
        System.out.println("반복문이 종료되었습니다.");

        //- `i == 4` 일 때 `break`  가 진행되므로 4번째 손님부터는 출력되지 않습니다.
        //- 1번째, 2번째, 3번째 손님에게만 인사 후 반복문을 빠져나오게 됩니다.

    }
}
