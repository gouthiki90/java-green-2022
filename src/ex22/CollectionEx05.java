package ex22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CollectionEx05 {
    public static void main(String[] args) {
        /**
         * 1. 6개의 로또 번호를 정한다.
         * 2. ArrayList에 담는다.
         * 3. 스캐너로 금액을 입력 받는다. ex) 5000원이면 5회
         * 4. 입력 받은 금액에 따라 arraylist에 hasgset으로 로또 번호 넣고 돌릴 수만큼 넣기
         * 5. 1, 2 비교해서 당첨됐는 지 확인해서 출력하기
         * 비교할 때 데이터는 정렬해서 비교하기
         */

        // arraylist 정렬

        // ArrayList<Integer> lotto = new ArrayList<Integer>();

        // lotto.add(3);
        // lotto.add(5);
        // lotto.add(30);
        // lotto.add(40);
        // lotto.add(41);
        // lotto.add(42);
        // 로또 번호 정함

        // Set<Integer> lottoSave = new HashSet<Integer>();
        // ArrayList<Set<Integer>> lottoNumbering = new ArrayList<Set<Integer>>();

        // Random r = new Random();

        // while(true){
        // int n = r.nextInt(45) + 1;
        // lottoNumbering.add(n);

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            List<Integer> lottoNumbering = new ArrayList<Integer>();
        }

        // while (true) {
        // int n = r.nextInt(45) + 1;
        // // n 값을 array에 저장
        // lottoNumbering.add(n);

        // if (lottoNumbering.size() == 6)
        // break;
        // }
        // System.out.println(lottoNumbering);
    }
}
