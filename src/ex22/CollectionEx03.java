package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        // 0~44 = 45, index number
        Random r = new Random(); // 로또 몇 개 사면

        Set<Integer> lotto = new HashSet<Integer>();

        while (true) {
            int n = r.nextInt(45) + 1;
            // HashSet에 n값을 add해서 저장
            lotto.add(n);
            if (lotto.size() == 6) {
                // HashSet 데이터 크기가 6이 되면 break
                break;
            }
        }
        System.out.println(lotto);
        // HashSet 데이터 출력
    }
}
