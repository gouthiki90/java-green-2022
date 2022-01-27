package ex22.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 6. ArrayList로또 2개 만들어서 비교해보기

        List<Integer> lotto1 = Arrays.asList(1, 3, 4, 5, 6, 7, 10);
        ArrayList<Integer> lotto2 = new ArrayList<>();

        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(6);
        lotto2.add(7);
        lotto2.add(10);

        int failCeck = 0;
        final int LOTTOCYCLE = lotto1.size(); // final이 붙은 변수는 대문자로 적는다. 상수라는 뜻이다.

        for (int i = 0; i < LOTTOCYCLE; i++) { // 메소드를 넣으면 반복될 때마다 메소드 호출이 되기 때문에 상수로 지정해서 넣는 게 좋다. 동적으로 데이터 들어감.
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println(i + "번지 비교 성공");
            } else {
                System.out.println(failCeck++ + "번 실패");
            }
        }

        if (failCeck == 0) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
